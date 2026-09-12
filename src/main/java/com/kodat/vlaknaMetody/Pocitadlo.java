package com.kodat.vlaknaMetody;

public class Pocitadlo {
    int hodnota = 0;

    public synchronized void PridejJedna(){
        hodnota++;
    }

    public int DejHodnotu(){
        return hodnota;
    }
}
