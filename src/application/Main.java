package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
	
	public SceneSwitcher ss;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("scenes/LoginScene.fxml"))));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
