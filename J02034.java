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
public class J02034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] cnt = new int[201];
        int val_max = 0;
        for(int i = 0; i < n; i++) {
            int x = in.nextInt();
            val_max = Math.max(val_max, x);
            cnt[x]++;
        }
        boolean check = false;
        for(int i = 1; i <= val_max; i++) {
            if(cnt[i] == 0) {
                check = true;
                System.out.println(i);
            }
        }
        if(!check) {
            System.out.println("Excellent!");
        }
    }   
}
