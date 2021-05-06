package java;
import java.util.Scanner;
public class testthrows {
    void m() throws IOException {
        throw new IOException("Loi thiet bi");
    }
 
    void n() throws IOException {
        m();
    }
 
    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly");
        }
    }
     public static void main(String[] args) {
        TestThrows1 obj = new TestThrows1();
        obj.p();
        System.out.println("luong binh thuong...");
        HinhTron ht = new HinhTron();
        ht.nhapBankinh();
        ht.tinhChuvi();
        ht.tinhdientich();
        ht.inChuVi();
        ht.inDienTich();
    }
}
        class HinhTron {
            final float PI = 3.14f;
            float r;
            float cv;
            float dt;

    void nhapBankinh(){
        System.out.println("hay nhap vao ban kinh hinh tron: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }      
    void tinhChuvi(){
        cv = 2 + PI * r; 
    }
    void tinhdientich(){
        dt = PI * r * r;
    }
    void inChuVi() {
    System.out.println ("Chu vi cua hinh tron : " + cv);
    }

    void inDienTich(){
        System.out.println(" Dien tich hinh tron: " + dt);
    
    }
}
    

