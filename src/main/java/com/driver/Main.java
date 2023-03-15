package com.driver;

public class Main {

     public static void main(String[] args){
          RWOnly RW =new RWOnly();
          RW.setter("Acciojob");
          String name=RW.getter();
          System.out.println(name);
     }
}