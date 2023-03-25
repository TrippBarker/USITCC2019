package application;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	public static SceneSwitcher ss;
	
	public static final String LOGIN_SCENE_PATH = "scenes/LoginScene.fxml";
	public static final String REGISTER_SCENE_PATH = "scenes/RegisterScene.fxml";
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		ss = new SceneSwitcher(primaryStage);
		ss.switchScene(LOGIN_SCENE_PATH);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
