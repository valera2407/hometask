package com.Alevel.task1.Planet;

import com.Alevel.task1.Planet.AbstractPlanet;

public class FifthPlanet extends AbstractPlanet {
    @Override
    public void genGraw() {
        setGraw("24,79 м/с²");
    }

    @Override
    public void genName() {
        setName("Юпитер");
    }

    @Override
    public void genWeight() {
        setWeight("1,8986⋅10^27 кг");
    }
}
