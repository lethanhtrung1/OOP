/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author TRUNG
 */
public class J07015_SoNguyenToTrongFILENhiPhan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) obj.readObject();
        int cnt[] = new int[10000];
        for(int i : arr) {
            if(isPrime(i)) cnt[i]++;
        }
        for(int i = 2; i <= 10000; i++) {
            if(cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
