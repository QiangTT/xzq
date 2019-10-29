package cn.zb.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@PropertySource(value = "classpath:dataSource.properties")
@ComponentScan(value = {"cn.zb.service.impl"})
@MapperScan(value = "cn.zb.mapper")
public class SpringConfig {
    @Value("${jdbc.driverClassName}") //简单类型的值的装配
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.initialSize}")
    private Integer initialSize;
    @Value("${jdbc.maxActive}")
    private Integer maxActive;

    @Bean(value = "dataSource") //<bean>
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxActive(maxActive);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {

        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);

        Resource configResource = new ClassPathResource("mybatis-config.xml");
        factoryBean.setConfigLocation(configResource);

        Resource mapperResource1 = new ClassPathResource("mapper/ModuleMapper.xml");
        Resource mapperResource2 = new ClassPathResource("mapper/OprationMapper.xml");
        Resource mapperResource3 = new ClassPathResource("mapper/RightMapper.xml");
        Resource mapperResource4 = new ClassPathResource("mapper/RoleMapper.xml");
        Resource mapperResource5 = new ClassPathResource("mapper/RoleRightMapper.xml");
        Resource mapperResource6 = new ClassPathResource("mapper/AdminMapper.xml");
        Resource mapperResource7 = new ClassPathResource("mapper/UserMapper.xml");
        Resource mapperResource8 = new ClassPathResource("mapper/PricingsMapper");
        Resource mapperResource9 = new ClassPathResource("mapper/accountMapper.xml");
        Resource mapperResource10 = new ClassPathResource("mapper/reckonMapper.xml");

        factoryBean.setMapperLocations(new Resource[]{mapperResource1,mapperResource2,mapperResource3,mapperResource4,mapperResource5,mapperResource6,mapperResource7,mapperResource8,mapperResource9,mapperResource10});

        factoryBean.setTypeAliasesPackage("cn.zb.entity");

        return factoryBean.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

}
