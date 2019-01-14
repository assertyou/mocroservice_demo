package org.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.study.entity.Dept;
import org.study.service.DeptService;

import java.util.List;

/**
 * @author Kai.Chi
 * @date 2019/1/8 16:01
 * @description:
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/get/{id}")
    public Object getDeptById(@PathVariable("id") Long id){
/*
        System.out.println(id);*/

        Dept dept = deptService.getByPrimaryKey(id);

        return dept;


    }
    @RequestMapping("/getall")
    public Object getDeptById(){
/*
        System.out.println(id);*/

        List<Dept> depts = deptService.getAllDepts();

        return depts;


    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICE-PROVIDER");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}
