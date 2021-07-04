package com.Alevel.task1.Planet;

import com.Alevel.task1.Planet.AbstractPlanet;

public class SecondPlanet extends AbstractPlanet {
    @Override
    public void genGravity() {
        setGravity("8,87 м/с²");
    }

    @Override
    public void genName() {
        setName("Венера");
    }

    @Override
    public void genWeight() {
        setWeight("4,8675⋅10^24 кг");
    }


}