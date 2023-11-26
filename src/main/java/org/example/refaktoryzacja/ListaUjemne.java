package org.example.refaktoryzacja;

import java.util.ArrayList;
import java.util.List;

public class ListaUjemne {
    static ArrayList<Integer> getUjemne(List<Integer> list) {
        var ujemne = new ArrayList<Integer>();
        for (Integer integer : list) {
            if (integer < 0)
                ujemne.add(integer);
        }
        return ujemne;
    }
}
