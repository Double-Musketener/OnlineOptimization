package com.ljh;

public class Xc {

    public static void main(String[] args) {

        new Thread(() -> {

            Test.op();

            System.out.println(Thread.currentThread().getName());


        }, "sds").start();




    }


    public static class Test{

       static void op(){

            System.out.println("6666");
        }

    }





}
