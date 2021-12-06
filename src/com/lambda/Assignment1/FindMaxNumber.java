package com.lambda.Assignment1;

import java.util.Scanner;

interface MaxNumber{
  int result(int a, int b);
}

public class FindMaxNumber {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first element");
        int first=sc.nextInt();
        System.out.println("enter second element");
        int second=sc.nextInt();
        //lambda Expression
        MaxNumber obj=(a,b)->  a > b ? a : b;

//            int maxNum = Integer.max(a,b); //using max function
//            return maxNum ;

        System.out.println("Max Number is:- "+obj.result(first,second));
        };
    }
