package org.example.readers;

import org.example.FileReader;
import java.io.IOException;

public class ReverseReader extends FileReader {

    public ReverseReader() {
        super();
    }

    /**
     * Reverse way
     */
    @Override
    public void readFile() {
        String line = null;
        this.content.clear();

        try {
            while((line = this.file.readLine())!= null) {
                this.content.add(line);
            }

            for(int i = this.content.size()-1; i >= 0; i--) {
                System.out.println(content.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}