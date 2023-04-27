/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.*;

/**
 *
 * @author TRUNG
 */
public class J02028_DayConLienTiepTongBangK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t--> 0) {
            int n = in.nextInt();
            long k = in.nextLong();
            ArrayList<Long> arr = new ArrayList<>();
            Set<Long> set = new HashSet<>();
            for(int i = 0; i < n; i++) {
                long tmp = in.nextLong();
                if(i == 0) arr.add(tmp);
                else arr.add(tmp + arr.get(i-1));
                set.add(arr.get(i));
            }
            if(check(arr, n, k, set)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean check(ArrayList<Long> arr, int n, long k, Set<Long> set) {
        if(k == 0) return false;
        if(arr.contains(k) == true) return true;
        for(int i = 0; i < n; i++) {
            int sz = set.size();
            set.add(arr.get(i) + k);
            if(set.size() == sz)
                return true;
            else
                set.remove(arr.get(i) + k);
        }
        return false;
    }    
}
