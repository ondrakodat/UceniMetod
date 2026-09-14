package com.kodat.serializaceDesereliazaceMetody;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeS implements Serializable {
    private static final long serialVersionUID = 1;
    private long id;
    private String nazev;
    private int vek;
}
