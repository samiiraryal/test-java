import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
class pie extends JPanel{
    pie(){
        setSize(500,500);
    }
    public void paintComponent(Graphics g){
        // super.paintComponent(g);
g.setColor(Color.red);
g.fillArc(20,20,60,60,0,144);

g.setColor(Color.green);
g.fillArc(20,20,60,60,144,108);

g.setColor(Color.yellow);
g.fillArc(20,20,60,60,252,72);

g.setColor(Color.pink);
g.fillArc(20,20,60,60,324,36);

    }
}
public class pie1{
    public static void main(String[] args) {
       JFrame frame=new JFrame();
       frame.setSize(500,500);
       frame.add(new pie());
       frame.setLayout(null);
       frame.setVisible(true);        
    }
}