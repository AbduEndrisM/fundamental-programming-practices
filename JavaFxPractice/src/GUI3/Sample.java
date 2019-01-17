package GUI3;


import javafx.application.Application; 
import javafx.fxml.FXMLLoader; 
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Sample extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage firstStage) throws Exception {
				
	 	Parent root = FXMLLoader.load(getClass().getResource("/GUI3/Main.fxml"));
		
		Scene scene = new Scene(root);
		
		firstStage.setTitle("Abdu E");
		firstStage.setScene(scene);

		firstStage.show();
 
	}

}
