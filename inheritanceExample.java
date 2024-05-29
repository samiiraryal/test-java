import java.io.*;

interface a{
    int l=20;
}
interface b extends a{
    int b=10;
}
class area implements b{
    public static void main(String[] args){
        int a = areaofRect(l,b);
        System.out.println("area of rectangle=" + a);
         areaofRect(int a,int b1){
            return (a*b1);
        }
    }    
}
