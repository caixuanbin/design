package com.xbcai.design.bridge.usebridge;

import lombok.AllArgsConstructor;

/**
 * 电脑类型的维度
 */
@AllArgsConstructor
public class Computer {
    protected Brand brand;
    public void sale(){
        brand.sale();
    }
}
class Desktop extends Computer{
    public Desktop(Brand b){
        super(b);
    }
    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}
class Laptop extends Computer{
    public Laptop(Brand b){
        super(b);
    }
    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}
