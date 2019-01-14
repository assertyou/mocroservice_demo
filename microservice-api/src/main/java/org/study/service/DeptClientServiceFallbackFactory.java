package org.study.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.study.entity.Dept;

import java.util.List;

/**
 * @author Kai.Chi
 * @date 2019/1/11 10:18
 * @description:
 * 服务降级是在客户端实现的
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        /*
        *
        * 在provider端服务不可用的时候，返回下列数据
        * */
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                return new Dept().setDname("服务端暂时不可用，请访问其他服务");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
