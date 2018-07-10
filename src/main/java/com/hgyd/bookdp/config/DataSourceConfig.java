package com.hgyd.bookdp.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * Created by tina on 2018/7/10.
 */

@Configuration
@PropertySource("classpath:application.properties")
public class DataSourceConfig {

    @Value("${spring.mysql.url}")
    private String url;

    @Value("${spring.mysql.driver-class-name}")
    private String driverClass;

    @Value("${spring.mysql.username}")
    private String userName;

    @Value("${spring.mysql.password}")
    private String password;


    @Primary
    @Bean(name = "wdb")
    @ConfigurationProperties(prefix="spring.sqlserver")
    public DataSource sqlServerDataSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * 使用druid 管理数据库
     * @return
     */
    @Bean(name = "hgyd")
//    @ConfigurationProperties(prefix="spring.mysql")
    public DataSource mysqlDataSource(){
//        return DataSourceBuilder.create().build();
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driverClass);
        druidDataSource.setUsername(userName);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }
}
