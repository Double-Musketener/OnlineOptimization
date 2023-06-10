package com.ljh;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class test {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();



//        CompletableFuture<String> com = CompletableFuture.supplyAsync(() -> {
//
//            try {
//                TimeUnit.SECONDS.sleep(5);
//                System.out.println("dsds");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//
//            return "dsd";
//               }
//
//       );


//        ob();
//
//        long endTime = System.currentTimeMillis();
//        long runTime = endTime - startTime;
//        System.out.println(runTime);
//        try {
//            String s = com.get();
//            System.out.println(s);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

//        getNextNumber();
        System.out.println(sf());
    }


    public static void op() {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println(runTime);


    }


    public static void ob() {



        long startTime = System.currentTimeMillis();

            try {
                TimeUnit.SECONDS.sleep(5);

                ArrayList<Person> list = new ArrayList();
                list.add(new Person("ds", "dsd"));
                list.add(new Person("sds", "djhsd"));
                list.add(new Person("dhjs", "dsjhd"));
                list.add(new Person("djhs", "dsjhd"));
                list.add(new Person("dhjs", "dsjhd"));
                list.add(new Person("dhs", "dhjsd"));

                list.stream().map(p -> {
                    p.setAge("46");
                    return p;
                }).collect(Collectors.toList()).forEach(System.out::println);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println(runTime);




    }


    static void getNextNumber() {

        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String d2 = "2";
        String c = b + 2;
        String e = d + 2;
        String h = d + d2;
        String g = String.valueOf(a);

        if (d == b){

            System.out.println("55");
        }


        if(e == a ){

            System.out.println("e等于a的内存地址");

        }


        if ( c == e){

            System.out.println("c和e内存地址相等");
        }

        if (c == a){

            System.out.println("c和a内存地址相等");
        }

        if (g == a){

            System.out.println("g和a内存地址相等");
        }

        if ( a == h){

            System.out.println("h和a内存地址相等");

        }

        System.out.println(a.hashCode() );
        System.out.println("a---" + System.identityHashCode(a));
        System.out.println("------------");
        System.out.println( b.hashCode() );
        System.out.println("b---- " + System.identityHashCode(b));
        System.out.println("------------");
        System.out.println(d.hashCode());
        System.out.println("d---" + System.identityHashCode(d));
        System.out.println("------------");
        System.out.println(c.hashCode());
        System.out.println("c----- " + System.identityHashCode(c));
        System.out.println("------------");
        System.out.println(e.hashCode());
        System.out.println("e---" + System.identityHashCode(e));
        System.out.println(h.hashCode());
        System.out.println("h---" + System.identityHashCode(h));
        System.out.println(g.hashCode());
        System.out.println("g----" + System.identityHashCode(g));

    }




    static List<List<String>> sf(){

        String[] strr = {"dsds", "gdgd", "rtrter", "ddss", "ggdd"};





        return new ArrayList<>(Arrays.stream(strr).collect(Collectors.groupingBy(str -> {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            return new String(chars);


        })).values());


    }


    }





