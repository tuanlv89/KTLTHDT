/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest_2;

import java.util.Scanner;

/**
 *
 * @author Truong-nd
 */
public class day_xau_fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test =input.nextInt();
        long F[]=new long[93];
        F[1]=F[2]=1;
        for(int i=3;i<93;i++){
            F[i]=F[i-2]+F[i-1];
        }
        while(test>0){
            int n=input.nextInt();
            long i=input.nextLong();
            while(n>2){
                if(F[n-2]>=i) n-=2;
                else {i-=F[n-2];n-=1;}
            }
            if(n==1)System.out.println("A");
            else System.out.println("B");
            test--;
        }
    }
}
