package GUI4;
 
import java.util.Hashtable; 

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
	private Label lbl, lblUsername, lblPassword;

	@FXML
	private TextField txtUsername, txtPassword;
	@FXML
	private Button btnLogin, btnCancel;

	// Second Main
	@FXML
	private Label lbl2;
	@FXML
	private Button btnAdd, btnDelete, btnEdit;

	// AddMain
	@FXML
	private Label lblFName, lblLName, lblSex, lblAge;
	@FXML
	private Button btnRegister;
	@FXML
	private TextField txtFName, txtLName, txtSex, txtAge;

	
	Hashtable<String, Student> objStudents = new Hashtable<>();

	
	public void login(ActionEvent e) throws Exception {
		if (txtUsername.getText().equals("abdu") && txtPassword.getText().equals("123")) {
			// lbl.setText("Login Successful");

			Parent root = FXMLLoader.load(getClass().getResource("/GUI4/SecondMain.fxml"));
			Stage secondStage = new Stage();
			Scene scene = new Scene(root);

			secondStage.setTitle("Welcome");
			secondStage.setScene(scene);
			secondStage.show();

			// Hide this current window
			((Node) e.getSource()).getScene().getWindow().hide();

		} else {
			lbl.setText("Credentials Error!");

		}
	}

	public void cancel(ActionEvent e) throws Exception {
		
		 
		//System.out.println("Abdu");
		// get a handle to the stage
		  Stage stage = (Stage) btnCancel.getScene().getWindow();
		// do what you have to do
		  stage.close();
	}

	public void add(ActionEvent e) throws Exception {
		// get a handle to the stage

		Parent root = FXMLLoader.load(getClass().getResource("/GUI4/AddMain.fxml"));
		Stage stage = new Stage();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Register");
		stage.show();

		// System.out.println();
		// Hide this current window
		((Node) e.getSource()).getScene().getWindow().hide();

	}

	public void addStudent(ActionEvent e) throws Exception {

		Student s = new Student();
		
		s.setfName(txtFName.getText());
		s.setlName(txtLName.getText());
		s.setAge(Integer.parseInt(txtAge.getText()));
		s.setSex(txtSex.getText());

		objStudents.put(txtFName.getText(), s);

		for (Student es : objStudents.values()) {
			System.out.println(es.toString());
		}

		/*  
		 * Hashtable<Student, List<Student>> objStudents1 = new Hashtable<Student,
		 * List<Student>>(); objStudents.put(student.get(0), student);
		 */
		txtFName.setText(null);
		txtLName.setText(null);
		txtAge.setText(null);
		txtSex.setText(null);
	}

	public void edit(ActionEvent e) throws Exception {
		// get a handle to the stage
		Stage stage = (Stage) btnAdd.getScene().getWindow();
		// do what you have to do
		stage.close();
	}

	public void delete(ActionEvent e) throws Exception {
		// get a handle to the stage
		Stage stage = (Stage) btnAdd.getScene().getWindow();
		// do what you have to do
		stage.close();
	}

}