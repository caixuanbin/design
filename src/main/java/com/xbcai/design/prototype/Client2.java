package com.xbcai.design.prototype;

import java.util.Date;

/**
 * 原型模式（深复制）
 */
public class Client2 {
    @SuppressWarnings("all")
    public static void main(String[] args)  throws Exception{
        Date d = new Date(122222L);
        Sheep2 s1 =new Sheep2("少丽",d);
        //进行克隆将s1对象的值包括是s1引用的对象属性也复制给s2
        Sheep2 s2 = (Sheep2) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.getSname()+"|"+s1.getBirthday());
        System.out.println(s2.getSname()+"|"+s2.getBirthday());
        //对s1对象里面原有的d进行更改,不会影响到了s2对象里面的值
        d.setTime(8888888888L);
        System.out.println(s1.getSname()+"|"+s1.getBirthday());
        System.out.println(s2.getSname()+"|"+s2.getBirthday());
    }
}
