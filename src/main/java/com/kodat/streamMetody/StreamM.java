package com.kodat.streamMetody;

import com.kodat.collectionsStruktury.Employee;
import com.kodat.collectionsStruktury.MapStruktura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamM {
    public List<EmployeeDto> VytvorStreamANamapujEmployees(){
        MapStruktura map = new MapStruktura();
        HashMap<Integer, Employee> employeesHashMap = map.VytvorHashMapuVlozASmaz();

        Stream<EmployeeDto> employeesDto = employeesHashMap
                .values()
                .stream()
                .map(employee -> new EmployeeDto(
                        employee.getId(),
                        employee.getJmeno()
                ));

        List<EmployeeDto> listDto = employeesDto.toList();
        return  listDto;
    }

    public List<Employee> VytvorStreamAFiltruj(){
        List<Employee> vysledek = new ArrayList<>();
        MapStruktura map = new MapStruktura();
        HashMap<Integer, Employee> employeeHashMap = map.VytvorHashMapuVlozASmaz();
        vysledek = employeeHashMap.values().stream().filter(employee -> employee.getJmeno().equals("Ondra")).toList();
        return vysledek;
    }

    public List<Integer> VytvorStreamAVemSudaCisla(){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        List<Integer> filtrovana = numbers.stream().filter(number -> number%2 == 0).toList();
        return filtrovana;
    }

    public List<Employee> NajdiZamestnanceFiltr(){
        MapStruktura map = new MapStruktura();
        return map.VytvorHashMapuVlozASmaz()
                .values()
                .stream()
                .filter( e -> e.getJmeno()
                        .contains("Bo"))
                .toList();
    }


}
