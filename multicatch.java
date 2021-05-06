package java;
import java.util.Scanner;
public class testmulticatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 completed");
        } catch (Exception e) {
            System.out.println("common task completed");
        }

        System.out.println("rest of the code...");
        hinhtron ht = new hinhtron();
        ht.nhapBankinh();
        if(ht.vongTronlon()) {
        println("ban kinh hinh tron la : " + ht.getbankinh());
        else
        println ("chu vi hinh tron la : "+ht.tinhChuvi());
        }
    }

}
class hinhtron{
    final float PI =3.14f;
    float r;
    float cv;
    float dt;
    void nhapBankinh(){
        System.out.println("hay nhap vao ban kinh hinh tron: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }
    void tinhdientich(){
       dt = PI * r * r;
    }
    float getbankinh () {
        return r;
    }
    float tinhChuvi(){
        cv = 2 + PI * r; 
        return cv;
    }
    boolean vongTronlon(){
        if (r>10){
            return true;
        } else{
            return false;
        }
    }
    
   }
