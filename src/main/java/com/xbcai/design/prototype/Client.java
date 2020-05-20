package com.xbcai.design.prototype;

import java.util.Date;

/**
 * 测试原型模式（浅克隆）
 * 如果一个对象A里面有引用了另外一个对象B，进行浅克隆的时候会把A对象里面的属性值赋值给新的对象包括对B对象的引用
 * 如果这个时候修改了B对象的内容，那克隆出来的新对象也相应的改变，因为新的克隆对象和A对象都是指向了同一个B的内存地址
 */
public class Client {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception{
        Date d = new Date(122222L);
        Sheep s1 =new Sheep("少丽",d);
        //进行克隆将s1对象的值复制给s2
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.getSname()+"|"+s1.getBirthday());
        System.out.println(s2.getSname()+"|"+s2.getBirthday());
        //对s1对象里面应有的d进行更改,会影响到了s2对象里面的值
        d.setTime(8888888888L);
        System.out.println(s1.getSname()+"|"+s1.getBirthday());
        System.out.println(s2.getSname()+"|"+s2.getBirthday());
    }
}
