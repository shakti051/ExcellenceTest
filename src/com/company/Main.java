package com.company;

import java.util.Scanner;
/** Define an array of numbers (use any random numbers).
 * Write a program to print only the even numbers of the array.
 * Do not use any library functions, need to do via for loops only
 * **/
public class Main {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of elements of array: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[]arr = new int[n];

        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            arr[i] = scanner.nextInt();

        for(int i=0;i<n;i++){
            if (arr[i]%2==0)
                System.out.println("Even: "+arr[i]);
        }
    }
}
