package com.kodat;

import com.kodat.stringMetody.StringBufferM;
import com.kodat.stringMetody.StringBuilderM;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StringBufferM m = new StringBufferM();
        StringBuffer builder = m.NahradTextNaDanemIndexu();
        System.out.println(builder);
    }
}
