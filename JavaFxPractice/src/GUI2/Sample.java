package GUI2;


import javafx.application.Application; 
import javafx.fxml.FXMLLoader; 
import javafx.scene.Parent;
import javafx.scene.Scene; 
import javafx.stage.Stage;

public class Sample extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage firstStage) throws Exception {
	 
		
	 
		
		
		Parent root = FXMLLoader.load(getClass().getResource("/GUI2/Main.fxml"));
		
			
		Scene scene = new Scene(root);
		
		firstStage.setTitle("Abdu E-2");
		firstStage.setScene(scene);

		firstStage.show();

	}

}
