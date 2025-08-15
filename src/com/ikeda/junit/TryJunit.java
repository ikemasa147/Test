package com.ikeda.junit;

public class TryJunit {
    static{
        System.out.println("staticイニシャライザが呼ばれました！");
    }
    TryJunit(){
        System.out.println("コンストラクタが呼ばれました！");
    }

    public static void main(String[] args) {
        // TODO
    }

    public void sub(){
        System.out.println("subメソッドが呼ばれました！");
    }
}