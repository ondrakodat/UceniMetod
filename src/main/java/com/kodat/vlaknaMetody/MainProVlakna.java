package com.kodat.vlaknaMetody;

import lombok.SneakyThrows;

import java.util.concurrent.CyclicBarrier;

public class MainProVlakna {



    @SneakyThrows
    static void main(String[] args) {
        Pocitadlo pocitadlo = new Pocitadlo();

        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("Vlákna připravena")) ;
        Thread t1 = new Thread(new VlaknoM(pocitadlo, barrier));
        Thread t2 = new Thread((new VlaknoM(pocitadlo, barrier)));
        Thread t3 = new Thread(new VlaknoM(pocitadlo, barrier));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();


        System.out.println("Konečná hodnota: " + pocitadlo.DejHodnotu());


    }
}
