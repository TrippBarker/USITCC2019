package application;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	public static SceneSwitcher ss;
	
	public String loginScenePath = "scenes/LoginScene.fxml";
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		ss = new SceneSwitcher(primaryStage);
		ss.switchScene(loginScenePath);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
