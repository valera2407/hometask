package com.Alevel.task1;

public enum Month {

    December (Season.WINTER),
    January (Season.WINTER),
    February (Season.WINTER),
    March (Season.SPRING),
    April (Season.SPRING),
    May (Season.SPRING),
    June (Season.SUMMER),
    July (Season.SUMMER),
    August (Season.SUMMER),
    September (Season.AUTUMN),
    October (Season.AUTUMN),
    November (Season.AUTUMN);

    enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN,
    }

    private Season season;

    Month (Season season){
        this.season = season;
    }

    public Season month(){
        return this.season;
    }
}
