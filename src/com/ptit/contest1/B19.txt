package com.ptit.level1;


import java.util.*;

//So khoi lap phuong
public class B19 {
    static Map<Long, Boolean> v = new TreeMap<>();
    static int[] a = new int[20];
    static long res;
    static ArrayList<Integer> ar = new ArrayList<>();

    static void solve(int i, int n){
        for (int j = 0; j <= 1; j++) {
            a[i] = j;
            if( i == n - 1){
                long ans =0;
                for (int l = 0; l < n; l++){
                    if(a[l] == 1){
                        ans = 10 * ans + ar.get(l);
                    }
                }
                if(v.get(ans) == true && ans != 0 && res < ans){
                    res = ans;
                }
            }
            else solve(i + 1, n);
        }
    }

    public static void main(String[] args) {
        for (long i = 1; i <= 1000000; i++) {
            v.put(i*i*i, true);
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n;
            n = sc.nextLong();
            ar.clear();
            while(n != 0){
                ar.add((int) (n%10));
                n/=10;
            }
            Collections.reverse(ar);
            res = -1;
            solve(0, ar.size());
            System.out.println(res);
        }

    }
}
