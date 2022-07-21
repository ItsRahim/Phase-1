package com.phase1;

import java.io.File;
import java.io.IOException;

public class FileHandler {
    public static void addFile(String fileName) {
        try {
            File newFile = new File(fileName);
            if(newFile.createNewFile()) {
                System.out.println("New File Created");
            } else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Main.menuChoice();
    }

    public static void deleteFile(String toDelete) {
        File newFile = new File(toDelete);
        if(newFile.delete()) {
            System.out.println("File Deleted");
        } else{
            System.out.println("File not Found");
        }
        Main.menuChoice();
    }

    public static void searchFile(String toSearch) {
        File directoryFiles = new File(System.getProperty("user.dir"));
        File[] allFiles = directoryFiles.listFiles();
        File toFind = new File(toSearch);

        for(File f: allFiles) {
            if(f.equals(toFind)) {
                System.out.println("Found");
            } else{
                System.out.println("Not Found");
            }
        }
        Main.menuChoice();
    }
}
