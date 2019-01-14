package org.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Kai.Chi
 * @date 2019/1/11 14:15
 * @description:
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {
    /*
    *
    * 使用转发的话，网址中的微服务名字需要小写
    * */
    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class,args);
    }
}
