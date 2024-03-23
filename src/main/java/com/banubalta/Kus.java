package com.banubalta;

public class Kus extends Hayvan{

    public Kus() {
        System.out.println("Kuş");
    }

    @Override
    public void sesVer(){
        System.out.println("Kuş : Cik cik.");
    }
}
