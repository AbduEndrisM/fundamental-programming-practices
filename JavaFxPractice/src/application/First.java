package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class First extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage firstStage) throws Exception {

		firstStage.setTitle("First FxGUI");

		Button b1 = new Button();
		Button b2 = new Button();
		Button b3 = new Button();
		b1.setText("ClickOne");
		b2.setText("ClickTwo");
		b3.setText("Close");
		
		b1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Abdu E");

			}
		});

		b2.setOnAction(e -> System.out.println("Abdu"));
		b3.setOnAction(e->{
			System.out.println("Exiting....");
			System.exit(0);
		});
		
		/*
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(15));
		vbox.setSpacing(20);

		vbox.getChildren().addAll(b1, b2);
*/	
		
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15, 12, 15, 12));
		hbox.setSpacing(20);

		// hbox.setStyle("-fx-background-color: #336699;");

		hbox.getChildren().add(b1);
		hbox.getChildren().addAll(b2,b3);

		Scene scene = new Scene(hbox, 300, 250);
		firstStage.setScene(scene);

		firstStage.show();

	}

}
