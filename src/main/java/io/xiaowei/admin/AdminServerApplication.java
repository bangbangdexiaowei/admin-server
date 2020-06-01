package io.xiaowei.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class AdminServerApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(AdminServerApplication.class, args);
            log.info("Admin Server Start Success");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            log.info("Admin Server Start Fail:{}", e.getMessage());
        }
    }

}
