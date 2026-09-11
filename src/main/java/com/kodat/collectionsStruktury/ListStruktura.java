package com.kodat.collectionsStruktury;
/*
    Zdroje :
    https://www.geeksforgeeks.org/java/arraylist-vs-linkedlist-java/
    https://www.baeldung.com/java-collections-complexity
    https://docs.oracle.com/javase/8/docs/api/java/util/List.html


    List sam o sobě je interface který můžeme využít pomocí ArrayListu či LinkedListu
    Umožňuje nám vyhledávat data podle indexu či vkládat duplicity
    Hlavní metody jsou např.
        Add
        Remove
        Get
        Set
        Size
    ArrayList x LinkedList
    Obě dvě varianty implemetnují List, také obě zachovávají pořadí, vkládání a umožnují duplicity
    Liší se v struktuře v paměti, přístupem k datům a výkonem při vkládání a mazání
    ArrayList je založen na dynamickém poli zatímco LinkedList je založen na dvojitě propojeném seznamu
    ArrayList umožnuje rychlejší náhodný přístup a LinkedList umožnuje rychlé vkládání a mazání

    ArrayList je založen na dynamickém poli tedy umožnuje nám rychle hledat prvky podle indexu s časovou složitosti O(1) zatímco vkládání doprostred seznamu
            nám vytváří složitost O(n) jelikož musíme přeuspořádat celé pole jelikož je fyzicky v paměti za sebou

    LinkedList je založen na spojovém seznamum tedy uzly nejsou v paměti za sebou ale uchovávají pouze odkazy na předešlý uzel a následující tedy umožnují nám rychlé vkládání
            i mazání odkudkoliv ze seznamu se složitostí O(1) jelikož pouze změníme odkazy u sousedů a nemusíme nic přeuspořádávat
            Nicméně nevýhodou zde je pomalejší přístup k prvkům než u ArrayListu který dává O(1) a u LinkedListu máme O(n) jelikož musíme projít n prvků než se dostaneme k
            požadovanému prvku.

     NÍŽE SI UDĚLÁME JEDNODUCHÝ BENCHMARK TEST KTERÝ VYUŽIJE TŘÍDU EMPLOYEES
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStruktura {
    public void OtestujListy(){
        List<Employee> listZamestnanciArray = new ArrayList<>();
        List<Employee> listZamestnanciLinked = new LinkedList<>();
        int iterace = 200_000;
        for (int i = 0; i < iterace; i++){
            listZamestnanciArray.add(new Employee(i, "Employee" + i));
            listZamestnanciLinked.add(new Employee(i, "Employee" +i));
        }
        //Array
        long start = System.nanoTime();
        for (int i = 0; i < iterace; i++){
            listZamestnanciArray.get(i);
        }
        long konec = System.nanoTime();

        System.out.println("Ziskání všech zaměstnanců v array listu.  Čas :" + ((konec - start)/1_000_000_000) + "s");

        start = System.nanoTime();
        for (int i = 0; i < iterace; i++){
            listZamestnanciLinked.get(i);
        }
        konec = System.nanoTime();

        System.out.println("Ziskání všech zaměstnanců v linked listu. Čas :" + ((konec - start)/1_000_000_000) + "s");

        start = System.nanoTime();
        listZamestnanciArray.get(100_000);
        konec = System.nanoTime();

        System.out.println("Získání zamestnance na indexu 500_000 v arrayListu  : " + ((konec - start)/1_000_000_000) + "s");

        start = System.nanoTime();
        listZamestnanciLinked.get(100_000);
        konec = System.nanoTime();

        System.out.println("Získání zamestnance na indexu 500_000 v linkedListu : " + ((konec - start)/1_000_000_000) + "s");

    }



}
