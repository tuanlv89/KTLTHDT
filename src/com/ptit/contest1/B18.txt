package com.ptit.level1;

import java.util.ArrayList;
import java.util.Scanner;

//To hop so co tong bang X
public class B18 {
    static int n, k;
    static int[] arr = new int[100];
    static ArrayList<ArrayList<Integer>> result =
            new ArrayList<ArrayList<Integer>>();

    static void solve(int i, int sum, ArrayList<Integer> v) {
        if (sum > k) return;
        if (sum == k) {
            result.add(v);
            return;
        }
        for (int j = 1; j <= n; j++) {
            if (sum + arr[j] <= k) {
                v.add(arr[j]);
                solve(j, sum + arr[j], v);
                v.remove(v.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0){
            n = Integer.parseInt(sc.next());
            k = Integer.parseInt(sc.next());
            for(int i = 1; i <=n; i++){
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            v.clear();
            result.clear();
            solve(1, 0, v);
            if(result.size() == 0){
                System.out.println(-1);
                continue;
            }
            for (int i = 0; i < result.size(); i++) {
                System.out.print("[");
                for (int j = 0; j < result.get(i).size() - 1; j++) {
                    System.out.print(result.get(i).get(j));
                    System.out.print(" ");
                }
                System.out.print(result.get(i).get(result.get(i).size() - 1));
                System.out.print("] ");
            }
            System.out.println();
        }
    }
}
