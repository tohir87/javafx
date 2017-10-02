package javaFXbyExample;

//imports necessary for this application to work
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Example001 extends Application {
	//the init method that will initialise stuff before we start the running of our
	//application
	
	public void init(){}
	
	//the start method that will be the entry point for our application
	public void start(Stage primaryStage){
		// set the name of our pane or window
		primaryStage.setTitle("Hello world javaFx");
		
		// set the stage using a scene and put the basic layout
		StackPane root = new StackPane();
		primaryStage.setScene(new Scene(root, 400, 300));
		
		// add some text to the pane
		root.getChildren().add(new Label("hello world javaFX"));
		
		// show the stage
		primaryStage.show();
	}
	
	public void stop(){}
	
	public static void main(String[] args){
		launch(args);
	}
}
