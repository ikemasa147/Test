package com.ikeda.junit;

public class Discount {
    public static void main(String[] args) {

    }
    //割引金の金額を計算する
    public int setDiscount(int price,double discount){
        int afterDiscount = (int)(price*(1-discount));
        return  afterDiscount;
    }
    public String calcRate(double rate1,double rate2){
        if(rate1>rate2){
            return "OK";
        }else{
            return "NG";
        }
    }
    public int num(){
        return 10;
    }
    public String str(){
        String str1 = "abc";
        return str1;
    }
    public String str2(){
        String str1 = "abc";
        str1 += "d";
        return str1;
    }

    public String str(String s){
        return s;
    }

    int[] ary = {0,1,2,3,4,5};
    public int[] array(){
        return  ary;
    }

    public String nullValue(String s){
        String str = s;
        return str;
    }

    public boolean trueValue(){
        int x = 10;
        if(x==10){
            return true;
        }else{
            return false;
        }
    }
    public boolean falseValue(){
        int x = 0;
        if(x==10){
            return true;
        }else{
            return false;
        }
    }

    public double sexCheck(String sex){
        if(sex.equals("f")){
            return 0.2;
        }else{
            return 0.1;
        }
    }
}