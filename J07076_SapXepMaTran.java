/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J07076_SapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MATRIX.in"));
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[] arr[] = new int[m][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    arr[j][i] = in.nextInt();
                }
            }     
            Arrays.sort(arr[k - 1]);
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}