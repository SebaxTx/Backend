package com.MiCarreraPerfectaBackend.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Enzo Rico
 */
@Configuration
public class DDBB_Connection {
    
    @Value("${spring.application.name}")
    private String dataSourceName;
    
    @Value("${spring.datasource.url}")
    private String dataSourceUrl;
    
    @Value("${spring.datasource.username}")
    private String dataSourceUsername;
    
    @Value("${spring.datasource.password}")
    private String dataSourcePassword;
    
    @Value("${spring.datasource.driver-class-name}")
    private String dataSourceDriverclassname;
    
    @Value("${spring.jpa.database-platform}")
    private String dataSourceDatabaseplatform;
}
