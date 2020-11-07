package com.ptit.level1;
//Phan tich so nguyen
import java.util.Scanner;

public class B24 {
    static int n, s;
    static int[] arr = new int[100];
    static boolean check;

    static void printSolution(){

    }

    static void generate(){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            s = 1;
            arr[s] = n;
            check = false;
            while(!check){
                printSolution();
                generate();
            }
            System.out.println();
        }
    }
}
