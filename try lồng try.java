package java;
import java.util.Scanner;
public class trylongtry {
	public static void main(String[] args) {
		try {
            try {
                System.out.println("Thuc hien phep chia");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
 
            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
 
            System.out.println("khoi lenh khac");
        } catch (Exception e) {
            System.out.println("xy ly ngoai le");
        }
 
        System.out.println("tiep tuc chuong trinh..");
		Scanner sc= new Scanner(System.in);
		Sanpham a[] = new Sanpham[2];
		String tensp;
		for(int i = 0; i < 2; i++)
		{
			a[i] = new Sanpham();
			System.out.println("Nhap thong tin san pham thu" +(i+1));
			System.out.print("Nhap ten san pham: " );
			tensp= sc.nextLine();
			a[i].settensp(tensp);
		}
		for(int i = 0; i < 2; i++)
		{
			System.out.println("Thong tin san pham thu" +(i+1));
			System.out.println("Ten san pham: "+ a[i].gettensp());
		}
	}
}
 class Sanpham{
	private String tensp;
	public void settensp(String tensp){
		this.tensp = tensp;
	}
	public String gettensp(){
		return this.tensp;
	}
}