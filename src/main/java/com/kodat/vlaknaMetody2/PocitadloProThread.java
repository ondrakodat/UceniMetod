package com.kodat.vlaknaMetody2;

public class PocitadloProThread {
    int SDILENA_PROMENA = 0;

    public void pricti(){
        SDILENA_PROMENA ++;
    }

    public int dejHodnotu(){
        return this.SDILENA_PROMENA;
    }


}
