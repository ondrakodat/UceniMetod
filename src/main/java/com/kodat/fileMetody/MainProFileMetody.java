package com.kodat.fileMetody;

public class MainProFileMetody {
    static void main() {
        IoUlohy so = new IoUlohy();
        so.VytvorSouborPresNio();
        System.out.println(so.ZiskejDataZeSouboru());
        so.VypisDataZeSouboru();
        so.VytvorBinSouborAUlozData();
        System.out.println("Obsah bin souboru");
        System.out.println(so.vypisObsahBinSouboru());
    }
}
