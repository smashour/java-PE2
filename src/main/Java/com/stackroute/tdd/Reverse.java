package com.stackroute.tdd;

public class Reverse {

    public String palindrome(String word) {


        String s = "";
        int length = word.length(); //to find stringlength
        int i;
        for (i = length - 1; i >= 0; i--) {

            s = s + word.charAt(i);
        }


        if (s == word){


            return word;
        }
        else {
            return s;
        }

    }



}


