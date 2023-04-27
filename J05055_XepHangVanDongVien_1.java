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

class VanDongVien {
    private String ma, hoTen, thanhTichThucTe, UuTien, thanhTichXepHang;
    private int xepHang;
    private long thoiGianTong;
    public VanDongVien(int i, String hoTen, String s1, String s2, String s3) {
        if(i < 10) this.ma = "VDV0" + i;
        else this.ma = "VDV" + i;
        this.hoTen = hoTen;
        try {
            DateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            Date start = simpleDateFormat.parse(s2);
            Date end = simpleDateFormat.parse(s3);
            int tuoi = 2021 - Integer.parseInt(s1.substring(6, s1.length()));
            int uuTien = 0;
            if(tuoi >= 32) {
                this.UuTien = "00:00:03";
                uuTien = 3000;
            } 
            else if(tuoi >= 25) {
                this.UuTien = "00:00:02";
                uuTien = 2000;
            }
            else if(tuoi >= 18) {
                this.UuTien = "00:00:01";
                uuTien = 1000;
            }
            else 
                this.UuTien = "00:00:00";
            long diff = end.getTime() - start.getTime();
            long gio = diff / (60 * 60 * 1000);
            long phut = (diff - gio * 60 * 60 * 1000) / (60 * 1000);
            long giay = (diff - gio * 60 * 60 * 1000 - phut * 60 * 1000) / 1000;
            this.thanhTichThucTe = String.format("%02d:%02d:%02d", gio, phut, giay);
            gio = (diff - uuTien) / (60 * 60 * 1000);
            phut = (diff - uuTien - gio * 60 * 60 * 1000) / (60 * 1000);
            giay = (diff - uuTien - gio * 60 * 60 * 1000 - phut * 60 * 1000) / 1000;
            this.thanhTichXepHang = String.format("%02d:%02d:%02d", gio, phut, giay);
            this.thoiGianTong = (diff - uuTien) / 1000;
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public String getMa() {
        return ma;
    }
    public long getThoiGianTong() {
        return thoiGianTong;
    }
    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + thanhTichThucTe + " " + UuTien + " " + thanhTichXepHang + " " + xepHang;
    }
}

public class J05055_XepHangVanDongVien_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<VanDongVien> arr = new ArrayList<>();
        int n = in.nextInt();
        in.nextLine();
        for(int i = 1; i <= n; i++) {
            arr.add(new VanDongVien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(arr, new Comparator<VanDongVien>() {
            @Override
            public int compare(VanDongVien o1, VanDongVien o2) {
                if(o1.getThoiGianTong() > o2.getThoiGianTong()) return 1;
                if(o1.getThoiGianTong() < o2.getThoiGianTong()) return -1;
                return 0;
            }
        });
        int xepHang = 0, cnt = 1;
        long curr = 0;
        for(VanDongVien it : arr) {
            if(it.getThoiGianTong() == curr) {
                cnt++;
            } else {
                xepHang += cnt;
                cnt = 1;
            }
            it.setXepHang(xepHang);
            curr = it.getThoiGianTong();
        }
        Collections.sort(arr, new Comparator<VanDongVien>() {
            @Override
            public int compare(VanDongVien o1, VanDongVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(VanDongVien it : arr) {
            System.out.println(it);
        }
    }
}