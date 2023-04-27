/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Pair<key, value> {
    private key first;
    private value second;
    public Pair(key f, value s) {
        this.first = f;
        this.second = s;
    }
    private boolean check(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public boolean isPrime() {
        return check((Integer)first) && check((Integer)second);
    }
    @Override
    public String toString() {
        return first + " " + second;
    }
}

public class J07017_LopPAIR_generic {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }   
}
 