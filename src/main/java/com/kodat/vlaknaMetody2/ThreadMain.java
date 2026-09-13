package com.kodat.vlaknaMetody2;

import com.kodat.vlaknaMetody.Pocitadlo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/*
    Pro práci s vlákny v Jave typicky můžeme využít 2 způsoby
        Rozšířit vlastní třídu ThreadImplementaci o třídu Thread a přepsat metodu run kam napíšeme co chceme aby naše vlákno provedlo za operaci
        Implementovat runneable rozhraní, opět přepíšeme metodu pro run kam dáme náš kod pro vlákno který má vykonat, potom vytvoříme objektu Thread a předáme mu parametrem
            náš obejt Runneable objekt

     DOPORUČENÍ
        Rozšiřovat třidou thread pokud není potřeba rozšířit jinou třídu. Implementujme runeable rozhraní pokud už musíme implementovat jinou třídu.
            Většinou se preferuje implementace rozhraní
        Implementace rozhraní je také více flexibilní a znovupoužitelá.

 */

public class ThreadMain {
    static void main() {
        Thread[] vlakna = new Thread[2];

        CyclicBarrier c = new CyclicBarrier(vlakna.length, ()->{
            System.out.println("Vlakna cekaji na bariere ");
        });
        PocitadloProThread p = new PocitadloProThread();


        for (int i = 0; i < vlakna.length; i++) {
          vlakna[i] = new Thread(new ThreadIm(p, c));
          vlakna[i].start();
        }



        try {
            for(Thread t : vlakna){
                t.join();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(p.dejHodnotu() + " je výsledek.");






    }
}
