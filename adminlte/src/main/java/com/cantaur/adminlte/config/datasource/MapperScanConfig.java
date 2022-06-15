package com.cantaur.adminlte.config.datasource;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MapperScanConfig {
    private static final String BASE_PACKAGE = "com.cantaur.adminlte.mapper.board";
    private String sqlSessionFactoryBeanName = "SqlSessionFactory";


    @Bean()
    public MapperScannerConfigurer sourceMapperScan(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage(BASE_PACKAGE);
        mapperScannerConfigurer.setAnnotationClass(Mapper.class);
        mapperScannerConfigurer.setSqlSessionFactoryBeanName(sqlSessionFactoryBeanName);
        return mapperScannerConfigurer;

    }


}
