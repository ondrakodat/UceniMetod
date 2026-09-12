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
    public HashMap<Integer,Employee> VytvorHashMapuVlozASmaz(){
        HashMap<Integer, Employee> employees = new HashMap<>();
        Employee e1 = new Employee(1, "Ondra");
        Employee e2 = new Employee(2, "Bohumil");
        Employee e3 = new Employee(3, "Petr");
        Employee e4 = new Employee(4, "Ondra");
        Employee e5 = new Employee(5, "Bohumil");
        Employee e6 = new Employee(6, "Petr");
        Employee e7 = new Employee(7, "Ondra");
        Employee e8 = new Employee(8, "Bohumil");
        Employee e9 = new Employee(9, "Petr");
        Employee e10 = new Employee(10, "Emil");

        employees.put((int)e1.getId(), e1);
        employees.put((int)e2.getId(), e2);
        employees.put((int)e3.getId(), e3);
        employees.put((int)e4.getId(), e4);
        employees.put((int)e8.getId(), e8);

    return  employees;
    }



}
