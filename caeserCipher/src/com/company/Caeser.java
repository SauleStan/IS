package com.company;

public class Caeser {
    public StringBuffer encrypt(String text, int s){

        StringBuffer result = new StringBuffer();

        for(int i = 0; i < text.length(); i++){
            //if the letter is uppercase
            if(Character.isUpperCase(text.charAt(i))){
                //A is at 65 in ascii, so remove it to use mod 26 (0-25) and then add again
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);

                result.append(ch);
                } else {
                //lowercase a is at 97
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);

                result.append(ch);
                }
            }

        return result;
    }

    public StringBuffer decrypt(String text, int s){

        StringBuffer result = new StringBuffer();
        s = 26 - s;

        for(int i = 0; i < text.length(); i++){
            if(Character.isUpperCase(text.charAt(i))){
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);

                result.append(ch);
            } else {
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);

                result.append(ch);
            }
        }

        return result;
    }

}
