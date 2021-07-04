package com.Alevel.task1.Planet;


public abstract class AbstractPlanet implements Planet {
    private String gravity;
    private String name;
    private String weight;

    protected void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public void generationInfo(){
        genWeight();
        genGravity();
        genName();
    }

    public abstract void genGravity();
    public abstract void genName();
    public abstract void genWeight();


    public String getGravity() {
        return gravity;
    }

    public String getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void outWeight() {
        System.out.println("Вес планеты составляет" + getGravity());
    }

    @Override
    public void outName() {
        System.out.println(getName() + "название данной планеты");
    }

    @Override
    public void outGravity() {
        System.out.println("Ускорение свободного падения на этой планете составляет " + getGravity());
    }

    @Override
    public void showInfo() {
        System.out.println("'" + getName() + "'" + " назвывают эту планету." +
                "Ускорение свободного падения на ней составляет " + getGravity() +
                ".Весит она " + getWeight());
        System.out.println("----------------------------------------");
    }
}
