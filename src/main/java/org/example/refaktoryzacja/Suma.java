package org.example.refaktoryzacja;

import java.util.ArrayList;

public class Suma {


    static int getSuma(ArrayList<Integer> dodatnie) {
        var sumaDodatnich = 0;
        for (Integer integer : dodatnie) sumaDodatnich += integer;
        return sumaDodatnich;
    }
}
