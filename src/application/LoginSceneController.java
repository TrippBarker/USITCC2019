package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class LoginSceneController {
	
	@FXML
	TextField usernameField;
	
	@FXML
	PasswordField passwordField;
	
	@FXML
	Button loginUser;
	
	@FXML
	Hyperlink registerNewUser;
	
	public void LoginUser() {
		System.out.println("login");
	}
	
	public void RegisterNewUser() throws IOException {
		Main.ss.switchScene(Main.REGISTER_SCENE_PATH);
	}
	
	
	public void checkValidEntry(KeyEvent e) {
		TextField source = (TextField)e.getSource();
		int caretPos = source.getCaretPosition();
		String regex = "[^a-zA-Z]";
		int maxLen = 16;
		switch (source.getId()) {
		case "usernameField":
			regex = "[^a-zA-Z0-9]";
			maxLen = 10;
			break;
		case "passwordField":
			regex = "[^a-zA-Z0-9!@#$%&*_-]";
			maxLen = 20;
			break;
		}
		
		source.setText(source.getText().replaceAll(regex, ""));
		if (source.getText().length() > maxLen) {
			source.setText(source.getText().substring(0, maxLen));
		}
		source.positionCaret(caretPos);
	}
	
}


