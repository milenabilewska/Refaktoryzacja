package org.example.refaktoryzacja;

import java.util.List;
import java.util.Scanner;

public class Wynik {
    static void wyik() {
        var scan = new Scanner(System.in);
        List<Integer> list = PobierzOdUzytkownika.getPobierzOdUzytkownika(scan);
        var dodatnie = ListaDodatnie.getDodatnie(list);
        var ujemne = ListaUjemne.getUjemne(list);
        var sumaDodatnichLiczba = Suma.getSuma(dodatnie);
        var sumaUjemnychLiczba = Suma.getSuma(ujemne);
        WyswietlanieWyniku.wynik(sumaDodatnichLiczba, sumaUjemnychLiczba);
    }

}
