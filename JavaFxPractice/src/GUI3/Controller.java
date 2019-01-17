package GUI3;

import java.awt.Window;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

	@FXML
	private Label lbl;
	@FXML
	private Label lbl2;
	@FXML
	private TextField txtUsername,txtPassword;
	
	@FXML
	private Button btnUsername, btnPassword, btnLogin, btnCancel, btnClose;

	public void login(ActionEvent e) throws Exception {
		if (txtUsername.getText().equals("abdu") && txtPassword.getText().equals("123")) {
			//lbl.setText("Login Successful");
			
			
		 	Parent root = FXMLLoader.load(getClass().getResource("/GUI3/SecondMain.fxml"));
		 	Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
            stage.show();
            
            // Hide this current window  
             ((Node) e.getSource()).getScene().getWindow().hide();
			
		}
		else
			lbl.setText("Credentials Error!");
			

	}
	public void cancel(ActionEvent e) throws Exception {
		 // get a handle to the stage
	    Stage stage = (Stage) btnCancel.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}
	/*
	public void close(ActionEvent e) throws Exception {
		 // get a handle to the stage
	    Stage stage = (Stage) btnClose.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}
	*/ 
}