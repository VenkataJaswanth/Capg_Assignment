package com.Testing;
//max and min values program
import java.util.Scanner;
public class Arrayprob {
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public int min(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of values");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrayprob ob=new Arrayprob();
        System.out.println("Max value is:"+ob.max(arr));
        System.out.println("Min value is:"+ob.min(arr));

    }
}
