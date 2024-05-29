import java.io.*;
class vehicle{
    void disp(){
        System.out.println("vehicle has");
    }
}
class parts{
    void dispPart(){
        System.out.println("brakes");
    }
}
public class compositionExample {
    public static void main(String[] args) {
        vehicle v= new vehicle();
        parts p= new parts();
        v.disp(p.dispPart());  
    }
    
}
