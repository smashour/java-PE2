package com.stackroute.tdd;

import java.util.Scanner;

public class StudentClass {
    public static void main(String[] args) {
      rage(int numberOfStudents,int i,int gradesArray[])    {
        int sum=0;
        float average;
        for(i=0;i<numberOfStudents;i++)
        {
            sum=sum+gradesArray[i];
        }
        average=sum/numberOfStudents;
        System.out.println("The average is "+average);
    }

    public void findMaximum(int numberOfStudents,int i,int gradesArray[])    {
        int max=gradesArray[0];
        for(i=1;i<numberOfStudents;i++)
        {
            if(max<gradesArray[i])
            {
                max=gradesArray[i];
            }
        }

        System.out.println("The maximum grade is "+max);
    }

    public void findMinimum(int numberOfStudents,int i,int gradesArray[])    {
        int min=gradesArray[0];
        for(i=1;i<numberOfStudents;i++)
        {
            if(min>gradesArray[i])
            {
                min=gradesArray[i];
            }
        }

        System.out.println("The minimum grade is "+min);
    }


}

