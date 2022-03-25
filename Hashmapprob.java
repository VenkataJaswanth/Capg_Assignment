package com.Testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Hashmapprob {
    public void mapsort(Map<String, String> map)
    {
        TreeMap<String, String> sorted = new TreeMap<>();
        sorted.putAll(map);
        System.out.println("After Sorting ");
        for (Map.Entry<String, String> entry : sorted.entrySet())
            System.out.println(entry.getKey() +
                    "," + entry.getValue());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        System.out.println("Enter no of values");
        int n=sc.nextInt();
        System.out.println("enter the values ");
        for (int i = 0; i < n; i++) {
            System.out.print("key ");String a = sc.next();
            System.out.print("value ");String b = sc.next();
            map.put(a, b);
        }
        Hashmapprob ob=new Hashmapprob();
        ob.mapsort(map);
    }
}
