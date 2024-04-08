import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Login extends JFrame
{
JLabel l1,l2,l3;
JTextField t1;
JButton b1,b2,b3;
JPasswordField t2;
Login(String s1)
{
super(s1);
}
Login()
{
}
void setComponents()
{
Font f= new Font("Calibri",Font.BOLD,25);
Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
Cursor c2 = new Cursor(Cursor.WAIT_CURSOR);
l1= new JLabel("Username");
l1.setFont(f);
l1.setCursor(c1);

l2=new JLabel("Password");
l2.setFont(f);
l2.setCursor(c2);

l3=new JLabel();

t1=new JTextField();
t2=new JPasswordField();

b1= new JButton("Sign In");
b1.setBackground(Color.BLUE);
b1.setForeground(Color.WHITE);

b2=new JButton("Clear");
b2.setBackground(Color.RED);
b2.setForeground(Color.WHITE);

b3=new JButton("Add");
setLayout(null);

l1.setBounds(100,100,160,50);
l2.setBounds(100,300,160,50);
l3.setBounds(100,600,200,30);
t1.setBounds(400,100,120,30);
t2.setBounds(400,300,120,30);
b1.setBounds(300,500,120,30);
b2.setBounds(500,500,120,30);
b3.setBounds(100,500,120,30);

add(l1);
add(l2);
add(t1);
add(t2);
add(b1);
add(l3);
add(b2);
add(b3);

b1.addActionListener(new Log());
b2.addActionListener(new Clear());
b3.addActionListener(new Add());

l1.addMouseListener(new MouseL());
}

class MouseL implements MouseListener
{
public void mouseClicked(MouseEvent e1)
{
}
public void mousePressed(MouseEvent e1)
{
l1.setText("");
}
public void mouseReleased(MouseEvent e1)
{
l1.setText("Username");
}
public void mouseEntered(MouseEvent e1)
{
l1.setForeground(Color.RED);
}
public void mouseExited(MouseEvent e1)
{
l1.setForeground(Color.BLACK);
}
}


public static void main(String []args)
{
Login l1= new Login("welcome to Login Page");
l1.setComponents();
l1.setSize(700,700);
l1.setVisible(true);
l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


class Log implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
String s1=t1.getText();
String s2= t2.getText();

if(s1.equals("coding") && s2.equals("abhi"))
{
JOptionPane.showMessageDialog(null,"Login Successful");
l3.setText("login Successful");
} 
else 
{
JOptionPane.showMessageDialog(null,"Login UnSuccessful");
l3.setText("Login UnSuccessful");
}
}
}


class Clear implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
t1.setText("");
t2.setText("");
}
}

class Add implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
String s1= t1.getText();
String s2= t2.getText();
int a = Integer.parseInt(s1);
int b= Integer.parseInt(s2);
int c=a+b;
JOptionPane.showMessageDialog(null,"Addition is  = "+c);
l3.setText("Addition is "+ c);
}
}
}
