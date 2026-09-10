package com.kodat.ciseleneMetody;

public class NumberM {
    /*
    Cisla se v Jave dělí na několik typů a to Integer types a Floating types
    Integer types jsou celá čísla a Floating jsou čísla s desetinou čárou

    Byte - ukládá čísla od -127 do 127 je vhodné ho využít pokud chceme ušetřit místo a jsme si jisti že hodnota nebude přesahovat rozmezí
    Jeho velikost v paměti je 1B

    Short - ukládá čísla od -32 768 do 32 767 a jeho velikost je 2B v paměti

    Int uchovává velikost od -2147483648 do 2147483647 a je nejčastěji využívaných číselným typem, jeho velikost v paměti je 4B

    Long uchovává velikost od -9223372036854775808 do 9223372036854775807, využíváme ho pokud se nevejde hodnota čísla do intu a měli bychom na jeho konci používat L.
    Jeho velikost v paměti je 8B.

    Floating typy jsou pak:
    Float, který má velikost 4B v paměti a jeho přesnost je 6-7 míst za desetinou čárkou
    Double je druhá možnost která má velikost v paměti 8B a přesnost je 16 mist za desetinou čárkou tedy pro přesnější výpočty je double vhodnější.


    Nejčastěji využívanými metodami pro číselné typy jsou :

     */

        /*
        Metody Min a Max se často použivají pro nastaveni maximální hodnoty např. inventáře či např. zdraví ve hře
         */
        public int NajdiNejvetsiCislo(){
            int i = Math.max(5, 10);
            return i;
        }
        /*
        Poté máme Math.sqrt() který nám vrací odmocninu čísla v závorce tedy např Math.sqrt(64) vrátí 8.0
        Dále Math.abs(-5.5) nám vrátí absolutní hodnotu čísla v závorce
        Math.pow(2, 8) nám vrátí mocninu čísla 2 tedy konkrétně 2na8
        Zaokrouhlování čísel :
            Math.round nám zaokrouhlí podle pravidel klasicky
            Math.ceil cokoliv vetsiho pokud je např. 4.1 bude po zaokrohleni 5
            Math.floor 4.9 bude 4

          Generování náhdoného čísla
          Math.random() nám vygeneruje pseudonáhodné číslo od 0-1
          můžeme také získat číslo 0-100 např. int vysledek = (int)(Math.random()*101)
         */


}
