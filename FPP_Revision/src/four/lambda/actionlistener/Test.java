package four.lambda.actionlistener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Test {

    public static void main(String[] args) {
        JButton btnTest = new JButton("Hello Button");

        
        btnTest.addActionListener((ActionEvent e) ->{
        	System.out.println("Abdu");
        	System.out.println("Edris");
        	
        });
        //print hello world by using lambda expression

        // Swing stuff
        JFrame frame = new JFrame("Listener Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(btnTest, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

    }

}
