package com.kodat.stringMetody;

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
     */

    public String prevracenyString(String text){
        StringBuilder builder = new StringBuilder(text);
        return builder.reverse().toString();
    }

    /*
    // Metoda pro přidání textu
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

}
