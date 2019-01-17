package GUI3;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller {
	
	@FXML
	private TextField txtUsername,txtPassword; 
	@FXML
	private Button btnUsername,btnPassword, btnLogin,btnCancel; 
	
	public void Login(ActionEvent e) throws Exception{
		try {
	        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Main.fxml"));
	        Parent root1 = (Parent) fxmlLoader.load();
	        Stage stage = new Stage();
	        stage.setTitle("ABCD");
	        stage.setScene(new Scene(root1));  
	        stage.show();
	    } catch(Exception ee) {
	        ee.printStackTrace();
	    }

 }
}