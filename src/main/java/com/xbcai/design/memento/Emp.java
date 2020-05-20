package com.xbcai.design.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 源发器类
 */
@Data
@AllArgsConstructor
public class Emp {
    private String ename;
    private int age;
    private double salary;
    /**
     * 进行备忘操作，并返回备忘录对象
     */
    public EmpMemento memento(){
        return new EmpMemento(this);
    }
    /**
     * 进行数据恢复，恢复成指定备忘录对象的值
     */
    public void recovery(EmpMemento mmt){
        this.ename = mmt.getEname();
        this.age = mmt.getAge();
        this.salary = mmt.getSalary();
    }
}
