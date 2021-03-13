package baitap1;
import java.util.Scanner;
import java.util.Math;
public class bai1{
    public static void main(String[] args){
        DIEM diem = new DIEM();
        diem.nhap();
        diem.xuat();
        diem.diemDoixung();
        diem.khoangCachhaidiem();
        diem.kiemTra();
    }
}
class DIEM{
    //khai báo biến hoành độ x và tung độ y
    int x,y;
    //khai báo tọa độ điểm đối xứng
    int x1,y1;
    //khai báo biến tính độ dài hai điểm
    double delta, dttamgiac;
    Scanner scan = new Scanner(System.in);
    //phương thức nhập tạo độ x và y
    void nhap(){
        System.out.println("Nhập vào hoành độ là x: ");
        x = scan.nextInt();
        System.out.println("Nhập vào tung độ là y: ");
        y = scan.nextInt();
    }
    //phương thức xuất tọa độ dưới dạng (x,y)
    void xuat(){
        System.out.println("Tọa độ của điểm là: ("+ x + "," + y +")");
    }
    //phương thức lấy tọa độ của điểm đối xứng qua trục Ox
    void diemDoixung(){
        x1 = x;
        y1 = -y;
        System.out.println("Tọa độ của điểm đối xứng là: (" +x1 +"," + y1 +")");
    }
    //phương thức tính khoảng cách giữa hai điểm trên hệ trục tọa độ Oxy
    void khoangCachhaidiem(){
        delta = Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
        System.out.println("Khoảng cách giữa hai điểm là: " +delta);
    }
    //phương thức kiểm tra xem điểm đó có nằm trên hai trục tọa độ không
    //nếu không tính diện tích tam giác với 3 đỉnh được tạo bởi điểm vừa nhập,
    //gốc tọa độ và điểm đối xứng với điểm đó qua trục Ox
    void kiemTra(){
        if( x==0 || y==0 ){
            System.out.println("Điểm này nằm trên trục tọa độ");
        }else{
            System.out.println("Điểm này không nằm trên trục tọa độ");
            dttamgiac = 0.5 * delta *x ;
            System.out.println("Diện tich tam giác là: " +dttamgiac);
        }
    }
}