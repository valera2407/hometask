package com.Alevel.task1;

public class Main {
    public static void main(String[] args){

        for (Month i : Month.values()){
            System.out.println("Month - " + i + " it`s " + i.month() + " season.");
        }
    }
}
