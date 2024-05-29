import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
class drawFlag extends JPanel{
    drawFlag(){
        setSize(800,800);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawRect(20,20,500,700);
        
        g.setColor(Color.black);
        g.fillRect(20, 20, 10, 700);
        g.setColor(Color.red);
        

        int[] xPoints = {30,330,80,330,30};
        int[] yPoints = {20,220,220,420,420};
        g.setColor(Color.blue);
        g.fillPolygon(xPoints,yPoints,5);


        int [] x={40,290,50,290,40};
        int [] y={40,210,210,410,410};
        g.setColor(Color.red);
        g.fillPolygon(x,y,5);

        g.setColor(Color.white);
        g.fillArc(70, 160, 60, 30, 0, -180);

        g.setColor(Color.white);
        g.fillArc(70, 290, 50, 50, 0, 360);

        


        // g.setFont(new Font("Times New Roman",Font.BOLD,36));
        // g.drawString("Pokhara University",50,50);
    }
}

public class nationalflag {
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    drawFlag df= new drawFlag();
    frame.add(df);
    frame.setSize(700,700);
    // frame.DefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    }
    
}
