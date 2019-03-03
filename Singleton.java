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


   /* //懒汉式
    private Singleton(){};
    private static Singleton singleton = null;
    public static Singleton getSingleton(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }*/






}
