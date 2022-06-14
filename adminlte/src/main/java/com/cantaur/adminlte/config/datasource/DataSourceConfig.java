package com.cantaur.adminlte.config.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:/application.yml")
public class DataSourceConfig {


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.board")
    public DataSource dataSource() {
        HikariDataSource dataSource = DataSourceBuilder.create().type(HikariDataSource.class).build();
        return dataSource;
    }


    @Bean
    public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }


    @Bean()
    public TransactionManager transactionManager( DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}