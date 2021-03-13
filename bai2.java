package baitap1;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        ThoiGian tg = new ThoiGian();
        tg.hamTao(0,0,0);
        tg.nhap();
        tg.xuat();
        tg.hamchuyen();
    }
}
class ThoiGian{
    private int gio, phut, giay;
    int second;
    void hamTao(int gio, int phut, int giay){
    this.gio = gio;
    this.phut = phut;
    this.giay = giay;        
    }
    void nhap(){
        Scanner scan = new Scanner(System.in);
         System.out.println("Nhập vào giờ là: ");
        gio = scan.nextInt();
         System.out.println("Nhập phút là:");
        phut = scan.nextInt();
         System.out.println("Nhập giây là: ");
        giay = scan.nextInt();
    }
     void xuat(){
        System.out.println("Giá trị thời gian là: "+gio+" giờ, "+phut+ " phút, "+giay+" giây" );
    }
    void hamchuyen(){
        second = gio*3600 + phut*60 +giay;
        System.out.println("Chuyển đổi giá trị thời gian " +gio+" giờ, " +phut+" phút, "+giay+ "giây ra giây là:"+second+" giây");
    }

}   

    

