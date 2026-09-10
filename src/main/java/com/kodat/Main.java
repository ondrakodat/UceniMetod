package com.kodat;

import com.kodat.stringMetody.StringBuilderM;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StringBuilderM m = new StringBuilderM();
        StringBuilder builder = m.NahradTeckyZaCarky();
        System.out.println(builder);
    }
}
