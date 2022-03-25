package com.Testing;

import java.util.Scanner;

public class RevArray {
    public void rev(int arr[], int n) {
        int[] arr1 = new int[n];
        int len = n;
        for (int i = 0; i < n; i++) {
            arr1[len - 1] = arr[i];
            len = len - 1;
        }
        System.out.println("Reversed array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        RevArray ob = new RevArray();
        ob.rev(arr,n);
    }
}