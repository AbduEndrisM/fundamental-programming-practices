package lesson6.problem2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingFrameHomeWork2 {

	private static void placeComponents(JFrame frame) {
		// frame.setLayout(null);

		JPanel panel1 = new JPanel();

		JButton btn1 = new JButton();
		btn1.setBounds(5, 5, 80, 80);
		btn1.setBackground(Color.RED);
		frame.add(btn1);

		JButton btn2 = new JButton();
		btn2.setBounds(85, 5, 80, 80);
		btn1.setBackground(Color.ORANGE);
		frame.add(btn2);

		JButton btn3 = new JButton();
		btn3.setBounds(165, 5, 80, 80);
		btn3.setBackground(Color.YELLOW);
		frame.add(btn3);

		JButton btn4 = new JButton();
		btn4.setBounds(245, 5, 80, 80);
		btn4.setBackground(Color.GREEN);
		frame.add(btn4);

		JButton btn5 = new JButton(" ");
		btn5.setBounds(325, 5, 80, 80);
		btn5.setBackground(Color.BLUE);
		frame.add(btn5);

		JButton btn6 = new JButton();
		btn6.setBounds(405, 5, 80, 80);
		btn6.setBackground(Color.MAGENTA);
		frame.add(btn6);

		JButton btn7 = new JButton();
		btn7.setBounds(485, 5, 80, 80);
		btn7.setBackground(Color.CYAN);
		frame.add(btn7);

		frame.add(panel1);

		// Integer.parseInt
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String message = "Red signifies passion, vitality, enthusiasm and security.";
				String titleBar = "Color Messageing - Red";

				JOptionPane.showMessageDialog(null, message, titleBar, JOptionPane.INFORMATION_MESSAGE);

			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String message = " It is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control.";
				String titleBar = "Color Messageing - Orange";

				JOptionPane.showMessageDialog(null, message, titleBar, JOptionPane.INFORMATION_MESSAGE);

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "It represents clarity of thought, wisdom, orderliness and energy.";
				String titleBar = " Color Messageing - Yellow";

				JOptionPane.showMessageDialog(null, message, titleBar, JOptionPane.INFORMATION_MESSAGE);

			}

		}

		);

		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String message = "It denotes fertility, growth, balance, health and wealth.";
				String titleBar = "Color Messageing - Green ";

				JOptionPane.showMessageDialog(null, message, titleBar, JOptionPane.INFORMATION_MESSAGE);

			}
		});

		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String message = "The sky and the wide oceans are in this color and hence it has been associated with Spirituality and Divinity.";
				String titleBar = "Color Messageing - Blue";

				JOptionPane.showMessageDialog(null, message, titleBar, JOptionPane.INFORMATION_MESSAGE);

			}
		});

		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String message = "Indigo is mystical as it bridges the Gap between Finite and Infinite.";
				String titleBar = "Color Messageing - Indigo";

				JOptionPane.showMessageDialog(null, message, titleBar, JOptionPane.INFORMATION_MESSAGE);

			}
		});

		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String message = "It is considered the highest element of spirituality.";
				String titleBar = "Color Messageing - Violet";

				JOptionPane.showMessageDialog(null, message, titleBar, JOptionPane.INFORMATION_MESSAGE);

			}
		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Rainbow Color Frame");


		placeComponents(frame);
		frame.setSize(590, 130);

		frame.setResizable(false);
		frame.setVisible(true);

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
