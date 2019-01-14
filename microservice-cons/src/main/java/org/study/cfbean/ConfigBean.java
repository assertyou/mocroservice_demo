package org.study.cfbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Kai.Chi
 * @date 2019/1/9 9:41
 * @description:
 */
@Configuration
public class ConfigBean {
     @Bean
     @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
   /*
   * 显式的指定负载均衡的算法
   *
   * */
    @Bean
    public IRule getMyRule(){
         return new RandomRule();
    }
}
