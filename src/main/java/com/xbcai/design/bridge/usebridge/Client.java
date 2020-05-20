package com.xbcai.design.bridge.usebridge;

/**
 * 桥接模式的适用场景是：
 * 桥接模块可以取代多层继承方案，多重继承违背了单一职责原则，复用性较差，类的个数非常多。桥接模块可以极大的减少子类的个数，从而降低管理和维护的成本
 * 桥接模块极大的提高了系统的可扩展性，在两个变化维度中的 任意扩展一个维度，都不需要修改原有的系统，符合开闭原则
 * 一般具备多个维度的时候可以使用桥接模块
 *
 * 测试桥接模块，桥接模式的好处是，这里如果再新增一个电脑品牌，只需要在Brand下面新增一个品牌，例如：
 * 新增一个神州的品牌,只需要新增一个神州品牌的类实现品牌的接口，Computer类不需要改变
* class Shenzhou implements Brand{
 *     @Override
 *     public void sale() {
 *         System.out.println("销售Dell电脑");
 *     }
 * }
 * 然后在客户端调用的时候只需要
 * Computer shenzhou = new Laptop(new Shenzhou());
 * shenzhou.sale();
 */
public class Client {
    public static void main(String[] args) {
        //销售联想的笔记本电脑
        Computer lenovo = new Laptop(new Lenovo());
        lenovo.sale();

        //销售联想的笔记本电脑
        Computer shenzhou = new Laptop(new Shenzhou());
        shenzhou.sale();
    }
}
