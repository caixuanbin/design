package com.xbcai.design.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 构建宇宙飞船
 */
@Data
public class AirShip {
    /**
     * 轨道舱
     */
    private OrbitalModule orbitalModule;
    /**
     * 发动机
     */
    private Engine engine;
    /**
     * 逃逸塔
     */
    private EscapeTower escapeTower;

    public void launch(){
        System.out.println(engine.getName()+"|"+orbitalModule.getName()+"|"+escapeTower.getName());
    }
}
@Data
@AllArgsConstructor
class OrbitalModule{
    private String name;
}
@Data
@AllArgsConstructor
class Engine{
    private String name;
}
@Data
@AllArgsConstructor
class EscapeTower{
    private String name;
}
