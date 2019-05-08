package com.stackroute.tdd;

public class Member{
    String name;
    int age;
    double salary;


    Member(String name,int age,double salary){
    this.name=name;
    this.age=age;
    this.salary=salary;

    }

}
 class Details{
    public static void main(String[] arg)
    {
        Member person=new Member("Harry Potter",30,2500.3);
        System.out.println("Members Name:"+person.name+"\nMembers Age:"+person.age+"\nMembers Salary:"+person.salary);
    }
}
