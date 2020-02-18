package com.company;

public class Main {

    public static void main(String[] args) {
        String text = "hello there";
        String encryptionText = "program";

        Vigenere vigenere = new Vigenere();
        String encryptedText = vigenere.encrypt(text, encryptionText).toString();

        System.out.println("Text to encrypt:" + text);
        System.out.println("Keyword:" + encryptionText);
        System.out.println("Encrypted text: " + encryptedText);
        System.out.println("Decrypted text: " + vigenere.decrypt(encryptedText, encryptionText));

    }
}
