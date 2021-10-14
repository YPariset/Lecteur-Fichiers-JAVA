package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public abstract class FileReader implements FileReaderInterface {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    protected BufferedReader file;
    protected ArrayList<String> content;

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public FileReader() {
        this.file = null;
        this.content = new ArrayList<String>();
    }

    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    public void openFile(String fileName) {
        try {
            if (fileName.endsWith(".txt")) {
                this.file = Files.newBufferedReader(Paths.get(fileName));
                this.readFile();
            } else {
                System.out.println("This is not the good format");
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (this.file != null) {
                this.closeFile();
            }
        }
    }

    /**
     * Close file
     */
    public void closeFile() {
        try {
            this.file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}