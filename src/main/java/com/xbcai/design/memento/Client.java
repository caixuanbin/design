package com.xbcai.design.memento;

/**
 * 测试备忘录模式
 */
public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();

        Emp emp = new Emp("高旗",18,900);
        System.out.println("第一次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        //备忘一次
        taker.setMemento(emp.memento());
        //修改原始对象
        emp.setAge(38);
        emp.setEname("搞起");
        emp.setSalary(9000);
        System.out.println("第二次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        //恢复到备忘录对象保存的状态
        emp.recovery(taker.getMemento());
        System.out.println("第三次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());



    }
}
