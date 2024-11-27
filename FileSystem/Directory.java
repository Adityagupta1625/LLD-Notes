package FileSystem;

import java.util.ArrayList;

public class Directory implements FileSystem {
    private String name;
    private ArrayList<FileSystem> fileSystemList;

    public Directory(String name) {
        this.name = name;
        this.fileSystemList = new ArrayList<FileSystem>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFile(FileSystem fileSystemObj) {
        this.fileSystemList.add(fileSystemObj);
    }

    public void ls() {
        System.out.println("Directory: " + name);
        for (FileSystem fileSystemObj : fileSystemList) {
            fileSystemObj.ls();
        }
    }
}
