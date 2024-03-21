package by.itstep.ivanvikvik.javalessons.controller;

import by.itstep.ivanvikvik.javalessons.model.entity.WeekDay;

public class Main {
    public static void main(String[] args) {
        WeekDay monday = new WeekDay();
        WeekDay friday = new WeekDay("Friday", 5);

        WeekDay mars = new WeekDay("Mars", 8);  // (1)!!!

        System.out.println(monday);
        System.out.println(friday);
    }
}
