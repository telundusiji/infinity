package site.teamo.biu.infinity.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 爱做梦的锤子
 * @create 2020/8/4
 */

@SpringBootApplication(scanBasePackages = "site.teamo.biu.infinity", exclude = {DataSourceAutoConfiguration.class})
@EnableFeignClients
@EnableDiscoveryClient
public class InfinityWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfinityWebApplication.class, args);
    }
}
