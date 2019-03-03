package com.bw;

/**
 * Created by asus on 2018/11/15.
 */
public class Singleton {


    //饿汉式
    private Singleton(){};
    private static Singleton singleton = new Singleton();
    public static Singleton getSingleton(){
        return singleton;
    }

    /*//饿汉式
    private Singleton(){};
    private static Singleton singleton = new Singleton();
    public static Singleton getSingleton(){
        return singleton;
    }*/

    public static void main(String[] args) {
        System.out.println("fasfda");
    }





}
