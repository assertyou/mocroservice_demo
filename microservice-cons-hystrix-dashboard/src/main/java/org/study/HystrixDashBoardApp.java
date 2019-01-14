package org.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Kai.Chi
 * @date 2019/1/11 13:23
 * @description:
 * 测试
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardApp {
    /*
    * 不能只配置一级目录，否则无法监控 如/getall
    * */
    public static void main(String[] args) {

        SpringApplication.run(HystrixDashBoardApp.class,args);

    }
}
