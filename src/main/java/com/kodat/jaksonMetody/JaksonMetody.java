package com.kodat.jaksonMetody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JaksonMetody {
    static void main(String[] args) {
        Organizace org = getObjectData();
        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonString = mapper.writeValueAsString(org);
            System.out.println(jsonString);
                mapper.writeValue(new File("organizace.json"), org);
                System.out.printf("Zapis do jsonu proběhl ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Organizace getObjectData(){
        Organizace org = new Organizace();
        org.setDescription("Organiazce pro JSON format");
        org.setEmployees(10);
        org.setOrganizaceNazev("OrganizaceJSON");
        return  org;
    }
}
