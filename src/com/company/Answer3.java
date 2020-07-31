package com.company;

import java.util.Scanner;
/**Suppose you have an array of 101 integers.
 * This array is already sorted and all numbers in this array are consecutive.
 * Each number only occurs once in the array except one number which occurs twice. Write a js code to find the repeated number.
 * **/
public class Answer3 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of elements of array: ");//Enter 101
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter elements in sorted and consecutive order: ");

        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            arr[i] = scanner.nextInt();

        for (int i = 0;i<arr.length;i++){
              if (arr[i]!=i)
                  System.out.println("The repeated num is "+arr[i]);

        }
    }
}
