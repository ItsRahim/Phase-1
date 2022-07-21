package com.phase1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menuChoice();
    }

    static void menuChoice() {
        Scanner input = new Scanner(System.in);
        List<String> validOptions = Arrays.asList("A", "B", "C");
        String option;
        do {
            System.out.println("""
                    Please Choose from one of the following options
                    A: List all Files
                    B: Detailed Options
                    C: Close Application""");
            option = input.nextLine().toUpperCase();
        } while (!validOptions.contains(option));

        switch (option) {
            case "A" -> FileManager.showAllFiles();
            case "B" -> FileManager.detailedView();
            case "C" -> System.exit(0);
        }
    }
}
