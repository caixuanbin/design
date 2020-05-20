package com.xbcai.design.prototype;

/**
 * 测试普通new方式创建对象和clone方式创建对象的效率差异
 * 如果需要短时间内创建大量对象，并且new的过程比较耗时，则可以考虑使用原型模块
 * */
public class Client4 {
    private static void testNew(int size){
        long start = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            Laptop t = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("new的方式创建耗时："+(end-start));
    }

    private static void testClone(int size) throws Exception{
        Laptop t = new Laptop();
        long start = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            Laptop temp = (Laptop)t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("clone的方式创建耗时："+(end-start));
    }
    public static void main(String[] args) throws Exception{
        //耗时13762ms
        testNew(100000);
        //耗时1ms
        testClone(100000);
    }
}

class Laptop implements Cloneable{
    public Laptop(){
        //模拟创建对象耗时的过程
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }
}
