import java.io.*;

public class writeinfile {
    public static void main(String[] args) {
        try {
            FileWriter fr = new FileWriter("C:/Users/samir/Desktop/file11.txt");
            String str = "hello world I'm just trying to write something on the text file using java application";
            fr.write(str);
            fr.close();

        } catch (IOException e) {
            e.getMessage();
            e.getCause();
            e.printStackTrace();
        } finally {
            System.out.println("file writing successful");
        }
    }
}

