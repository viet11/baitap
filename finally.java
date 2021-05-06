package baitap;
import java.util.Scanner;
public class testfinally{
    public static void main(String[] args) {
        try {
            int data = 25 / 5;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
        String chuoi;
        char kyTu = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
             
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }
             
        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
            " trong chuỗi " + chuoi + " = " + count);
    }
    
}
