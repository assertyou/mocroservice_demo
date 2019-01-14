package org.study.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "processDefault")
    public Object getDeptById(@PathVariable("id") Long id) {
/*
        System.out.println(id);*/

        Dept dept = deptService.getByPrimaryKey(id);
        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        return dept;


    }

    @RequestMapping("/getall")
    public Object getDeptById() {
/*
        System.out.println(id);*/

        List<Dept> depts = deptService.getAllDepts();

        return depts;


    }

    /*
     * 定义一个处理错误的方法，当发生错误之后会调用这个方法
     * */
    public Dept processDefault(@PathVariable Long id) {
        return new Dept().setDeptno(id)
                .setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDbSource("no this database in MySQL");
        }


    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
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
