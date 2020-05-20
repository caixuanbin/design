package com.xbcai.design.memento;

import lombok.Data;

/**
 * 备忘录类
 */
@Data
public class EmpMemento {
    private String ename;
    private int age;
    private double salary;

    public EmpMemento(Emp e) {
        this.ename = e.getEname();
        this.age = e.getAge();
        this.salary = e.getSalary();
    }
}
