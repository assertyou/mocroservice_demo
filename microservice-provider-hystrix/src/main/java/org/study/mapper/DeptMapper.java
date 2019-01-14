package org.study.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.study.entity.Dept;

import java.util.List;

@Mapper
public interface DeptMapper {
    int deleteByPrimaryKey(Long deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long deptno);
    List<Dept>  selectAllDepts();

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}