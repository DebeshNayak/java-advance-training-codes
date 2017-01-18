package com.example.java.filetree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * Created by debes on 17-01-2017.
 */
public class FileFinder extends SimpleFileVisitor<Path> {

    private PathMatcher matcher;
    public ArrayList<Path> foundPaths = new ArrayList<>();

    public FileFinder(String pattern){
        // pattern could be passed with glob or with regular expression
        matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
        // matcher = FileSystems.getDefault().getPathMatcher("regex:" + pattern);
    }

    // compare the pattern with file name
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path name = file.getFileName();
        // report that we are examining particular file
        System.out.println("Examining " + name);
        if(matcher.matches(name)){
            foundPaths.add(file);
        }
        return FileVisitResult.CONTINUE;
    }
}
