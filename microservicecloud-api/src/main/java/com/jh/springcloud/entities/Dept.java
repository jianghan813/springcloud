package com.jh.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/*@AllArgsConstructor*/
@NoArgsConstructor  // 无参构造
@Data   // get set方法
@Accessors(chain = true)    // 链式写法
public class Dept implements Serializable { // Dept(Entity) orm mysql->Dept (table) 类表关系映射
    private Long deptno;    // 主键
    private String dname;   // 部门名称
    private String db_source;   // 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被储存到不同数据库

    public Dept(String dname){
        super();
        this.dname=dname;
    }
}
