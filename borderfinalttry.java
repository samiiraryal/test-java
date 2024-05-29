import javax.swing.*;
import java.awt.BorderLayout;
public class borderfinalttry {
    public static void main(String[] args) {
        JFrame frame;
        JButton nbtn,sbtn,ebtn,wbtn,cbtn;
        frame = new JFrame();
        frame.setTitle("border layout");
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        sbtn= new JButton("south button");
        frame.add(sbtn,BorderLayout.SOUTH);
        nbtn= new JButton("north button");
        frame.add(nbtn,BorderLayout.NORTH);
        ebtn= new JButton("east button");
        frame.add(ebtn,BorderLayout.EAST);
        wbtn= new JButton("west button");
        frame.add(wbtn,BorderLayout.WEST);
        cbtn= new JButton("center button");
        frame.add(cbtn,BorderLayout.CENTER);
        System.out.println("this is border layout");
    }
}
