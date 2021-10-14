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
                builder.append("\n");
                String line2 = Palindrome(line);
                if (isPalindrome(line, line2)==true){
                    System.out.println("I'm a palindrome");;
                } else {
                    System.out.println("I'm not a palindrome");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create string reverse
     * @param s
     * @return
     */
    private static String Palindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return String.valueOf(stringBuilder.reverse());
    }

    /**
     * compare both string and check if is a palindrome
     * @param s1
     * @param s2
     * @return
     */
    private static boolean isPalindrome(String s1, String s2){
        if (s1.equals(s2))
        {
            return true;
        }
        else {
            return false;
        }
    }

}
