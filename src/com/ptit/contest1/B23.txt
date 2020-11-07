package com.ptit.level1;

import java.util.Scanner;

//ATM
public class B23 {
    static int n, s;
    static boolean end = false;
    static int[] a = new int[50];
    static int[] b = new int[50];

    static void generate(int k) {
        int i = k;
        while (i > 0 && b[i] == n - k + i) i -= 1;
        if (i <= 0) end = true;
        else {
            b[i] += 1;
            for(int j = 1; j <= k; j++){
                b[j] = b[j - 1] + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = Integer.parseInt(sc.next());
            s = Integer.parseInt(sc.next());
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                end = false;
                for (int j = 1; j <= i; j++) {
                    b[j] = j;
                }
                while (!end){
                    int res = 0;
                    for (int j = 1; j <= i; j++) {
                        res += a[b[j]];
                    }
                    if (res == s){
                        System.out.print(i);
                    }
                    generate(i);
                }
            }
        }
    }

}
