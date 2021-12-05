package yu.seatastorage.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 最重要的一步，要让 Seata 客户端在处理事务时自动生成反向 SQL，
 * 必须额外配置 DataSourceProxy 数据源代理类，
 * DataSourceProxy 是 Seata 提供的 DataSource 代理类，
 * 在分布式事务执行过程中，用于自动生成 undo_log 回滚数据，
 * 以及自动完成 RM 端分布式事务的提交或回滚操作
 */

@Configuration
public class DataSourceProxyConfig {

    //创建Druid数据源
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource druidDataSource() {
        return new DruidDataSource();
    }

    //建立DataSource数据源代理
    @Primary
    @Bean
    public DataSourceProxy dataSource(DruidDataSource druidDataSource) {
        return new DataSourceProxy(druidDataSource);
    }
}
