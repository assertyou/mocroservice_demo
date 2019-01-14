package org.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.study.entity.Dept;
import org.study.service.DeptClientService;

import java.util.List;

/**
 * @author Kai.Chi
 * @date 2019/1/9 9:43
 * @description:
 */
@RestController
public class DeptController {

    @Autowired
    private DeptClientService service = null;

    @RequestMapping("/consumer/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping("/getall")
    public List<Dept> list() {
        return this.service.list();
    }


}
