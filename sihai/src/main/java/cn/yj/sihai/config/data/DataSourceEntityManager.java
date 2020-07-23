package cn.yj.sihai.config.data;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * 数据源配置
 */
@Configuration
@EnableTransactionManagement
@MapperScan(
        sqlSessionTemplateRef = "sqlSessionTemplate",
        basePackages = {"cn.yj.sihai.mapper"} //设置Repository所在位置
)
public class DataSourceEntityManager {

    /**
     * 数据源
     */
    @Resource
    private DataSourceRouting dataSourceRouting;

    /**
     * SQL执行Session工厂
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSourceRouting);//数据源
        bean.setTypeAliasesPackage("cn.yj.bean.po");//设置实体类所在位置
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*Mapper.xml"));//Mapper.xml所在位置
        return bean.getObject();
    }

    /**
     * 事务
     */
    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSourceRouting);
    }

    /**
     * SQL执行Session模板
     */
    @Bean
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(this.sqlSessionFactory());
    }

}
