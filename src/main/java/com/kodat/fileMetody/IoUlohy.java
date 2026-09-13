package com.kodat.fileMetody;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IoUlohy {

    public void VytvorSouborPresNio(){
        Path cesta = Path.of("data.txt");
        List<String> data = Arrays.asList("Ondra", "Bohous", "Petr");
        if(Files.exists(cesta)){
            System.out.println("Soubor již existuje : ");
            System.out.printf(cesta.toAbsolutePath().toString());
        }else{
            try {
                Files.createFile(cesta);
                Files.write(cesta, data);
                System.out.println("Zaspano do souboru");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<String> ZiskejDataZeSouboru(){
        Path cesta = Path.of("data.txt");
        try {
            List<String> vysledek = Files.readAllLines(cesta);
            return vysledek;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void VypisDataZeSouboru(){
        Path cesta = Path.of("data.txt");
        try {
            byte[] byty = Files.readAllBytes(cesta);
            String textZBytu = new String(byty);
            for (byte b : byty){
                System.out.println(b);
            }
            System.out.printf(textZBytu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }





}
