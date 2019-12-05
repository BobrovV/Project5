package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Apple apple = Apple.A;
        Apple apple1 = Apple.B;
        Apple apple2 = Apple.B;
        System.out.println(apple.getPrice());
        System.out.println(apple1.getPrice());
        System.out.println(apple);
        System.out.println(apple1.equals(apple2));
        System.out.println(apple1 == apple2);
        System.out.println(apple1.compareTo(apple2));


        for (Apple value : Apple.values()) {
            System.out.println(value.ordinal());
        }

        Apple a = Apple.valueOf("A");
        System.out.println(a);

        /*Girl ira = new Girl("Ira", 25);
        Girl inna = new Girl("Inna", 27);
        Girl inna3 = new Girl("Mira", 24);
        Girl inna4 = new Girl("Ket", 20);

        TreeSet<Girl> girls = new TreeSet<Girl>();
        girls.add(ira);
        girls.add(inna);
        girls.add(inna3);
        girls.add(inna4);
        System.out.println(girls);

        TreeSet<Girl> girls1 = new TreeSet<Girl>((a,b)->b.age-a.age);
        girls1.add(ira);
        girls1.add(inna);
        girls1.add(inna3);
        girls1.add(inna4);
        System.out.println(girls1);*/

    }
}
