package com.ikeda.refactoring.calc2;

public class Main2 {
    public static void main(String[] args) {
        int year = 2021;
        int month = 2;
        int days = Calc.chkDays(month, year);
        System.out.println("その月の日数は" + days + "です！");
    }

}