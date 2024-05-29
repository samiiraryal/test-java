import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
class DrawFlag extends JPanel{
    DrawFlag(){
    setSize(700,720);
}
public void paintComponent(Graphics g){
super.paintComponent(g);
g.setColor(Color.green);
g.drawRect(10,10,600,620);
g.setColor(Color.black);
g.fillRect(40,20,10,600);
int[] xPoints = {50,300,90,340,50,50};
int[] yPoints = {20,240,240,500,500,20};
g.setColor(Color.blue);
g.fillPolygon(xPoints,yPoints,5);
int[] xP = {60,280,70,320,60,60};
int[] yP = {40,230,230,490,490,40};
g.setColor(Color.red);
g.fillPolygon(xP,yP,5);
g.setColor(Color.white);
g.fillArc(100,160,60,34,0,-180);
g.fillArc(100,360,60,60,0,360);
g.setColor(Color.BLACK);
g.setFont(new Font("serif",Font.BOLD,30));
g.drawString("MY NEPAL",200,660);
}
}

public class nationalflag1{
public static void main(String[] args) {
JFrame frame = new JFrame();
frame.add(new DrawFlag());
frame.setSize(700,720);
frame.setTitle("National Flag");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
frame.setVisible(true);
}
}