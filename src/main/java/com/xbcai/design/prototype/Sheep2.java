package com.xbcai.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 深复制
 */
@AllArgsConstructor
@Getter
@Setter
public class Sheep2 implements Cloneable{
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //直接调用object对象的clone方法进行克隆
        Object obj = super.clone();
        //添加如下代码实现深复制（deep Clone）
        Sheep2 s =(Sheep2) obj;
        //把属性对象也进行克隆
        s.birthday = (Date) this.birthday.clone();
        return obj;
    }
}
