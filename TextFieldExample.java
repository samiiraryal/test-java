
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class TextFieldExample extends Frame implements ActionListener{
static TextField tf1,tf2,tf3;
Button addBtn,subBtn;
TextFieldExample(){
tf1 = new TextField();
tf1.setBounds(100,50,200,30);
add(tf1);
tf2 = new TextField();
tf2.setBounds(100,90,200,30);
add(tf2);
tf3 = new TextField();
tf3.setBounds(100,130,200,30);
add(tf3);
addBtn = new Button("Addition(+)");
addBtn.setBounds(100,170,90,30);
add(addBtn);
subBtn = new Button("Subtraction(-)");
subBtn.setBounds(210,170,90,30);
add(subBtn);

addBtn.addActionListener(this);
subBtn.addActionListener(this);
setSize(400,360);
setTitle("TextField Example");
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent ae){
int num1 = Integer.parseInt(tf1.getText());
int num2 = Integer.parseInt(tf2.getText());
int sum=0,sub=0;
if(ae.getSource().equals(addBtn)){
sum = num1 + num2;
tf3.setText(String.valueOf(sum));
}
if(ae.getSource().equals(subBtn)){
sub = num1 - num2;
tf3.setText(String.valueOf(sub));
}
}
public static void main(String[] args) {
new TextFieldExample();
}
}