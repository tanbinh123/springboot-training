package com.gsonkeno.springbootmybatismultidb.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 * 在普通的POJO类中只要标注@Configuration注解，就可以为spring容器提供Bean定义的信息了，
 * 每个标注了@Bean的类方法都相当于提供了一个Bean的定义信息。
 */
@Configuration
@MapperScan(basePackages = {"com.gsonkeno.springbootmybatismultidb.dao.first"},
        sqlSessionTemplateRef = "firstSessionTemplate")
public class FirstDataSourceConfig {

    @Bean(name = "firstDataSource")
    //@Primary //必须加此注解，不然报错，下一个类则不需要添加
    //但是这里注释后并没有报错，为什么？
    @ConfigurationProperties(prefix = "first.datasource") // prefix值必须是application.properteis中对应属性的前缀
    public DataSource userDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 类的方法处可以标注@Bean注解，Bean的类型由方法返回值类型决定，名称默认和方法名相同，
     * 也可以通过入参显示指定Bean名称。
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory firstSessionFactory(@Qualifier("firstDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources("classpath:mapper/first/*.xml"));
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * @Qualifier 根据名称进行注入，通常是在具有相同的多个类型的实例的一个注入（例如有多个DataSource类型的实例）。
     *
     * @param sqlSessionFactory
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionTemplate firstSessionTemplate(@Qualifier("firstSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory); // 使用上面配置的Factory
        return template;
    }
}
