package java;
import java.util.Scanner;
 public class bai3{
    public static void main(String[] args){
        SanPham sp1=new SanPham(tensp,donGia);
		sp1.nhap();
		SanPham sp2=new SanPham(tenSP,donGia,giamGia);
		sp2.nhap();
		
		System.out.print("Xuat thong tin : ");
		sp1.xuat();
		sp2.xuat();
    }
}
 class SanPham {
    String tenSP;
    double donGia;
    double giamGia;
    double  getThueThuNhap;
  void nhap() {
     Scanner sc = new Scanner (System.in);
    System.out.print("Ten Sp : ");
    tenSP = sc.nextLine();
    System.out.print("Don gia : ");
    donGia = sc.nextDouble();
    System.out.print("Giam gia :"+giamGia);
    giamGia = sc.nextDouble();
}
 
  void xuat() {
    System.out.print("Ten SP : "+tenSP);
    System.out.print("Don gia : "+donGia);
    System.out.print("Thue thu nhap : "+(0.1*donGia));
    System.out.print("Giam gia : "+giamGia);
}
public SanPham(String tenSP, double donGia, double giamGia) {
    this.tenSP=tenSP;
    this.donGia=donGia;
    this.giamGia=giamGia;
}
 }