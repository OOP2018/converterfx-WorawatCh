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
	ComboBox<String> combo1;
	@FXML
	ComboBox<String> combo2;

	/**
	 * Convert a distance from one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		// read values from textfield(s)
		String text = textfield1.getText().trim();
		double value1;
		try {
			value1 = Double.parseDouble(text);
			textfield2.appendText(String.format("%.4g", value1 * 1.609344));
		} catch (NumberFormatException e) {
			Popup popup = new Popup();
			popup.setX(300);
			popup.setY(200);
			popup.show(popup);
		}
	}

	public void handleClear(ActionEvent event) {
		textfield1.clear();
		textfield2.clear();
	}
}