package javaFXbyExample;

// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Example004 extends Application {
	
	public void init(){
		// initialize the 5 buttons
		btn1 = new Button("Button 1");
		btn2 = new Button("Button 2");
		btn3 = new Button("Button 3");
		btn4 = new Button("Button 4");
		btn5 = new Button("Button 5");
	}
	
	public void start(Stage primaryStage){
		// set the title of our stage
		primaryStage.setTitle("HBox layout example");
		VBox vb = new VBox();
		primaryStage.setScene(new Scene(vb, 400, 300));
		
		// add spacing to the buttons
		vb.setSpacing(10);
		vb.setStyle("-fx-background-color: #0000FF");
		
		// add all buttons to vbox layout
		vb.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);
		
		// show the stage
		primaryStage.show();
	}
	
	public void stop(){
		System.out.println("Aplication is exiting");
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	private Button btn1, btn2, btn3, btn4, btn5;

}
