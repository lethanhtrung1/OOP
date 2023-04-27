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
public class J01008 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 1; j <= t; j++) {
            int num = sc.nextInt();
            System.out.printf("Test %d: ", j);
            int cnt = 0, i = 2;
            while(num > 1) {
                if(num % i == 0) {
                    cnt++;
                    if(num == i) {
                       System.out.printf("%d(%d) ", i, cnt); 
                    }
                    num /= i;
                }
                else {
                    if(cnt > 0) {
                        System.out.printf("%d(%d) ", i, cnt);
                        cnt = 0;                        
                    }
                    i++;
                }
            }
            System.out.println();
        }
    }
}
