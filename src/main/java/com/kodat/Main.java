package com.kodat;

import com.kodat.collectionsStruktury.Employee;
import com.kodat.collectionsStruktury.ListStruktura;
import com.kodat.collectionsStruktury.MapStruktura;
import com.kodat.collectionsStruktury.SetStruktura;
import com.kodat.fileMetody.SouboryMetody;
import com.kodat.streamMetody.StreamM;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StreamM stream = new StreamM();
        for (Employee e : stream.NajdiZamestnanceFiltr()){
            System.out.println(e.toString());
        }
    }
}
