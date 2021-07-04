package com.Alevel.task1;

import com.Alevel.task1.Planet.FirstPlanet;
import com.Alevel.task1.Planet.Planet;
import com.Alevel.task1.Planet.ThirdPlanet;

public class Main {
    public static void main(String[] args){

        for (Month i : Month.values()){
            System.out.println("Month - " + i + " it`s " + i.month() + " season.");
        }
        System.out.println("--------------------------------------");

        Planet first = new FirstPlanet();
        Planet third = new ThirdPlanet();
        first.generationInfo();
        third.generationInfo();
        first.showInfo();
        third.showInfo();
    }
}
