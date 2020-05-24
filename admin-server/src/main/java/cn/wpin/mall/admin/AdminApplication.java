package cn.wpin.mall.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * springboot-admin 服务监控
 *
 * @author wangpin
 */
@SpringBootApplication(scanBasePackages = "cn.wpin.mall", exclude = DataSourceAutoConfiguration.class)
@EnableAdminServer
//@EnableDiscoveryClient
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
