package org.study.service;

import org.study.entity.Dept;

import java.util.List;

/**
 * @author Kai.Chi
 * @date 2019/1/8 15:57
 * @description:
 */
public interface DeptService {
    int deleteByPrimaryKey(Long deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept getByPrimaryKey(Long deptno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
    List<Dept> getAllDepts();
}
