package com.xbcai.design.bridge.nobridge;

/**
 * 未使用桥接模式的时候，很繁琐，可以看下面那些类的维护关系
 */
public interface Computer {
    void sale();
}
class DeskTop implements Computer{
    @Override
    public void sale() {
        System.out.println("销售台式机电脑");
    }
}
class LapTop implements Computer{
    @Override
    public void sale() {
        System.out.println("销售笔记本电脑");
    }
}
class Pad implements Computer{
    @Override
    public void sale() {
        System.out.println("销售平板电脑");
    }
}
class LenovoDesktop extends DeskTop{
    @Override
    public void sale() {
        System.out.println("销售联想台式机");
    }
}
class LenovoLaptop extends LapTop{
    @Override
    public void sale() {
        System.out.println("销售联想笔记本");
    }
}
class LenovoPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售联想平板电脑");
    }
}
