package com.company;

public class Vigenere {
    public StringBuffer encrypt(String text, String key) {

        int keyIteration = 0;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {

            if(Character.isAlphabetic(text.charAt(i))) {
                //if the letter is uppercase
                if (Character.isUpperCase(text.charAt(i))) {
                    //A is at 65 in ascii, so remove it to use mod 26 (0-25) and then add again

                    char ch = (char) ((((int) text.charAt(i) - 65) + ((int) key.charAt(keyIteration) - 65)) % 26 + 65);

                    result.append(ch);
                } else {
                    //lowercase a is at 97
                    char ch = (char) ((((int) text.charAt(i) - 97) + ((int) key.charAt(keyIteration) - 97)) % 26 + 97);

                    result.append(ch);
                }
            }else{
                result.append(" ");

            }

            //check if the encryption word needs to loop
            if (key.length() < keyIteration) {
                keyIteration++;
            } else {
                keyIteration = 0;
            }
        }

        return result;
    }

    public StringBuffer decrypt(String text, String key) {

        int keyIteration = 0;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                //if the letter is uppercase
                if (Character.isUpperCase(text.charAt(i))) {
                    //A is at 65 in ascii, so remove it to use mod 26 (0-25) and then add again
                    char ch = (char) ((((int) text.charAt(i) - 65) - ((int) key.charAt(keyIteration) - 65) + 26) % 26 + 65);

                    result.append(ch);
                } else {
                    //lowercase a is at 97
                    char ch = (char) ((((int) text.charAt(i) - 97) - ((int) key.charAt(keyIteration) - 97) + 26) % 26 + 97);

                    result.append(ch);
                }

                //check if the encryption word needs to loop
                if (key.length() < keyIteration) {
                    keyIteration++;
                } else {
                    keyIteration = 0;
                }
            } else {
                result.append(" ");
            }
        }

        return result;
    }
}
