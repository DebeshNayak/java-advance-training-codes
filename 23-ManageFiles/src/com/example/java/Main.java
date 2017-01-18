package com.example.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("files/loremipsum.txt");
        System.out.println(source.getFileName());

        // copy a file
        Path target = Paths.get("files/newfile.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        // delete a file
//        Path toDelete = Paths.get("files/todelete.txt");
//        Files.delete(toDelete);
//        System.out.println("File deleted");

        // create a new directory and move existing file to that directory
        Path newdir = Paths.get("files/newdir");
        Files.createDirectory(newdir);
        System.out.println("New directory has been created.");

        // Moving a file
        Files.move(source, newdir.resolve(source.getFileName()),
                StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File has been moved to the newly created directory");
    }
}
