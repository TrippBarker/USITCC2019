package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
		System.out.println("hello");
		Main.ss.switchScene("scenes/RegisterScene.fxml");
	}
}
