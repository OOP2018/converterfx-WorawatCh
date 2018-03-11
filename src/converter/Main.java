package converter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main of program to run unit converter.
 * 
 * @author Worawat Chueajedton
 *
 */
public class Main extends Application {
	
	/**
	 * Set the UI.
	 */
	@Override
	public void start(Stage stage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("ConverterUI.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.sizeToScene();
			stage.show();
		} catch (Exception e) {
			System.out.println("Exception creating scene: " + e.getMessage());
		}
	}

	/**
	 * Launch program.
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
