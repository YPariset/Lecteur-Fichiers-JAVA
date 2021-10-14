package org.example;

import org.example.readers.NormalReader;
import org.example.readers.PalindromeReader;
import org.example.readers.ReverseReader;

import java.util.Scanner;

/**
 * Hello world!
 * Made by Parizoo
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NormalReader reader = new NormalReader();
        ReverseReader reverseReader = new ReverseReader();
        PalindromeReader palindromeReader = new PalindromeReader();

        Scanner scanner = new Scanner(System.in);
        String filePath = "";

        System.out.println("Please enter a file path : ");
        filePath = scanner.nextLine();

        System.out.println("\n\t--------  Normal Reader  ----------\n");
        reader.openFile(filePath);

        System.out.println("\n\t--------  Reverse Reader  ----------\n");
        reverseReader.openFile(filePath);

        System.out.println("\n\t--------  Palindrome Reader  --------\n");
        palindromeReader.openFile(filePath);

    }
}
