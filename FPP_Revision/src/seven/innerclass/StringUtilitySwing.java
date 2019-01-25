package seven.innerclass;
 
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StringUtilitySwing extends JFrame {
	private JPanel leftPanel;
	private JPanel rightPanel;
	private JTextField input;
	private JTextField output;
	private static final long serialVersionUID = 1L;
	public StringUtilitySwing() {
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineLeftPanel();
		defineRightPanel();
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		mainPanel.add(leftPanel);
		mainPanel.add(rightPanel);
		getContentPane().add(mainPanel);
		pack();
	}
	private void defineLeftPanel() {
		leftPanel = new JPanel();
		leftPanel.setLayout(new BorderLayout());
		
		JButton upperButton = new JButton("Count Letters");
	//	upperButton.addActionListener(new CountListener());
		upperButton.addActionListener(e->{
			clearOutput();
			int size = input.getText().length();
			output.setText(""+size);
			
		});
		JButton middleButton = new JButton("Reverse Letters");
		middleButton.addActionListener(e->{
			clearOutput();
			String inputStr = input.getText();
			StringBuffer buf = new StringBuffer();
			for(int i = inputStr.length()-1; i >=0 ; --i){
				buf.append(inputStr.charAt(i));
			}
			output.setText(buf.toString());
		});
	//	middleButton.addActionListener(new ReverseListener());
				
		JButton lowerButton = new JButton("Remove Duplicates");
		//lowerButton.addActionListener(new DuplicateListener());
		lowerButton.addActionListener(e->{
			clearOutput();
			String inputStr = input.getText();
			HashMap h = new HashMap();
			StringBuffer buf  = new StringBuffer();
			for(int i = 0; i < inputStr.length(); ++i){
				char c = inputStr.charAt(i);
				if(!h.containsKey(c)){
					h.put(c,c);
					buf.append(c);
				}
			}
			output.setText(buf.toString());
		});
		upperButton.setPreferredSize(lowerButton.getPreferredSize());
		middleButton.setPreferredSize(lowerButton.getPreferredSize());
		
		
		leftPanel.add(upperButton,BorderLayout.NORTH);
		leftPanel.add(middleButton,BorderLayout.CENTER);
		leftPanel.add(lowerButton,BorderLayout.SOUTH);
		
	}
	private void defineRightPanel(){
		rightPanel = new JPanel();
		rightPanel.setLayout(new BorderLayout());
		
		 
		JLabel upperLabel = new JLabel("Input");
		input = new JTextField(15);
		upperLabel.setFont(makeSmallFont(upperLabel.getFont()));
		JPanel upperTextPanel = createTextPanel(upperLabel,input);
		
		
		JLabel lowerLabel = new JLabel("Output");
		output = new JTextField(15);
		lowerLabel.setFont(makeSmallFont(lowerLabel.getFont()));
		JPanel lowerTextPanel = createTextPanel(lowerLabel,output);
		
		
		rightPanel.add(upperTextPanel, BorderLayout.NORTH);
		rightPanel.add(lowerTextPanel, BorderLayout.SOUTH);
		
	}
	private static JPanel createTextPanel(JLabel lab, JTextField textField) {
		
		JPanel top = new JPanel();
		JPanel bottom = new JPanel();
		top.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
		bottom.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));		
		
		
		top.add(lab);
		bottom.add(textField);
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(top,BorderLayout.NORTH);
		textPanel.add(bottom,BorderLayout.CENTER);
		return textPanel;
	}
	private void initializeWindow() {
		setTitle("String Utility");		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		centerFrameOnDesktop(this);
		setResizable(false);
	}
	public static Font makeSmallFont(Font f) {
        return new Font(f.getName(), f.getStyle(), (f.getSize()-2));
    }

	public static void centerFrameOnDesktop(Component f) {
	        final int SHIFT_AMOUNT = 0;
	        Toolkit toolkit = Toolkit.getDefaultToolkit();
	        int height = toolkit.getScreenSize().height;
	        int width  = toolkit.getScreenSize().width;
	        int frameHeight = f.getSize().height;
	        int frameWidth  = f.getSize().width;
	        f.setLocation(((width-frameWidth)/2)-SHIFT_AMOUNT, (height-frameHeight)/3);    
	}
	private void clearOutput() {
		output.setText("");
	}
	 
	/*
	class CountListener implements ActionListener {
		public void actionPerformed(e->{
			clearOutput();
			int size = input.getText().length();
			output.setText(""+size);
			
		});
	}	*/
	
	/*class ReverseListener implements ActionListener {
		public void actionPerformed(ActionEvent evt){
			clearOutput();
			String inputStr = input.getText();
			StringBuffer buf = new StringBuffer();
			for(int i = inputStr.length()-1; i >=0 ; --i){
				buf.append(inputStr.charAt(i));
			}
			output.setText(buf.toString());
			
		}
	}	*/
	/*class DuplicateListener implements ActionListener {
		public void actionPerformed(ActionEvent evt){
			clearOutput();
			String inputStr = input.getText();
			HashMap h = new HashMap();
			StringBuffer buf  = new StringBuffer();
			for(int i = 0; i < inputStr.length(); ++i){
				char c = inputStr.charAt(i);
				if(!h.containsKey(c)){
					h.put(c,c);
					buf.append(c);
				}
			}
			output.setText(buf.toString());
		}
	}
	*/
	public static void main(String[] args){
		StringUtilitySwing ex = new StringUtilitySwing();
		//mf.pack();
		ex.setVisible(true);
	}
}

