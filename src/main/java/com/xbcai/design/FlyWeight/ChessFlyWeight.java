package com.xbcai.design.FlyWeight;

import lombok.AllArgsConstructor;

/**
 * 享元类
 */
public interface ChessFlyWeight {
    void setColor(String color);
    String getColor();
    void display(Coordinate c);
}

/**
 * 具体的享元对象ConcreteFlayWeight
 */
@AllArgsConstructor
class ConcreteChess implements ChessFlyWeight{
    private String color;
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置："+c.getX()+"---"+c.getY());
    }
}


