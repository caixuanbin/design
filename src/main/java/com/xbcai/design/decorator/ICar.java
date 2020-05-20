package com.xbcai.design.decorator;

import lombok.AllArgsConstructor;

/**
 * 抽象构件
 */
public interface ICar {
    void move();
}

/**
 * ConcreteComponent 具体构件角色（真实对象）
 */
class Car implements ICar{
    @Override
    public void move() {
        System.out.println("陆地上跑！");
    }
}

/**
 * Decorator装饰角色
 */
@AllArgsConstructor
class SuperCar implements ICar{
    private ICar car;

    @Override
    public void move() {
        car.move();
    }
}

/**
 * ConcreteDecorator具体装饰角色
 */
class FlyCar extends SuperCar{
    public FlyCar(ICar car){
        super(car);
    }
    private void fly(){
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

/**
 * ConcreteDecorator具体装饰角色
 */
class WaterCar extends SuperCar{
    public WaterCar(ICar car){
        super(car);
    }
    private void swim(){
        System.out.println("水上游！");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

/**
 * ConcreteDecorator具体装饰角色
 */
class AICar extends SuperCar{
    public AICar(ICar car){
        super(car);
    }
    private void autoMove(){
        System.out.println("自动跑！");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}
