package lesson7.problem1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingFrameHomeWork1 {

	private static void placeComponents(JFrame frame) {
	//	frame.setLayout(null);

		JPanel panel1 = new JPanel();
		 

		
		 
		
		JLabel lbl1 = new JLabel("Mile:");
		lbl1.setBounds(50, 50, 50, 25);
		frame.add(lbl1);
		JLabel lbl2 = new JLabel("Pound:");
		lbl2.setBounds(50, 100, 50, 25);
		frame.add(lbl2);
		JLabel lbl3 = new JLabel("Gallon:");
		lbl3.setBounds(50, 150, 50, 25);
		frame.add(lbl3);
		JLabel lbl4 = new JLabel("Fahrenheit:");
		lbl4.setBounds(50, 200, 50, 25);
		frame.add(lbl4);
		

		JTextField txt1 = new JTextField(15);
		txt1.setBounds(150, 50, 120, 25);
		frame.add(txt1);
		
		JTextField txt2 = new JTextField(15);
		txt2.setBounds(150, 100, 120, 25);
		frame.add(txt2);
		 
		frame.add(panel1);
		JTextField txt3 = new JTextField(15);
		txt3.setBounds(150, 150, 120, 25);
		frame.add(txt3);
		
		JTextField txt4 = new JTextField(15);
		txt4.setBounds(150, 200, 120, 25);
		frame.add(txt4);
		
		
		
		
		JLabel lbl5 = new JLabel("Kilometer:");
		lbl5.setBounds(330, 50, 80, 25);
		frame.add(lbl5);
		JLabel lbl6 = new JLabel("Kilogram:");
		lbl6.setBounds(330, 100, 80, 25);
		frame.add(lbl6);
		JLabel lbl7 = new JLabel("Liters");
		lbl7.setBounds(330, 150, 80, 25);
		frame.add(lbl7);
		JLabel lbl8 = new JLabel("Centigrade:");
		lbl8.setBounds(330, 200, 80, 25);
		frame.add(lbl8);
		

		 
		frame.add(panel1);
		JTextField txt5 = new JTextField(15);
		txt5.setBounds(420, 50, 120, 25);
		frame.add(txt5);
		
		JTextField txt6 = new JTextField(15);
		txt6.setBounds(420, 100, 120, 25);
		frame.add(txt6);

		JTextField txt7 = new JTextField(15);
		txt7.setBounds(420, 150, 120, 25);
		frame.add(txt7);
		
		JTextField txt8 = new JTextField(15);
		txt8.setBounds(420, 200, 120, 25);
		frame.add(txt8);
		 
		JButton btn1 = new JButton("Convert");
		btn1.setBounds(250, 280, 150, 40);
		frame.add(btn1);
		 
		frame.add(panel1);
		
		
		
		btn1.addActionListener( 
			e-> { 
				double txtMile= Double.parseDouble(txt1.getText());
				double txtPound= Double.parseDouble(txt2.getText());
				double txtGallon= Double.parseDouble(txt3.getText());
				double txtFahrenheit= Double.parseDouble(txt4.getText());
				
				
				txt1.setText(Double.toString(Math.round(txtMile)));
				txt2.setText(Double.toString(Math.round(txtPound)));
				txt3.setText(Double.toString(Math.round(txtGallon)));
				txt4.setText(Double.toString(Math.round(txtFahrenheit)));
				
				txt5.setText(Double.toString(Math.round(txtMile*1.60934)));
				txt6.setText(Double.toString(Math.round(txtPound*0.453592)));
				txt7.setText(Double.toString(Math.round(txtGallon/0.26417)));
				txt8.setText(Double.toString(Math.round((txtFahrenheit -32 )*0.5556)));

				 
			}
		);
		
			
		 

	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Metric Conversion Assistant ");

	 
		

		placeComponents(frame);
		frame.setSize(700, 400);
		frame.setResizable(false);
		frame.setVisible(true);

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
