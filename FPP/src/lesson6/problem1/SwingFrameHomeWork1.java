package lesson6.problem1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingFrameHomeWork1 {

	private static void placeComponents(JFrame frame) {
	//	frame.setLayout(null);

		JPanel panel1 = new JPanel();
		 

		JButton btn1 = new JButton("Count Letters");
		btn1.setBounds(10, 20, 150, 25);
		frame.add(btn1);
		
		JButton btn2 = new JButton("Reverse letters");
		btn2.setBounds(10, 55, 150, 25);
		frame.add(btn2);
		
		JButton btn3 = new JButton("Remove Duplicates");
		btn3.setBounds(10, 90, 150, 25);
		frame.add(btn3);
		
		
		JLabel lbl1 = new JLabel("Input");
		lbl1.setBounds(200, 20, 50, 25);
		frame.add(lbl1);
		JLabel lbl2 = new JLabel("Output:");
		lbl2.setBounds(200, 75, 50, 25);
		frame.add(lbl2);
		
		
		JTextField txt1 = new JTextField(15);
		txt1.setBounds(200, 45, 150, 25);
		frame.add(txt1);
		
		JTextField txt2 = new JTextField(15);
		txt2.setBounds(200, 95, 150, 25);
		frame.add(txt2);
		 
		frame.add(panel1);
		
		//Integer.parseInt
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				txt2.setText(null);
				int x= txt1.getText().length();
				txt2.setText(Integer.toString(x));
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txt2.setText(null);
				String  x= txt1.getText();
				
				for(int i=txt1.getText().length()-1; i>=0;i--) {
					txt2.setText(txt2.getText() + x.charAt(i)); 

				}
				
			}
		});
		
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input= txt1.getText();
				 String result = "";
				    for (int i = 0; i < input.length(); i++) {
				        if(!result.contains(String.valueOf(input.charAt(i)))) {
				            result += input.charAt(i);
				        }
				    }
		        txt2.setText(result);

		    }
		}	 
	
			);

	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("String Utility");

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dm = tk.getScreenSize();
		int xPos = (dm.width / 2) - (frame.getSize().width / 2);
		int yPos = (dm.height / 2) - (frame.getSize().height / 2);
		frame.setLocation(xPos, yPos);

		frame.setSize(400, 200);
		placeComponents(frame);

		frame.setResizable(false);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
