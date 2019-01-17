package GUI2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;
	@FXML
	private Button b4;
	@FXML
	private Button b5;

	@FXML
	private TextField firstNum;
	@FXML
	private TextField secNum;
	@FXML
	private TextField t3;

	@FXML
	// private Button b3;

	public void sum(ActionEvent e) {
		double oneNum = Double.parseDouble(firstNum.getText());
		double twoNum = Double.parseDouble(secNum.getText());

		t3.setText(Double.toString(oneNum + twoNum));
	}

	public void sub(ActionEvent e) {
		double oneNum = Double.parseDouble(firstNum.getText());
		double twoNum = Double.parseDouble(secNum.getText());

		t3.setText(Double.toString(oneNum - twoNum));
	}

	public void mul(ActionEvent e) {
		double oneNum = Double.parseDouble(firstNum.getText());
		double twoNum = Double.parseDouble(secNum.getText());

		t3.setText(Double.toString(oneNum * twoNum));
	}

	public void div(ActionEvent e) {
		double oneNum = Double.parseDouble(firstNum.getText());
		double twoNum = Double.parseDouble(secNum.getText());

		t3.setText(Double.toString(oneNum / twoNum));
	}

	public void clear(ActionEvent e) {
		firstNum.setText("");
		secNum.setText("");
		t3.setText("");
	}

}
