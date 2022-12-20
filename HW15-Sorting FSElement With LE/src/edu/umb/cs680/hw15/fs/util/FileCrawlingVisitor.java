package edu.umb.cs680.hw15.fs.util;

import edu.umb.cs680.hw15.fs.Directory;
import edu.umb.cs680.hw15.fs.FSVisitor;
import edu.umb.cs680.hw15.fs.File;
import edu.umb.cs680.hw15.fs.Link;

import java.util.LinkedList;

public class FileCrawlingVisitor implements FSVisitor {

    public static LinkedList<File> files = new LinkedList<File>();;

    public void visit(Link link) {}

    public void visit(Directory dir){};

    public void visit(File file){
        files.add(file);
    };

    public LinkedList<File> getFiles() {
        return files;
    }
}
