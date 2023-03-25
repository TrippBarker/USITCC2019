package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
}
