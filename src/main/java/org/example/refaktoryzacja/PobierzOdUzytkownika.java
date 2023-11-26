package org.example.refaktoryzacja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PobierzOdUzytkownika {


    static List<Integer> getPobierzOdUzytkownika(Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        System.out.println("Ile liczb wczytać?");
        var x = scanner.nextInt();
        IntStream.range(0, x).forEach(i -> {
            System.out.println("Podaj kolejną liczbę:");
            list.add(scanner.nextInt());
        });
        return list;
    }
}
