package org.study.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
/*
* 在这里新添加一行注释，用于测试git
*
* 再添加一行注释
* 在添加一行注释
* */

@Data
@NoArgsConstructor
@Accessors(chain=true)
public class Dept {
    private Long deptno;

    private String dname;

    private String dbSource;

    public Dept(String dname) {
        this.dname = dname;
    }
}