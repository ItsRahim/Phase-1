package com.phase1;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    public static void showAllFiles() {
        File directoryFiles = new File(System.getProperty("user.dir"));
        File[] allFiles = directoryFiles.listFiles();
        List<File> sortedFile = Arrays.stream(allFiles)
                .sorted().toList();

        for(File f: sortedFile) {
            System.out.println(f);
        }
    }

    public static void detailedView() {
        Scanner input = new Scanner(System.in);
        List<Integer> validOptions = Arrays.asList(1 ,2, 3, 4);
        int option;
        do {
            System.out.println("""
                    Please Choose from one of the following options
                    1: Add File
                    2: Delete File
                    3: Search File
                    4: Main Menu""");
            option = Integer.parseInt(input.nextLine());
        } while (!validOptions.contains(option));

        switch (option) {
            case 1:
                System.out.println("Enter name of new file with extension");
                String fileName = input.nextLine();
                FileHandler.addFile(fileName);
                break;
            case 2:
                System.out.println("Enter name of file to delete with extension");
                String toDelete = input.nextLine();
                FileHandler.deleteFile(toDelete);
                break;
            case 3:
                System.out.println("Enter name of file with extension");
                String toSearch = input.nextLine();
                FileHandler.searchFile(toSearch);
            case 4:
                Main.menuChoice();
        }
    }
}
