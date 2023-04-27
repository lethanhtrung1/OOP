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
public class J03031_XauDayDu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            String s = in.next();
            int k = in. nextInt();
            int[] cnt = new int[256];
            for(int i = 0; i < s.length(); i++) {
                cnt[s.charAt(i)]++;
            }
            int count = 0;
            for(int i = 'a'; i <= 'z'; i++) {
                if(cnt[i] > 0) count++;
            }
            if(s.length() >= 26 && count + k >= 26)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
