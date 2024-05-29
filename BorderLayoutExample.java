import javax.swing.*;
import java.awt.BorderLayout;
     class BorderLayoutExample1 {
    JFrame frame;
    JButton nbtn,sbtn,ebtn,wbtn,cbtn;
        BorderLayoutExample1(){
        frame= new JFrame();
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
    }
}
class BorderLayoutExample{
    public static void main(String[] args) {
        new BorderLayoutExample1();
    }
}
