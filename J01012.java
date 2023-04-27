/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int count = 0;
            for(int i = 1; i <= Math.sqrt(n); i++) {
                if(n % i == 0 && i % 2 == 0) count++;
                if(n % (n/i) == 0 && (n/i) % 2 == 0 && i != n/i) count++;
            }
            System.out.println(count);
        }
    }    
}
