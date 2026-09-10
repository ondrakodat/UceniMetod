package com.kodat.stringMetody;

import java.util.SortedMap;

public class StringBuilderM {
    /*
     * String builder je proměnlivá sekvence znaku z balicku java.lang
     * Narozdil od Stringu můžeme obsah upravit bez nového objektu
     *  Konstrory :
     * StringBuilder(int i) kde i je počáteční velikost tedy misto pro 50 znaku rovnou
     * StringBuilder(string i) kde incicializujeme builder v s obsahem i
     * StringBuilder(CharSequence i) kde inicializujeme builder pomoci dane CharSequence
     * StringBuilder() - inicializace prazdneho builderu s vychozi kapacitou 16
     * efektivní v aplikacích s jedním vláknem pokud pracujeme s více vlakny je lepší použít StringBuffer
     * Neni thread safe narozdil od Stringu nebo String Bufferu
     * Lze měnit in place stejně jako StringBuffer
     * Použiva se pro single thread string manipulaci
     * Nejrychlejsi oproti Stringu ktery vytvari pokazdy novy objekt či StringBufferu ktery syncrhonizaci
     * Je vhodné ji využít např. při vytváření rozsáhlých řetězcových proměnných kdy není potřeba řešit thread safe
     */

    public String prevracenyString(String text){
        StringBuilder builder = new StringBuilder(text);
        return builder.reverse().toString();
    }

    /*
    // Metoda pro přidání textu na konec textového řetězce
     */
    public StringBuilder pridaniTextu(String text){
        StringBuilder builder = new StringBuilder("Toto je počateční text. ");
        builder.append(text);
        return builder;
    }
    /*
    // Metoda pro pridani textového řetězce na danou pozici
    // Lze také vkládat na místo krom textového řetězce také číselné hodnoty, objekt či pole znaků
    */
    public StringBuilder InserTextu(String text){
        StringBuilder s = new StringBuilder("Before insert");
        s.insert(10, text);
        return s;
    }
    /*
        Metoda pro získání znaku na určité pozici
     */
    public char ZiskejCharNaPozici(int pozice){
        StringBuilder builder = new StringBuilder("TotoJeTextBezMezer");
        return builder.charAt(pozice);
    }

    /*
    * Metoda pro výměnu znaku na určité pozici za daný text
    */
    public StringBuilder ZmenPoziciZnaku(){
        StringBuilder builder = new StringBuilder("Text pro otočeni");
        builder.replace(0, 5, "Toto se pridalo a vyměnilo za original");
        return builder;
    }

    /*
    * Metoda pro vybrání výřezu oblasti textového řetězce
    */
    public String UdelejSubString(int i, int j){
        StringBuilder sb = new StringBuilder("TotoJeTextBezMezer");
        String vysledek = sb.substring(i, j);
        return vysledek;
    }
    /*
        Získání posledni pozice daného znaku či řetězce v textu
     */
    public int PosledniIndexStringu(String text){
        StringBuilder builder = new StringBuilder("texttexttext1");
        int index = builder.lastIndexOf(text);
        return index;
    }

    public StringBuilder NahradTeckyZaCarky(){
        StringBuilder builder = new StringBuilder("Toto je text. ktery obsahuje tecky misto carek. musime ho změnit, Take jsou prohozené čarky misto teček takže i to se musí opravit,");
        System.out.println("Zacina uprava textu o delce " + builder.length());
        for (int i = 0; i < builder.length(); i++){
            if(builder.charAt(i) == ','){
                builder.setCharAt(i, '.');
                continue;
            }else if(builder.charAt(i)=='.'){
                builder.setCharAt(i, ',');
            }
        }
        return builder;
    }

}
