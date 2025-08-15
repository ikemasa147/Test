package com.ikeda.refactoring;

public class Main extends Calc {
    public static void main(String[] args) {
        int year = 2021;
        int month = 2;
        int days = chkDays(month, year);
        System.out.println("その月の日数は" + days + "です！");
    }

}