import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.awt.Graphics;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Frame;

public class eventHandlingEx extends Frame implements EventListener {
    Frame frame;
    Button sbtn,abtn;
    TextField ftf,stf,rtf;
    Label flbl,slb,rlbl;
    eventHandlingEx(){
        frame = new Frame("event handling");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);
        flbl= new Label("Enter first number:");
        flbl.setBounds(20,20,100,30);
        frame.add(flbl);
        ftf = new TextField();
        ftf.setBounds(50,50,100,30);
        frame.add(ftf);
        slbl= new Label("Enter second number:");
        slbl.setBounds(50,20,100,30);
        frame.add(slbl);
        stf = new TextField();
        stf.setBounds(50,150,100,30);
        frame.add(stf);
        abtn=new Button("add");
        abtn.setBounds(200,20,70,30);
        frame.add(abtn);
        abtn.addActionListener(this);
        sbtn=new Button("subtract");
        abtn.setBounds(200,100,70,30);
        frame.add(sbtn);
        sbtn.addActionListener(this);
        rlbl=new Label("results:");
        rlbl.setBouonds(20,250,70,30);
        frame.add(rlbl);
    }
    /**
     * @param ae
     */
    public void actionPerformed(ActionEvent ae){
        int n1=Integer.parseInt(ftf.getText());
        int n2 =Integer.parseInt(stf.getText());
        int sum=0,sub=0;
        if(ae.getSource()== abtn){
            sum=n1+n2;
            ae.getText(String.valueOf(sum));
        }
        if(ae.getSource==sbtn){
            sub=n1-n2;
            ae.getText(String.valueOf(sub));
        }
    }
    public static void main(String[] args) {
        new eventHandlingEx();
    }
}
