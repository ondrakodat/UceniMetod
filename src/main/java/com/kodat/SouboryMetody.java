package com.kodat;

import java.io.*;

public class SouboryMetody {
    public void VytvorSoubor(){
        File soubor = new File("soubor.txt");
        try {
            if(soubor.createNewFile()){
                System.out.println("Soubor s nazvem " + soubor.getName() + "byl vytvoren : ");
            }else{
                System.out.println("Soubor se nepodarilo vytvorit jelikož existuje uz");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void ZapisDoSouboru(String text){
        try {
            FileWriter writer = new FileWriter("soubor.txt");
            writer.write(text);
            writer.close();
            System.out.println("Uspěšně jsme zapsali do souboru");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void VypisObsahSouboru(){
        try {
            FileReader reader = new FileReader("soubor.txt");
            try {
                System.out.println(reader.read());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
