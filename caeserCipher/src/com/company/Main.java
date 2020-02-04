package com.company;

public class Main {

    public static void main(String[] args) {
        String text = "xxxyyyyyzzzzz";
        int shift = 5;
        Caeser caeser = new Caeser();
        String encryptedText = caeser.encrypt(text, shift).toString();

        System.out.println("Before encryption: " + text);
        System.out.println("Shift: " + shift);
        System.out.println("After encryption: " + caeser.encrypt(text, shift));
        System.out.println("After decryption: " + caeser.decrypt(encryptedText, shift));


    }
}
