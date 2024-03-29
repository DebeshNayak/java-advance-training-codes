package com.example.java;

import com.example.java.filetree.MyFileVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        Path fileDir = Paths.get("files");

        MyFileVisitor visitor = new MyFileVisitor();
        Files.walkFileTree(fileDir, visitor);
    }
}
