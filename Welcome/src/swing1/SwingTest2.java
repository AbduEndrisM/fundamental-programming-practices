
package swing1;

import javax.swing.*;

public class SwingTest2 {
	public static void main(String[] args) {

		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setTitle("Login Screen");
		jf.setSize(200, 300);
		
		JLabel label1 = new JLabel("User");
		JLabel label2 = new JLabel("Password");

		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);

		JButton button1 = new JButton("Login");
		JButton button2 = new JButton("Register");
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);

		label1.setBounds(20, 50, 40, 40);
		text1.setBounds(100,50,100,30);
		label2.setBounds(20, 100, 40, 40);
		text2.setBounds(100,100,100,30);		
		
		
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(text1);
		panel1.add(label1);
		panel1.add(text2);
		
		
		
		jf.add(panel1);
		jf.setSize(400, 400);
		

	}

}