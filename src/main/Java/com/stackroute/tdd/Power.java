package com.stackroute.tdd;

public class Power {
    public int number(int n)
    {
        if(n==0)
            return 0;
        while (n>0){
            if(n%4!=0)
                return 0;
            else {
                n = n / 4;
                return 1;
            }
        }
        return 1;
    }

}
