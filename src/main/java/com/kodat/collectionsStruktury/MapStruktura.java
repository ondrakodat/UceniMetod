package com.kodat.collectionsStruktury;

/*
    Struktura Map ukládá hodnoty ve dvojici klíč a hodnota
        je tedy hodně podobná Redisu kde ukládáme také key-value
        nemůže obsahovat duplicity
        Typicky Map<K,V> kde K je klíč a V je typ který je mapovany
        Některé typy implementace mají omezené typy jež může K nabývat
        Klíče musí bát unikátní, nicméně hodnoty ne
        Vyhledáváme zde podle klíče
        Implementace :
            HashMap
            TreeMap
            Hashtable

        HashMap - nejtypičtější implementace Mapy
                - pokud vložíme duplicity tedy první a poté b. V tomto případě
                    b přepíše hodnotu a.
                - negarantuje nám pořadí prvků
                - není synchronizovaná
                - velmi rychlé hledání podle klíče

        TreeMap - udržuje nám klíče seřazené, typicky využito v db.
                - pomalejší než hashset
                - klíče se musí dát porovnat
                - založený na stromové struktuře

        HashTable - je starší implementace HashMap
                  - nepovoluje null hodnoty
                  - je synchronizovany
                  - dnes je již moc nevyužívá

 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapStruktura {
    public void VytvorHashMapuVlozASmaz(){
        HashMap<Integer, Employee> employees = new HashMap<>();
        Employee e1 = new Employee(1, "Ondra");
        Employee e2 = new Employee(2, "Bohumil");
        Employee e3 = new Employee(3, "Petr");
        Employee e4 = new Employee(4, "Emil");

        employees.put((int)e1.getId(), e1);
        employees.put((int)e2.getId(), e2);
        employees.put((int)e3.getId(), e3);
        employees.put((int)e4.getId(), e4);
        System.out.println("Mapa pred odsraněním");

        for (int i = 1; i <= 4; i++) {
            System.out.println(employees.get(i));
        }
        System.out.printf("Mapa po odsranění \n");

        employees.remove(4);

        for (int i = 1; i <= 4; i++) {
            System.out.println(employees.get(i));
        }

    }



}
