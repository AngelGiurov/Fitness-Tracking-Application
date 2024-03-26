package com.fitnesstrackingapplication.config;

import lombok.RequiredArgsConstructor;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import javax.sql.DataSource;


@Configuration("flyway_config")
@RequiredArgsConstructor
public class FlywayConfig {

    private static final String DEFAULT_SCHEMA_LOCATION = "db/migration";


    @Value("${DATABASE}")
    private String database;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    private static final String SCHEMA_NAME = "user_fitness_tracking_application";


    public DataSource buildDataSource() {
        return DataSourceBuilder.create()
                .url(url)
                .driverClassName(driverClassName)
                .username(username)
                .password(password)
                .build();
    }

    @PostConstruct
    void initTenantMigration() {
        Flyway.configure()
                .dataSource(buildDataSource())
                .locations(DEFAULT_SCHEMA_LOCATION)
                .schemas(SCHEMA_NAME)
                .load()
                .migrate();
    }

}