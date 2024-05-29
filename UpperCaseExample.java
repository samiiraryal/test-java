import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextfield;
import javax.swing.Label;
import java.awt.BorderLayout;
import java.event.ActionEvent;
import java.event.ActionListener;

class borderfile{
    JPanel panel;
    JFrame frame;
    JButton ubtn;
    JLabel ulbl;
    JTextField ipt;
    borderfile(){
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        panel = new JPanel("uppercase panel");
        panel.setBackground(Color.red);
        frame.add(panel);
        ulbl = new JLabel("enter text here:");
        ulbl.setBounds(120,50,100,60);
        panel.add(ulbl);
        ubtn = new JButton("To upper");
        ubtn.setBounds(150, 50, 50, 30);
        panel.add(ubtn);
        ipt = new JTextField();
        ipt.setBounds(200,50,100,100);
        panel.add(ipt);
        ubtn.addActionListener(new  ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String inpText= ipt.getText();
                inpText =inpText.toUppercase();
                ulbl.setText(inpText);
            }
        });
    }

}


public class UpperCaseExample {
    public static void main(String[] args) {
        new borderfile();
    }
}
