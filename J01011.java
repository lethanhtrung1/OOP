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
public class J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            Long x = sc.nextLong();
            Long y = sc.nextLong();
            Long z = gcd(x, y);
            System.out.println(x * y / z + " " + z);
        }
    }
    public static Long gcd(Long x, Long y) {
        if(y == 0) return x;
        return gcd(y, x % y);
    }   
}
