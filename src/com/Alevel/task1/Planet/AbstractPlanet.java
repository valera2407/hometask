package com.Alevel.task1.Planet;

import com.Alevel.task1.Planet.Planet;

public abstract class AbstractPlanet implements Planet {
    private String graw;
    private String name;
    private String weight;

    protected void setGraw(String graw) {
        this.graw = graw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public void genInfo(){
        genWeight();
        genGraw();
        genName();
    }

    public abstract void genGraw();
    public abstract void genName();
    public abstract void genWeight();


    public String getGraw() {
        return graw;
    }

    public String getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void outWeight() {
        System.out.println("Вес планеты составляет" + getGraw());
    }

    @Override
    public void outName() {
        System.out.println(getName() + "название данной планеты");
    }

    @Override
    public void outGravity() {
        System.out.println("Ускорение свободного падения на этой планете составляет " + getGraw());
    }

    @Override
    public void allInfo() {
        System.out.println(getName() + " название данной планеты." +
                "Ускорение свободного падения на этой планете составляет " + getGraw() +
                ".Вес планеты составляет " + getWeight());
        System.out.println("----------------------------------------");
    }
}
