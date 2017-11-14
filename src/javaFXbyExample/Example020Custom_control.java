package javaFXbyExample;
import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;


public class Example020Custom_control extends Application {
	// overridden init method
	@Override
	public void init() {
		// initialise the stack pane and add a custom control to it
		sp_mainlayout = new StackPane();
		cc_custom = new CustomControl();
		sp_mainlayout.getChildren().add(cc_custom);
	}
	
	// overridden start method
	public void start(Stage primaryStage) {
		// set a size, title and a scene on the main window. show it when //
		// ready
		primaryStage.setTitle("Custom Control Example");
		primaryStage.setScene(new Scene(sp_mainlayout, 400, 300));
		primaryStage.show();
	}
	
	// overridden stop method
	public void stop() {
	}
	
	// entry point into our program to launch our JavaFX application
	public static void main(String[] args) {
		launch(args); 
	}
	
	// private fields for this class
	private StackPane sp_mainlayout; 
	private CustomControl cc_custom;


}
