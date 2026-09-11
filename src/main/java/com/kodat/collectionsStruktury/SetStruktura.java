package com.kodat.collectionsStruktury;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
    Set je struktura, která neobsahuje žádné duplicity ! To je její hlavní vlastnost
    Máme různé implementace např.
        TreeSet
        HashSet
        LinkedHashSet
        AbstractSet
    Základní metody :
        size()
        empty()
        contains()
        interator()
        toArray()
        add()
        remove()
        addAll(Collection<?> c) - pridání kolekce
        containsAll(Collection<?> c) - obsahuje celou kolekci ?
        retainAll (Collection<?> c) - zanecha v Setu pouze prvky které jsou v mnozine
        removeAll(Collection<?> c)
        clear()
        equals(Object o)


    Rozdíli v jednotlivých strukturách
        HashSet - nejrychlejší tabulka pro vyhledávání, přidávání a mazání
                - Nezachovává pořadí prvků
                - Zabírá nejmenší místo v paměti
                - Složitost průměrná O(1)

        TreeSet - Prvky jsou seřazene a složitost je O(log n)
                - Implementace např. Red Black tree
                - Největší místo v paměti z vypsaných Setu
        LinkedListSet
                - prvky jsou seřazeny v pořadí ve kterém byly vloženy
                - stejně rychlý jako hash set
                - o něco větší místo v paměti než hash set
 */
public class SetStruktura {
    public void VytvorVyhledejSmazHashSet(){
        Set<Employee> set = new HashSet<>();
        set.add(new Employee(1, "Ondra"));
        set.add(new Employee(2, "Bohous"));
        set.add(new Employee(3,"Petr"));
        Employee emil = new Employee(4, "Emil");
        set.add(emil);
        set.remove(emil);
        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            Employee e = iterator.next();
            System.out.println(e);
        }

    }


}
