package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Popup;

/**
 * UI controller for events and initializing components.
 */
public class ConverterController {
	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	Button button1;
	@FXML
	Button button2;
	@FXML
	ComboBox<Length> combo1;
	@FXML
	ComboBox<Length> combo2;

	/**
	 * JavaFX calls the initialize() method of your controller when it creates
	 * the UI form, after the components have been created and @FXML annotated
	 * attributes have been set.
	 *
	 * This is a hook to initialize anything your controller or UI needs.
	 */
	@FXML
	public void initialize() {
		// This is for testing
		System.out.println("Running initialize");
		if (combo1 != null) {
			combo1.getItems().addAll(Length.values());
			combo1.getSelectionModel().select(0); // select an item to show
		}
		if (combo2 != null) {
			combo2.getItems().addAll(Length.values());
			combo2.getSelectionModel().select(1); // select an item to show
		}
	}

	/**
	 * Convert a distance from one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		textfield1.setStyle("-fx-text-inner-color: black;");
		textfield2.setStyle("-fx-text-inner-color: black;");
		String text = textfield1.getText().trim();
		String text1 = textfield2.getText().trim();
		Length lengthValue = combo1.getValue();
		Length lengthValue1 = combo2.getValue();
		if (!textfield1.getText().equals("")) {
			try {
				double value1 = Double.parseDouble(text);
				textfield2.setText(String.format("%.4g", (lengthValue.getValue() / lengthValue1.getValue()) * value1));
			} catch (NumberFormatException e) {
				textfield1.setStyle("-fx-text-inner-color: red;");
				textfield1.setText("Sorry invalid value");
			}
		}
		
		else if (!textfield2.getText().equals("")) {
			try {
				double value2 = Double.parseDouble(text1);
				textfield1.setText(String.format("%.4g", (lengthValue1.getValue() / lengthValue.getValue()) * value2));
			} catch (NumberFormatException e) {
				textfield2.setStyle("-fx-text-inner-color: red;");
				textfield2.setText("Sorry invalid value");
			}
		}

	}

	public void handleClear(ActionEvent event) {
		textfield1.setText(null);
		textfield2.setText(null);
		textfield1.setStyle("-fx-text-inner-color: black;");
		textfield2.setStyle("-fx-text-inner-color: black;");
		textfield1.clear();
		textfield2.clear();
	}

}