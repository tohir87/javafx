package javaFXbyExample;

// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// class definition
public class Example003 extends Application {

	// the init method
	public void init(){
		// initialize the 5 buttons
		btn1 = new Button("Button 1");
		btn2 = new Button("Button 2");
		btn3 = new Button("Button 3");
		btn4 = new Button("Button 4");
		btn5 = new Button("Button 5");
		
	}
	
	// the start method
	public void start(Stage primaryStage){
		// 02 code
		// set the title of our stage
		primaryStage.setTitle("HBox layout example");
		HBox hb = new HBox();
		primaryStage.setScene(new Scene(hb, 400, 300));
		
		// add spacing to the buttons
		hb.setSpacing(10);
		hb.setStyle("-fx-background-color: #0000FF");
		
		// add all buttons to hbox layout
		hb.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);
		
		// show the stage
		primaryStage.show();
	}
	
	// the stop method
	public void stop(){
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	private Button btn1, btn2, btn3, btn4, btn5;
}
