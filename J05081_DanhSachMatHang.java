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

class MatHang {
    static int stt = 1;
    String maMatHang, tenMatHang, donViTinh;
    int giaMua, giaBan, loiNhuan;
    public void input(Scanner in) {
        if(stt < 10) maMatHang = "MH00";
        else if(stt < 100) maMatHang = "MH0";
        else maMatHang = "MH";
        maMatHang += Integer.toString(stt++);
        in.nextLine();
        tenMatHang = in.nextLine();
        donViTinh = in.nextLine();
        giaMua = in.nextInt();
        giaBan = in.nextInt();
        loiNhuan = giaBan - giaMua;
    }
    public void output() {
        System.out.println(maMatHang + " " + tenMatHang + " " + donViTinh + " " + giaMua + " " + giaBan + " " + loiNhuan);
    }
}

public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<MatHang> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            MatHang temp = new MatHang();
            temp.input(in);
            l.add(temp);
        }
        Collections.sort(l, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang x, MatHang y) {
                if(x.loiNhuan < y.loiNhuan)
                    return 1;
                else if(x.loiNhuan == y.loiNhuan && x.maMatHang.compareTo(y.maMatHang) > 0)
                    return 1;
                else return -1;
            }
        });
        for(int i = 0; i < n; i++) {
            l.get(i).output();
        }
    }    
}
