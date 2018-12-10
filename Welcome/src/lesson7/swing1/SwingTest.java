package lesson7.swing1;

import javax.swing.*;

public class SwingTest extends JFrame {
	
public SwingTest(){
	setTitle("Login Screen");
	setLayout(null);
	
}
JLabel label1= new JLabel("User");
JLabel label2= new JLabel("Password");

JTextField text1= new JTextField();
JTextField text2= new JTextField();

JButton button1 = new JButton("Login");
JButton button2 = new JButton("Register");





public class Main {
	JFrame swing = new SwingTest();
	//swing.setVisible(true);
}

}