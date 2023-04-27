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
public class J01022_XauNhiPhan {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] s = new long[93];
        s[0] = 0; s[1] = 1;
        for(int i = 2; i < 93; i++) {
            s[i] = s[i-1] + s[i-2];
        }
        String[] x = new String[4];
        x[0] = "0"; x[1] = "1"; x[2] = "01";
        while(t-->0) {
            int n = in.nextInt();
            long k = in.nextLong();
            while(n > 3) {
                if(k <= s[n-2]) {
                    n -= 2;
                } else {
                    k -= s[n-2];
                    n--;
                }
            }
            char[] res = x[n-1].toCharArray();
            System.out.println(res[(int)k - 1]);
        }
    }
}
