// import javax.swing.*;
// import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

class piechartdraw extends JPanel{
    piechartdraw(){
        setSize(600,600);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.setFont(new Font("Times New Roman", Font.BOLD, 36));
        g.drawString("Pie chart is given below",20,30);

        /*Pie-chart */
        g.setColor(Color.blue);
        g.fillArc(150,150,100,100,0,-180);
        g.setColor(Color.red);
        g.fillArc(150, 150, 100,100, 0, 20);
        g.setColor(Color.green);
        g.fillArc(150, 150, 100,100, 20, 60);
        g.setColor(Color.black);
        g.fillArc(150, 150, 100,100, 80, 40);
        g.setColor(Color.orange);
        g.fillArc(150, 150, 100,100, 120, 60);

    }
}
public class piechart{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.add(new piechartdraw());
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
