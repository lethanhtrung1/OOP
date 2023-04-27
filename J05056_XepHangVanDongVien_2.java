/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

/**
 *
 * @author TRUNG
 */

class VanDongVien2 {
    private String ma, ten, thanhTichThucTe, UuTien, thanhTichXepHang;
    private long tongThoiGian;
    private int xepHang;
    public VanDongVien2(int i, String s1, String s2, String s3, String s4) {
        if(i < 10) this.ma = "VDV0" + i;
        else this.ma = "VDV" + i;
        this.ten = s1;
        try {
            DateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            Date start = simpleDateFormat.parse(s3);
            Date end = simpleDateFormat.parse(s4);
            long diff = end.getTime() - start.getTime();
            int tuoi = 2021 - Integer.parseInt(s2.substring(6));
            int uuTien = 0;
            if(tuoi >= 32) {
                this.UuTien = "00:00:03";
                uuTien = 3000;
            } else if(tuoi >= 25) {
                this.UuTien = "00:00:02";
                uuTien = 2000;
            } else if(tuoi >= 18) {
                this.UuTien = "00:00:01";
                uuTien = 1000;
            } else {
                this.UuTien = "00:00:00";
            }
            long h = diff / (60 * 60 * 1000);
            long m = (diff - h * 60 * 60 * 1000) / (60 * 1000);
            long s = (diff - h * 60 * 60 * 1000 - m * 60 * 1000) / 1000;
            this.thanhTichThucTe = String.format("%02d:%02d:%02d", h, m, s);
            h = (diff - uuTien) / (60 * 60 * 1000);
            m = (diff - uuTien - h * 60 * 60 * 1000) / (60 * 1000);
            s = (diff - uuTien - h * 60 * 60 * 1000 - m * 60 * 1000) / 1000;
            this.thanhTichXepHang = String.format("%02d:%02d:%02d", h, m, s);
            this.tongThoiGian = (diff - uuTien) / 1000;
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public long getTongThoiGian() {
        return tongThoiGian;
    }
    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + thanhTichThucTe + " " + UuTien + " " + thanhTichXepHang + " " + xepHang;
    }
}

public class J05056_XepHangVanDongVien_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<VanDongVien2> arr = new ArrayList<>();
        int n = in.nextInt();
        in.nextLine();
        for(int i = 1; i <= n; i++) {
            arr.add(new VanDongVien2(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(arr, new Comparator<VanDongVien2>() {
            @Override
            public int compare(VanDongVien2 o1, VanDongVien2 o2) {
                if(o1.getTongThoiGian() > o2.getTongThoiGian()) return 1;
                if(o1.getTongThoiGian() < o2.getTongThoiGian()) return -1;
                return 0;
            }            
        });
        int xepHang = 0;
        long tmp = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i).getTongThoiGian() > tmp) {
                xepHang = i + 1;
                tmp = arr.get(i).getTongThoiGian();
            }
            arr.get(i).setXepHang(xepHang);
        }
        for(VanDongVien2 it : arr) {
            System.out.println(it);
        }
    }
}
