package cn.yj.sihai.config.data;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 数据源路由
 */
public class DataSourceRouting extends AbstractRoutingDataSource {
    /**
     * 数据源集合
     */
    private static final ThreadLocal<DataSourceType> contextHolder = new ThreadLocal<>();

    /**
     * 获取默认数据源
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return contextHolder.get();
    }

    /**
     * 数据源类型
     */
    public enum DataSourceType {
        WriteDataSource, ReadDataSource
    }

    /**
     * 写数据源
     */
    public static void writeDataSource() {
        contextHolder.set(DataSourceType.WriteDataSource);
    }

    /**
     * 读数据源
     */
    public static void readDataSource() {
        contextHolder.set(DataSourceType.ReadDataSource);
    }

    /**
     * 设置数据源类型
     */
    public static void setDataSourceType(DataSourceType type) {
        contextHolder.set(type);
    }

    /**
     * 获取默认数据源类型
     */
    public static DataSourceType getType() {
        return contextHolder.get();
    }

    /**
     * 清理数据源
     */
    public static void cleanAll() {
        contextHolder.remove();
    }
}
