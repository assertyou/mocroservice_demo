package org.study.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
/*
Just for test
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