package org.example.readers;

import org.example.FileReader;
import java.io.IOException;

public class PalindromeReader extends FileReader {

    public PalindromeReader() {
        super();
    }

    /**
     * Palindrome way
     */
    @Override
    public void readFile() {
        String line = null;
        StringBuilder builder = new StringBuilder();
        this.content.clear();

        try {
            while((line = this.file.readLine())!= null) {
                this.content.add(line);
                builder.append(line);
            }

            builder.reverse();
            System.out.println(builder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
