package com.xbcai.design.adapter;

/**
 * 测试适配器模式
 * 客户端类
 * （相当于例子中的笔记本，只有USB接口）
 * 场景：笔记本，键盘，因为笔记本和键盘的口不对应，所以需要一个适配器，通过适配器将笔记本和键盘连接在了一起
 */
public class Client {
    public void test1(Target target){
        target.handleReq();
    }

    public static void main(String[] args) {
        //相当于笔记本
        Client c = new Client();
        //被适配的对象，这里指键盘
        Adaptee adaptee = new Adaptee();
        //相当于适配器
        Target t = new Adapter(adaptee);
        //调用适配器来间接使用键盘打字
        c.test1(t);
    }
}
