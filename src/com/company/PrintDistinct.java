package com.company;
import java.util.Scanner;

public class PrintDistinct {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of elements of array: ");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        int[] arr = new int[n];
        int i,j;
        System.out.println("Enter elements: ");
        for( i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.print("The Distinct elements are: ");
        for (i=0;i<n;i++){
            for (j=0;j<i;j++){
                if (arr[i]==arr[j])
                    break;
            }
            if (i==j)
                System.out.print(arr[i]+" ");
        }
    }
}