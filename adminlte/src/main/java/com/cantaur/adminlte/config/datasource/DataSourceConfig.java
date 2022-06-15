package com.cantaur.adminlte.config.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableConfigurationProperties
public class DataSourceConfig {

    private static final String TYPE_ALIASES_PACKAGE = "com.cantaur.adminlte.model.board";
    private String mapperLocationsPath = "classpath*:/sql/board/*.xml";



    @Bean()
    @ConfigurationProperties(prefix = "spring.datasource.board")
    public DataSource dataSource() {
        HikariDataSource dataSource = DataSourceBuilder.create().type(HikariDataSource.class).build();
        return dataSource;
    }

    @Bean(name = "SqlSessionFactory")
    protected SqlSessionFactory getSqlSessionFactory() throws Exception {
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setLazyLoadingEnabled(Boolean.TRUE);
        configuration.setUseGeneratedKeys(Boolean.TRUE);
        configuration.setMapUnderscoreToCamelCase(Boolean.TRUE);
        configuration.setJdbcTypeForNull(JdbcType.NULL);

        PathMatchingResourcePatternResolver pathResolver = new PathMatchingResourcePatternResolver();

        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setTypeAliasesPackage(TYPE_ALIASES_PACKAGE);
        sessionFactoryBean.setMapperLocations(pathResolver.getResources(this.mapperLocationsPath));
        sessionFactoryBean.setConfiguration(configuration);

        return sessionFactoryBean.getObject();
    }


    @Bean()
    public SqlSessionTemplate sqlSession(@Qualifier("SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory, ExecutorType.REUSE);
    }


    @Bean()
    public TransactionManager transactionManager( DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}