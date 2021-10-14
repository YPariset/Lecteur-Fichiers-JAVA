package org.example.readers;

import org.example.FileReader;
import java.io.IOException;

public class NormalReader extends FileReader {
    public NormalReader() {
        super();
    }

    /**
     * Normal way
     */
    @Override
    public void readFile() {
        String line = null;
        this.content.clear();

        try {
            while((line = this.file.readLine())!= null) {
                this.content.add(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
