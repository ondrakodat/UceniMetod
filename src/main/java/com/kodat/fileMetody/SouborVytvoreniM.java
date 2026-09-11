package com.kodat.fileMetody;

import java.io.File;
import java.io.IOException;
/*
    Třída java.nio.file.Files
    Tato třída se skládá výhradně ze statických metod, které nám umožnují pracovat se soubory
    Zde testujeme zda soubor existuje pomoci staticé metody Files.exists kam jako parametr zadáme Path
        tato metoda mže vyhodit SecurityException, který defaultně spustí SecurityManagera který kontroluje tedy zda např. nemáme jen oprávnění na čtení

    Meži nejdůležitější metody java.nio.file.Files jsou :
    CreateFile(Path path, FileAtributy<?> ... args) ta nám vytvoří prázdný soubor a selže pokud soubor již existuje
        - může vyhodit
            UnsuportedOperationalExeption - pokud pole obsahuje atribut ktery nelze nastavit atomicky při vytváření souboru
            FileAlreadyExistException - pokud soubor už existuje
            IOException - pokud nastane I/O chyba nebo neexistuje adresar
            SecurityExeption - pokud nemáme dostatečná oprávnění
    CreateDirectory
    CreateDirectories
    IsRegularFile
 */
import java.nio.file.Files;
 /*
    Třída Path se skládá především ze statických metod, které nám vrátí cestu převodem řetězce cesty nebo URI.
    Má dvě hlavní metody
    get(String first, String more...) - Převádí řetězce cesty do jednoho vysledného objektu
        - může vyhodit vyjímku InvalidPathException tedy kdy se objekt nedá převést na Path
    get(URI uri) - převede zadané uri na objekt Path
        - může vyhodit
            -IllegalArgumentStatement - vyjímka se vyhodí pokud např. napíšeme nepovolený znak který se v systému nemůže používat
            -FileSystemNotFoundException - vyjímka za běhu pokud se nedokáže najít souborový systém
            -SecurityException - pokud nemáme dostatečná oprávnění pro vytvoření souboru
    píší se místo get se píše of
     */
import java.nio.file.Path;

public class SouborVytvoreniM {

    public void VytvorSouborPresJavaIoFile() throws IOException{
        File file = new File("file.txt");
            file.delete();
            if(file.createNewFile()){
                System.out.println("Soubor byl vytvořen");
            }else {
                System.out.println("Soubor nebyl vytvořen, již existuje");
            }

    }

    /*
    Využití
     */
    public void VytvorSouborPresJavaNioFiles() throws Exception{
        Path cesta = Path.of("Cesta.txt");
        if(!Files.exists(cesta)){
            Files.createFile(cesta);
        }else{
            System.out.println("Soubor jiz existuje");
        }
    }
}
