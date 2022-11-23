package com.cc.java;

public class App {
    
    public static void main(String[] args) {

    Konto konto1 = new Konto(10000);
    konto1.setKontostand(10000*2);
    output(String.valueOf(konto1.getKontostand()));
    
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

