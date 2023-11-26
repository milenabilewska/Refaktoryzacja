package org.example.refaktoryzacja;

import java.util.ArrayList;
import java.util.List;

public class ListaDodatnie {
    static ArrayList<Integer> getDodatnie(List<Integer> list) {
        ArrayList<Integer> dodatnie = new ArrayList<>();
        for (Integer integer : list) {
            if (integer >= 0)
                dodatnie.add(integer);
        }
        return dodatnie;
    }
}
