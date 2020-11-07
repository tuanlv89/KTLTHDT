package com.ptit.level1;

import java.util.Scanner;

//chuan hoa email PTIT
public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] arr = new String[N + 5];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }
        for(String str : arr){
            String[] strs = str.trim().toLowerCase().split("\\s++");

        }
    }
}
