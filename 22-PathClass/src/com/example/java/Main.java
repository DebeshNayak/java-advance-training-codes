package com.example.java;

import java.io.IOError;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("loremipsum.txt");

        System.out.println(path.toString()); // value that passed as a string
        System.out.println(path.getFileName()); // file name
        System.out.println(path.getNameCount()); // number of name
        // System.out.println(path.getName(0)); // specific part of the name
        System.out.println(path.getName(path.getNameCount()-1)); // last part of the name

        // it will throw an exception if we point to a non-existing directory
        // not going to follow symbolic links, I'm only dealing with actual path names.
        Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
        System.out.println(realPath); // Real path
    }
}
