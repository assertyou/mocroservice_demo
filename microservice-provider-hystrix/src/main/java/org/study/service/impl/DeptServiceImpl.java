package org.study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.entity.Dept;
import org.study.mapper.DeptMapper;
import org.study.service.DeptService;

import java.util.List;

/**
 * @author Kai.Chi
 * @date 2019/1/8 15:57
 * @description:
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> getAllDepts() {
        return deptMapper.selectAllDepts();
    }

    @Override
    public int deleteByPrimaryKey(Long deptno) {
        return 0;
    }

    @Override
    public int insert(Dept record) {
        return 0;
    }

    @Override
    public int insertSelective(Dept record) {
        return 0;
    }

    @Override
    public Dept getByPrimaryKey(Long deptno) {

        return deptMapper.selectByPrimaryKey(deptno);
    }

    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Dept record) {
        return 0;
    }
}
