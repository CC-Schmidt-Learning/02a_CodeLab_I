package com.cc.java;

public class Konto {
  private int kontostand= 10000;
  private int kontostandOld=10000;
  
  public int getKontostandOld() {
    return kontostandOld;
}


public void setKontostandOld(int kontostandOld) {
    this.kontostandOld = kontostandOld;
}


public Konto(int kontostand) {
    this.kontostand = kontostand;
}


    public int getKontostand() {
        return kontostand;
    }


    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

}
