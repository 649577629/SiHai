package cn.yj.sihai.config.data;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 数据源切换 切面设置
 */
@Aspect
@Component
@Slf4j
public class DataSourceAOP {

    /**
     * 获取MyBatis日志输出级别
     */
    @Value("${logging.level.cn.fyy.test.dao}")
    private String logLevel;

    /**
     * 执行前判断选择
     */
    @Before("(@annotation(cn.yj.sihai.config.data.WriteDataSource)" +
            "&& !@annotation(cn.yj.sihai.config.data.ReadDataSource)" +
            "||  execution(* cn.yj.sihai.service..*.insert*(..))" +
            "||  execution(* cn.yj.sihai.service..*.update*(..))" +
            "||  execution(* cn.yj.sihai.service..*.save*(..))" +
            "||  execution(* cn.yj.sihai.service..*.delete*(..))" +
            ")")
    public void setWriteDataSourceType() {
        DataSourceRouting.writeDataSource();
        if ("debug".equals(logLevel)) {
            log.info("<<<<<<<<<<<<======== 数据源连接 切换至写 ========>>>>>>>>>>>>");
        }
    }

    /**
     * 执行前判断选择
     */
    @Before("(@annotation(cn.yj.sihai.config.data.ReadDataSource)" +
            "&& !@annotation(cn.yj.sihai.config.data.WriteDataSource)" +
            "||  execution(* cn.yj.sihai.service..*.query*(..))" +
            "||  execution(* cn.yj.sihai.service..*.get*(..))" +
            "||  execution(* cn.yj.sihai.service..*.find*(..))" +
            "||  execution(* cn.yj.sihai.service..*.count*(..))" +
            ")")
    public void setReadDataSourceType() {
        DataSourceRouting.readDataSource();
        if ("debug".equals(logLevel)) {
            log.info("<<<<<<<<<<<<======== 数据源连接 切换至读 ========>>>>>>>>>>>>");
        }
    }

    /**
     * 执行后执行关闭操作
     */
    @After("(" +
            "execution(* cn.yj.sihai.service..*.query*(..))" +
            "|| execution(* cn.yj.sihai.service..*.get*(..))" +
            "|| execution(* cn.yj.sihai.service..*.find*(..))" +
            "|| execution(* cn.yj.sihai.service..*.count*(..))" +
            "|| execution(* cn.yj.sihai.service..*.insert*(..))" +
            "|| execution(* cn.yj.sihai.service..*.update*(..))" +
            "|| execution(* cn.yj.sihai.service..*.save*(..))" +
            "|| execution(* cn.yj.sihai.service..*.delete*(..))" +
            "|| @annotation(cn.yj.sihai.config.data.ReadDataSource)" +
            "|| @annotation(cn.yj.sihai.config.data.WriteDataSource)" +
            ")")
    public void clean() {
        DataSourceRouting.cleanAll();
        if ("debug".equals(logLevel)) {
            log.info("<<<<<<<<<<<<======== 数据源连接 关闭 ========>>>>>>>>>>>>");
        }
    }
}
