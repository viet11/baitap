package java;
import java.util.Scanner;
 public class testthrow{
     static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome");
    }
    private static Object tensp;
    private static Object donGia;
    private static Object giamGia;

    public static void main(String[] args){
      validate(13);
      System.out.println("rest of the code...");
     SanPham sp1=new SanPham(tensp,donGia);
		sp1.nhap();
    SanPham sp2=new SanPham(tensp,donGia,giamGia);
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
  public SanPham(Object tensp2, Object donGia2) {
    }

  public SanPham(Object tensp2, Object donGia2, Object giamGia2) {
  }

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
 }