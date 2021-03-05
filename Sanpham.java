package java;
import java.util.Scanner;
public class Sanpham { 
    public static void main(String[] args){
        sp SP = new sp();
        SP.nhapsp();
        SP.in();
    }

}
class sp{
    String Tensp;
    double Dongia;
    double Giamgia;
 void nhapsp(){
    System.out.println("nhap thong tin san pham");
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap ten san pham: ");
    Tensp = sc.next();
    System.out.println("nhap vao don gia san pham: ");
    Dongia = sc.nextDouble();
    System.out.println("nhap vao giam gia san pham: ");
    Giamgia = sc.nextDouble();
    }

 double Thue(){
     return (Dongia /10);
 }
 void in (){
     System.out.println("Ten sp : "+ Tensp);
     System.out.println("Don gia sp : "+ Dongia);
     System.out.println("Giam gia sp : "+Giamgia);
     System.out.println("Thue sp : "+Thue());

 }
}