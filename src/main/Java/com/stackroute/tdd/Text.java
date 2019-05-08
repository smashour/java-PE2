package com.stackroute.tdd;

import java.io.File;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws Exception {
        File file=new File("/home/shrein/Documents/newfile.txt");
        Scanner input=new Scanner(file);
        while(input.hasNextLine())
        {
            System.out.println(input.nextLine().toUpperCase());
        }

    }
}
