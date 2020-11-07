package com.ptit.level1;

import java.util.PriorityQueue;
import java.util.Scanner;
//Gia tri nho nhat cua xau
public class B29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int k = Integer.parseInt(sc.next());
            String s = sc.next();
            int[] d = new int[300];
            for (int i = 0; i < d.length; i++) {
                d[i] = 0;
            }
            for (int i = 0; i < s.length(); i++) {
                d[s.charAt(i)]++;
            }
            PriorityQueue<Integer> p = new PriorityQueue<>();
            for (int i = 0; i < s.length(); i++) {
                if(d[s.charAt(i)] > 0){
                    p.add(d[s.charAt(i)]);
                    d[s.charAt(i)] = 0;
                }
            }
            while(k > 0 && p.size() > 0){
                k-=1;
                int h = p.poll();
                h--;
                p.add(h);
            }
            long res = 0;
            while(p.size() > 0){
                int m = p.poll();
                res += m * m;
            }
            System.out.println(res);
        }
    }
}
