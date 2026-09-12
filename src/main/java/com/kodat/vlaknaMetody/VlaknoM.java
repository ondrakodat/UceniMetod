package com.kodat.vlaknaMetody;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class VlaknoM implements Runnable{
    private final Pocitadlo pocitadlo;
    private final CyclicBarrier bariera;


    public VlaknoM(Pocitadlo pocitadlo, CyclicBarrier bariera) {
        this.pocitadlo = pocitadlo;
        this.bariera = bariera;
    }


    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " je připraven.");
            bariera.await();
            System.out.println(Thread.currentThread().getName() + " START!");

            for (int i = 0; i < 1000000; i++) {
                this.pocitadlo.PridejJedna();
            }

            System.out.println(Thread.currentThread().getName() + " právě skončil");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }


    }
}
