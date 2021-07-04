package com.Alevel.task1.Planet;

import com.Alevel.task1.Planet.AbstractPlanet;

public class FirstPlanet  extends AbstractPlanet {
    @Override
    public void genGravity() {
        setGravity("3,7 м/с²");
    }

    @Override
    public void genName() {
        setName("Меркурий");
    }

    @Override
    public void genWeight() {
        setWeight("3,33022⋅10^23 кг");
    }


}
