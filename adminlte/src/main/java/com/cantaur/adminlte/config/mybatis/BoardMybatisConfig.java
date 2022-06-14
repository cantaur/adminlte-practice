package com.cantaur.adminlte.config.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.cantaur.adminlte.mapper.board", sqlSessionFactoryRef = "boardSqlSessionFactory")
public class BoardMybatisConfig extends AbstractMybatisConfig{

    public BoardMybatisConfig(DataSource dataSource){
        this.dataSource = dataSource;
        this.mapperLocationsPath = "classpath:/sql/board/*.xml";
    }

    @Override
    @Bean(name = "boardSqlSessionFactory")
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        return configureSqlSessionFactory().getObject();
    }
}
