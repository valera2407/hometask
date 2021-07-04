package com.Alevel.task1.Planet;

import com.Alevel.task1.Planet.AbstractPlanet;

public class FourthPlanet extends AbstractPlanet {
    @Override
    public void genGraw() {
        setGraw("3,711 м/с²");
    }

    @Override
    public void genName() {
        setName("Марс");
    }

    @Override
    public void genWeight() {
        setWeight("6,4171⋅10^23 кг");
    }
}
