package baitap1;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
        matran mt = new matran();
        mt.Nhap();
        mt.Hienthi();
    }
    
}
class matran{
    private int i, j, m,n ,k;
    private static int [][] M= new int [9][9];
    public void Hienthi(){
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.println([i][j] +"");
            }
            System.out.println();
        }
    
    }
     public void Nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        n = scan.nextInt();
        System.out.println("Nhập số cột");
        m = scan.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.println("Nhập ma trận M [" +i+"]["+j+"]=");
                M[i][j] =scan.nextInt();
            }
        }
    }
}
  

