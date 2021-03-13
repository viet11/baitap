package baitap1;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args){
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.xuat();
        sv.tinhDiemtb();
    }
}
class SinhVien{

    String hoten, gioitinh,lop;
    int ngaysinh;
    float diemtoan, diemly, diemhoa, dtb;
    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập họ và tên là:");
        hoten = scan.nextLine();
         System.out.println("Nhập ngày sinh là:");
        ngaysinh = scan.nextInt();
         System.out.println("Nhập vào giới tính là:");
        gioitinh = scan.nextLine();
        System.out.println("Nhập lớp là:");
        lop = scan.nextLine();
        System.out.println("Nhập vào điểm toán là: ");
        diemtoan = scan.nextInt();
        System.out.println("Nhập vào điểm lý là: ");
        diemly = scan.nextInt();
        System.out.println("Nhập vào điểm hóa là: ");
        diemhoa = scan.nextInt();
    }
    void tinhDiemtb(){
        dtb = (diemtoan+diemhoa+diemly)/3;
        System.out.println("Điểm trung bình là: "+dtb);
    }
    void xuat(){
        System.out.println("Họ tên sinh viên là: "+hoten);
        System.out.println("Ngày sinh của sinh viên là: "+ngaysinh);
        System.out.println("Giới tính của sinh viên là: "+gioitinh);
        System.out.println("Lớp của sinh viên là: "+lop);
        System.out.println("Điểm toán của sinh viên là: "+diemtoan);
        System.out.println("Điểm lý của sinh viên là:" +diemly);
        System.out.println("Điểm hóa của sinh viên là: "+diemhoa);
        }
    }