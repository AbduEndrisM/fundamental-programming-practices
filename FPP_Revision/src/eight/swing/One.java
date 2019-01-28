package eight.swing;

import javax.swing.*;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jFrame = new JFrame("One");
		oneAPI(jFrame);

		jFrame.setSize(400, 300);
		jFrame.setResizable(false);
		jFrame.setVisible(true);

		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private static void oneAPI(JFrame frame) {

		JPanel panel = new JPanel();

		JTextField txt1 = new JTextField();
		txt1.setBounds(100, 50, 70, 30);
		frame.add(txt1);
		JTextField txt2 = new JTextField();
		txt2.setBounds(200, 50, 70, 30);
		frame.add(txt2);

		JButton btn1 = new JButton("Add");
		btn1.setBounds(50, 100, 60, 30);
		frame.add(btn1);
		JButton btn2 = new JButton("Sub");
		btn2.setBounds(120, 100, 60, 30);
		frame.add(btn2);
		JButton btn3 = new JButton("Mul");
		btn3.setBounds(190, 100, 60, 30);
		frame.add(btn3);
		JButton btn4 = new JButton("Div");
		btn4.setBounds(260, 100, 60, 30);
		frame.add(btn4);

		JTextField txt3 = new JTextField();
		txt3.setBounds(150, 150, 70, 30);
		frame.add(txt3);

		frame.add(panel);
		btn1.addActionListener(e->{

			double num1=Double.parseDouble(txt1.getText());
			double num2=Double.parseDouble(txt2.getText());
			

			txt3.setText(Double.toString(num1+num2));
		});
		btn2.addActionListener(e->{

			double num1=Double.parseDouble(txt1.getText());
			double num2=Double.parseDouble(txt2.getText());
			

			txt3.setText(Double.toString(num1-num2));
		});
		btn3.addActionListener(e->{

			double num1=Double.parseDouble(txt1.getText());
			double num2=Double.parseDouble(txt2.getText());
			

			txt3.setText(Double.toString(num1*num2));
		});
		btn4.addActionListener(e->{

			double num1=Double.parseDouble(txt1.getText());
			double num2=Double.parseDouble(txt2.getText());
			

			txt3.setText(Double.toString(num1/num2));
		});

	}

}
