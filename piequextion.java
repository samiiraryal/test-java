import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class question extends JPanel{
    question(){
        setSize(500,500);
    }
    public void paintComponent(Graphics g){
        /*react */
        g.setColor(Color.red);
        g.fillArc(200,200,100,100,0,144);
        g.setColor(Color.black);
        g.drawString("react",200,200);

        /*Angular */
        g.setColor(Color.green);
        g.fillArc(200,200,100,100,144,108);

        /*Vue */
        g.setColor(Color.blue);
        g.fillArc(200,200,100,100,252,72);

        /*others */
        g.setColor(Color.pink);
        g.fillArc(200,200,100,100,324,36);
    }
}
public class piequextion {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.add(new question());
        frame.setVisible(true);
        frame.setLayout(null);
    }
    
}
