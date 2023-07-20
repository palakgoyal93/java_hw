package com.example;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Phone {


    String name;
    Integer imei;
    String dimensions;
    String color;
    String memory;
    static String bandwidth = "5g";

    public static String start() {

        return "started";

    }

    public static Boolean start(String a) {

        return null;

    }

    public static String start(String a, String b) {

        return "started";

    }


    public String stop() {
        return "stopped";

    }

   /* byte b;
    int i;
    short s;
    long l;
    double d;
    float f;
    boolean b1;
    boolean b2;

    Byte bb;
    Integer i1;
    Short s1;
    Long l1;
    Double d1;
    Float f1;
    Boolean b11;
    Boolean b21;

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone();

        phone1.name = "SamsungXCover";
        phone2.name = "SamsungA50";
        phone3.name = "IPhone12";
        phone4.name = "RealMe";

        phone1.color = "black";
        phone2.color = "blue";
        phone3.color = "red";
        phone4.color = "pink";


        phone1.dimensions ="1.6*2.4";
        phone2.dimensions ="1.8*2.0";
        phone3.dimensions ="2.8*2.5";
        phone4.dimensions ="1.9*2.3";

        phone1.imei = 1451516;
        phone2.imei =8451545;
        phone3.imei = 48845454;
        phone4.imei = 7987165;

        phone1.memory = "64gb";
        phone2.memory = "64gb";
        phone3.memory = "128gb";
        phone4.memory = "128gb";

        Phone [] objects = { phone1, phone2, phone3, phone4};

        for (Phone obj : objects) {
            System.out.println(obj.name);
            System.out.println(obj.color);
            System.out.println(obj.dimensions);
            System.out.println(obj.imei);
            System.out.println(obj.memory);
            System.out.println(Phone.bandwidth+"\n");
        }


     /*   System.out.println("Samsung A50 color: "+ phone2.color);
        System.out.println("phone2:" + phone2.start());
        System.out.println("phone2:" + phone2.stop());
        System.out.println("phone1:" + phone1.start());
        System.out.println("phone1:" + phone1.stop());
        System.out.println("phone3:" + phone3.start());
        System.out.println("phone3:" + phone3.stop());
        System.out.println("phone4:" + phone4.start());
        System.out.println("phone4:" + phone4.stop());



        System.out.println(phone1.b);
        System.out.println(phone1.i);
        System.out.println(phone1.s);
        System.out.println(phone1.l);
        System.out.println(phone1.d);
        System.out.println(phone1.f);
        System.out.println(phone1.b1);
        System.out.println(phone1.b2);



        String asd = "213213123";
        int  sadasd = Integer.valueOf(asd);
        System.out.println("\n\n");
        System.out.println(phone1.bb);
        System.out.println(phone1.i1);
        System.out.println(phone1.s1);
        System.out.println(phone1.l1);
        System.out.println(phone1.d1);
        System.out.println(phone1.f1);
        System.out.println(phone1.b11);
        System.out.println(phone1.b21);

      */







    }



