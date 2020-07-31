package com.company;

import java.util.Scanner;

/**
 * Find the maximum consecutive 1's in an array of 0's and 1's.
 * **/
public class Answer2 {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of elements of array: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter elements in the array  but only 0 or 1 : ");// Enter binary array

        for (int i = 0;i<n;i++)  // inserting n elements in the array;
            arr[i] = scanner.nextInt();

            int result = 0;
            int count = 0;
        for (int i=0;i<arr.length;i++){
            // Reset count when 0 is found
                if (arr[i]==0)
                    count = 0;
                else {
                    count++;//increase count
                    result = Math.max(result, count);
                }
        }
        System.out.println("The maximum consecutive 1: "+result +" times");
    }
}
