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
public class J03025_XauDoiXung {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0) {
            String s = in.nextLine();
            int count = 0;
            for(int i = 0; i <= (s.length() - 1) / 2; i++) {
                if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    count++;
                }
            }
            if((s.length() % 2 == 0 && count == 1) || (s.length() % 2 == 1 && count <= 1)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }    
}
