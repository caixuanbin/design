package com.xbcai.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式（深复制，使用系列化和反系列化的方式实现深复制）
 */
public class Client3 {
    @SuppressWarnings("all")
    public static void main(String[] args)  throws Exception{
        Date d = new Date(122222L);
        Sheep s1 =new Sheep("少丽",d);
        //进行克隆将s1对象的值复制给s2
        //利用系列化和反系列化实现深复制
        ByteArrayOutputStream bos =new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject();
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
