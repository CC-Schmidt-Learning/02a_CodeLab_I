package com.cc.java;

public class App {
    
    public static void main(String[] args) {

    Konto konto1 = new Konto(10000);
    konto1.setKontostand(10000*2);
    
    output("Alter Kontostand: " +String.valueOf(konto1.getKontostandOld()+" EUR"));
    output("Aktueller Kontostand: " +String.valueOf(konto1.getKontostand()+" EUR"));

    Konto konto2 = new Konto(10000);
    konto2.setKontostand(10000*3);
    output("Alter Kontostand: " +String.valueOf(konto2.getKontostandOld()+" EUR"));
    output("Aktueller Kontostand: " + String.valueOf(konto2.getKontostand()+" EUR"));
    
    Konto konto3 = new Konto(10000);
    konto3.setKontostand(10000*10);
    output("Alter Kontostand: " +String.valueOf(konto3.getKontostandOld()+" EUR"));
    output("Aktueller Kontostand: " + String.valueOf(konto3.getKontostand()+" EUR") );
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

