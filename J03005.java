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
public class J03005 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0) {
            String s = in.nextLine();
            ChuanHoa(s);
        }
    }
    public static void ChuanHoa(String s) {
        String res = s.trim();
        while(res.contains("  ") == true) {
            res = res.replace("  ", " ");
        }
        String[] a = res.split(" ");
        res = "";
        for(int i = 1; i < a.length; i++) {
            if(i != a.length - 1) {
               res += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase() + " "; 
            }               
            else {
               res += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase() + ", "; 
            }
        }
        res += a[0].toUpperCase();
        System.out.println(res);
    }
}
