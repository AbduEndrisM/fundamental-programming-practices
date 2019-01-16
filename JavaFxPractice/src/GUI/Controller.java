package GUI;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML; 
import javafx.scene.control.TextField;

public class Controller {
	
	@FXML
	private TextField t1; 
	
	public void generateRandom(ActionEvent e) {
		Random r = new Random();
		int myRandom = r.nextInt(50)+1;
		
		t1.setText((Integer.toString(myRandom)));
		//System.out.println(Integer.toString(myRandom));
		//System.out.println(myRandom);
	}

}
