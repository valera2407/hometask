package com.Alevel.task1.Planet;

import com.Alevel.task1.Planet.AbstractPlanet;

public class ThirdPlanet extends AbstractPlanet {
    @Override
    public void genGraw() {
        setGraw("9,780327 м/с²");
    }

    @Override
    public void genName() {
        setName("Земля");
    }

    @Override
    public void genWeight() {
        setWeight("5,9726⋅10^24 кг");
    }
}
