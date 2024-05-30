import java.lang.Throwable;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
class arithOp{
    int a,b,c;
    Scanner sc= new Scanner(System.in);
    void getNum(){
    System.out.println("enter a number:");
    a=sc.nextInt();
    System.out.println("enter second number:");
    b=sc.nextInt();
    }
    private class arith{
        void sum(){
            System.out.println("sum="+(a+b));
        }
        void div(){
            try{
                System.out.println("division="+(a/b));
            }catch(ArithmeticException ae){
                System.out.println(ae);
            }
        }
        void mult(){
            System.out.println("product="+(a*b));
        }
    } //end_of_inner_class
    void disp(){
        arith ar= new arith();
        ar.sum();
        ar.div();
        ar.mult();
    }
}
public class arithmeticOperation {
    public static void main(String[] args) {
        arithOp obj=new arithOp();
        obj.getNum();
        obj.disp();
    }
}
