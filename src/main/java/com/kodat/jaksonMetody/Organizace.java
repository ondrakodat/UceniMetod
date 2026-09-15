package com.kodat.jaksonMetody;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organizace {
    @JsonProperty("organizace_nazev")
    private String organizaceNazev;
    private String description;
    private int employees;

    @Override
    public String toString() {
        return "Organizace{" +
                "organizace_nazev='" + organizaceNazev + '\'' +
                ", description='" + description + '\'' +
                ", employees=" + employees +
                '}';
    }
}
