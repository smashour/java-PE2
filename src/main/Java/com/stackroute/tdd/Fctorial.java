package com.stackroute.tdd;

public class Fctorial {
    public static void main(String[] args) {
        int num;
        int factorial = 1;

        for (num = 1; num < Integer.MAX_VALUE; num++) {





            if (num == 13) {
                System.out.println("factoril out of bound");
                break;
            }
            factorial = factorial *num;
            System.out.println("Factorial of"+num+"is" + factorial);


        }
        longfactorial();

    }

    public static void longfactorial() {

        long num;
        long factorial = 1;


        for (num = 1; num < Integer.MAX_VALUE; num++) {


            if (num == 21) {
                System.out.println("factoril out of bound");
                break;
            }
            factorial = factorial * num;
            System.out.println("Factorial of" + num + "is" + factorial);


        }
    }

    }


