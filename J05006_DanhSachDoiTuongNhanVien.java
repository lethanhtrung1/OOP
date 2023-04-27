/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class NhanVien_1 {
    private String maNv, hoten, gioiTinh, diaChi, maThue;
    private Date ngaySinh, ngayKyHopDong;
    public NhanVien_1(int stt, String hoten, String gioiTinh, String ngay1, String diaChi, String maThue, String ngay2) throws ParseException {
        this.maNv = String.valueOf(stt);
        while(this.maNv.length() < 5) {
            this.maNv = '0' + this.maNv;
        }
        this.hoten = hoten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngay1);
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKyHopDong = new SimpleDateFormat("dd/MM/yyyy").parse(ngay2);
    }
    @Override
    public String toString() {
        return maNv + " " + hoten + " " + gioiTinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + diaChi + " " + maThue + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayKyHopDong);
    }
}

public class J05006_DanhSachDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i = 1; i <= n; i++) {
            NhanVien_1 tmp = new NhanVien_1(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            System.out.println(tmp);
        }
    }
}