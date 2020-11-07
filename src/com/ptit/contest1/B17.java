package com.ptit.level1;

import java.util.Scanner;

//Doi cho cac chu so
public class B17 {
    static int k;
    static String str;

    static void swap(char x, char y) {
        int index_x = str.indexOf(Character.toString(x));
        int index_y = str.indexOf(Character.toString(y));
        str = str.substring(0, index_x) + Character.toString(y) + str.substring(index_x, index_y) + Character.toString(x) + str.substring(y, str.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            k = sc.nextInt();
            str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                char Max = str.charAt(str.length() - 1);
                int vt = str.length() - 1;
                for (int j = str.length() - 1; j > i && k > 0; j--) {
                    if (Max < str.charAt(j)) {
                        Max = str.charAt(j);
                        vt = j;
                    }
                }
                if (Max > str.charAt(i) && k > 0) {
                    swap(str.charAt(i), str.charAt(vt));
                    k--;
                }
            }
            System.out.println(str);

        }
    }
}
