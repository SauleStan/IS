package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        AES aes = new AES();
/*
        //reads from file
        File file = new File("C:\\Users\\Saule\\Desktop\\4th semester\\InfoSec\\AES\\text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        char[] buffer = new char [10];
        while(reader.read(buffer) != -1){
            stringBuilder.append(new String(buffer));
            buffer = new char[10];
        }
        reader.close();
        String text = stringBuilder.toString();
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Input text for encryption:");
        String text = input.nextLine();

        System.out.println("Input key:");
        //encryption, decryption and output
        String key = input.nextLine();
        String encryptedText = aes.encrypt(text, key);

        //writes to file if the text has been encrypted
        if(encryptedText != null) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Saule\\Desktop\\4th semester\\InfoSec\\AES\\encryptedTexts\\encryptedText.txt"));
            writer.write(encryptedText + "\n");
            writer.close();
        }

        System.out.println("\n"+ "Text: " + text);
        System.out.println("Key: " + key);
        System.out.println("Encrypted: " + encryptedText);

        //reads encrypted text from a file
        String textToDecrypt = new String(Files.readAllBytes(Paths.get("C:\\Users\\Saule\\Desktop\\4th semester\\InfoSec\\AES\\encryptedTexts\\encryptedText.txt")));
        
        System.out.println("Read from file: " + textToDecrypt);
        System.out.println("Decrypted: " + aes.decrypt(textToDecrypt, key));


    }
}
