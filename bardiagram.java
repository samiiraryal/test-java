import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;


import java.awt.*;
class bar extends JPanel{
    bar(){
        setSize(800,800);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0,250,500,1);
        g.setColor(Color.red);
        g.fillRect(10,50,50,200);
        g.setColor(Color.red);
        g.fillRect(110,100,50,150);
        g.setColor(Color.red);
        g.fillRect(210,30,50,220);
        g.setColor(Color.red);
        g.fillRect(310,230,50,20);
        g.setColor(Color.red);
        g.fillRect(410,40,50,210);
    }
}
public class bardiagram {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setSize(1000,1000); 
        frame.add(new bar());
        frame.setVisible(true);
        frame.setLayout(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
}
