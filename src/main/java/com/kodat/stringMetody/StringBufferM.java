package com.kodat.stringMetody;

public class StringBufferM {
    /*
    StringBuffer nám umožnuje vytvářet a upravovat textové řetězce bez nutnosti vytvářet nové tak jako je to u Stringu
    Všechny jeho metody jsou synchonizované narozdíl od StrinBuilderu můžeme je tak bezproblému využít ve více vláknových prostředích
    Je ideální pro využití u textů které se často upravují, mění či nahrazují jinými.
    Můžeme využít 3 typy konstruktoru
    StringBuffer() tedy prázdný konstruktor který nám rezervuje 16 bez přealokace
    StringBuffer(int i) kde i nám explicitně nastavuje velikost bufferu
    StringBuffer(String text) kde text nám nastaví výchozí hodnotu StringBufferu a přidá dalších 16 mist pro znaky bez přealokace
     */

    public StringBuffer VlozTextNaKonec(String text){
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("World !");
        return buffer;
    }

    public StringBuffer VlozTextPodleIndexu(){
        StringBuffer buffer = new StringBuffer(" World!");
        buffer.insert(0, "Hello");
        return  buffer;
    }

    public StringBuffer NahradTextNaDanemIndexu(){
        StringBuffer buffer = new StringBuffer("Hello world!");
        buffer.replace(0, 5, "Welcome ");
        return buffer;
    }

    /*
        Obecně ma StringBuffer stejné metody jako StringBuilder

    */

}
