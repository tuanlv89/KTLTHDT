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
public class dao_tu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test>0){
            
            String str = input.nextLine();
            String arr[]= str.split("\\s+");
            for(int i=0;i<arr.length;i++){
                String kq = new StringBuffer(arr[i]).reverse().toString();
                if(i==arr.length-1)System.out.println(kq);
                else System.out.print(kq+" ");
            }
            
            test--;
        }
    }
}
