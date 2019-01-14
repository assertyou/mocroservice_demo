package org.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.study.entity.Dept;

import java.util.List;

/**
 * @author Kai.Chi
 * @date 2019/1/9 9:43
 * @description:
 */
@RestController
public class DeptController {
    private static final String REST_URL_PREFIX = "http://MICROSERVICE-PROVIDER";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/get/{id}")
    public Dept getDeptById(@PathVariable Long id){

        return  restTemplate.getForObject(REST_URL_PREFIX+"/get/"+id,Dept.class);

    }

    @RequestMapping("/getall")
    public List<Dept> getAllDept(){

        return  restTemplate.getForObject(REST_URL_PREFIX+"/getall",List.class);

    }

}
