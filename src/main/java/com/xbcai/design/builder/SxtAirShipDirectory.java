package com.xbcai.design.builder;

public class SxtAirShipDirectory implements AirShipDirectory {
    /**
     * 构建者
     */
    private AirShipBuilder builder;

    /**
     * 通过构造函数将构建者对象注入
     * @param builder 构建者
     */
    public SxtAirShipDirectory(AirShipBuilder builder){
        this.builder=builder;
    }
    @Override
    public AirShip directAirShip() {
        //利用构建者构建飞船零件
        Engine engine = builder.builderEngine();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();
        EscapeTower escapeTower = builder.builderEscapeTower();
        //组装飞船返回
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalModule(orbitalModule);
        return ship;
    }
}
