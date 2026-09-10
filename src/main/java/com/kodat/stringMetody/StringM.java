package com.kodat.stringMetody;

public class StringM {
    public void SplitRetezcePodleCharu(){
        String text = "Tento text, je oddělen čárkami, aby se dal rozdělit namenší, či na větší";
        String[] texty = text.split(",");
        int i = 1;
        for (String s : texty){
            System.out.println("Text číslo : " + i + s);
            i++;
        }
    }

}
