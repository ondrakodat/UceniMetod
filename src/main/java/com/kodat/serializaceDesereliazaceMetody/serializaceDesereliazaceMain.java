package com.kodat.serializaceDesereliazaceMetody;

import com.kodat.collectionsStruktury.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class serializaceDesereliazaceMain {
    static void main() {
        SeriMetoda serializace = new SeriMetoda();
        serializace.Serializuj();
        List<EmployeeS> vysledekDeseralizace = new ArrayList<>();
        for (EmployeeS e : serializace.deserealizuj()){
            System.out.printf(e.toString() + "\n");
        }
    }
}

