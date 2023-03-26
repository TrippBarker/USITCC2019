package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class RegisterSceneController {
	@FXML
	TextField fNameField,
			  mInitialField,
			  lNameField,
			  streetField,
			  cityField,
			  zipField,
			  usernameField,
			  passwordField,
			  conPasswordField,
			  emailField,
			  phoneField;
	
	@FXML
	Button registerButton;
	
	public void printEverything(ActionEvent e) {
		System.out.println(fNameField.getText() + " " + emailField.getText());
	}
	
	public void cancelRegister(ActionEvent e) throws IOException {
		Main.ss.switchScene(Main.LOGIN_SCENE_PATH);
	}
	
	public void checkValidEntry(KeyEvent e) {
		TextField source = (TextField)e.getSource();
		String regex = "[^a-zA-Z]";
		int maxLen = 16;
		switch (source.getId()) {
		case "fNameField":
			break;
		case "mInitialField":
			regex = "[^A-Z]";
			maxLen = 1;
			break;
		case "lNameField":
			break;
		case "streetField":
			regex = "[^a-zA-Z0-9]";
			maxLen = 30;
			break;
		case "cityField":
			break;
		case "zipField":
			regex = "[^0-9]";
			maxLen = 5;
			break;
		}
		
		source.setText(source.getText().replaceAll(regex, ""));
		if (source.getText().length() > maxLen) {
			source.setText(source.getText().substring(0, maxLen));
		}
		source.positionCaret(source.getText().length());
		
		
	}
}
