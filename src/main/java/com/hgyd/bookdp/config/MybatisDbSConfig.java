package com.hgyd.bookdp.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


/**
 * Created by wxcy on 2018/7/10.
 */
@Configuration
@MapperScan(basePackages = {"com.hgyd.bookdp.mapper.smapper"},sqlSessionFactoryRef ="splSessionFactoryS")
public class MybatisDbSConfig {

    @Autowired
    @Qualifier("wdb")
    private DataSource sqltmp;

    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactoryS() throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(sqltmp);
            return factoryBean.getObject();
    }

    public SqlSessionTemplate splSessionTemplateS() throws Exception{
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryS());
        return template;
    }

}
