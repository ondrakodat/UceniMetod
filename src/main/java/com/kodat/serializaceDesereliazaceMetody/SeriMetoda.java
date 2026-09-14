package com.kodat.serializaceDesereliazaceMetody;

import com.kodat.collectionsStruktury.Employee;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SeriMetoda {
    public void Serializuj(){
        List<EmployeeS> zamestnanciS = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            zamestnanciS.add(new EmployeeS(i, "nazev" + i, i+10));
        }
        Path cesta = Path.of("employesS.bin");

        try (FileOutputStream stream =
                     new FileOutputStream(cesta.toFile())){
            ObjectOutputStream objectStream = new ObjectOutputStream(stream);
            objectStream.writeObject(zamestnanciS);
            System.out.println("Serializace proběhla");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public List<EmployeeS> deserealizuj(){
        Path cesta = Path.of("employesS.bin");
        List<EmployeeS> vysledek;
        try (FileInputStream input = new FileInputStream(cesta.toFile())){
            ObjectInputStream inputO = new ObjectInputStream(input);
            try {
                 vysledek =(List<EmployeeS>) inputO.readObject();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return vysledek;

    }

}
