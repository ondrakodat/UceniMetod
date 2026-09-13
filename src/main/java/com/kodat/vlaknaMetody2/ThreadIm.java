package com.kodat.vlaknaMetody2;

import com.kodat.vlaknaMetody.Pocitadlo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadIm implements Runnable{
    PocitadloProThread pocitadlo;
    CyclicBarrier c;

    public ThreadIm(PocitadloProThread pocitadlo, CyclicBarrier c) {
        this.pocitadlo = pocitadlo;
        this.c = c;
    }

    @Override
    public void run(){
        try {
            c.await();
            for (int i = 0; i < 100; i++) {
                pocitadlo.pricti();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }


}
