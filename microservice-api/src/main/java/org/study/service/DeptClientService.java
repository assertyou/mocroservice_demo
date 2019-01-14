package org.study.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.study.entity.Dept;

import java.util.List;

/**
 * @author Kai.Chi
 * @date 2019/1/10 20:08
 * @description:
 */
@FeignClient(value = "MICROSERVICE-PROVIDER",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public List<Dept> list();
}
