package javaFXbyExample;

// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Example005 extends Application{
	// init
	public void init(){
		// initialise all eight buttons
		btn1 = new Button("Button 1");
		btn2 = new Button("Button 2");
		btn3 = new Button("Button 3");
		btn4 = new Button("Button 4");
		btn5 = new Button("Button 5");
		btn6 = new Button("Button 6");
		btn7 = new Button("Button 7");
		btn8 = new Button("Button 8");
		
	}
	
	// start
	public void start(Stage primaryStage) {
		// set stage title
		primaryStage.setTitle("Tile pane example");
		
		// a grid pane for the scene graph
		GridPane gp = new GridPane();
		
		// set window size
		primaryStage.setScene(new Scene(gp, 400, 300));
		
		// set window visibility
		primaryStage.show();
		
		// 03 code
		// set the button to expand to fill the available space
		btn1.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		btn2.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		btn3.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		btn4.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		btn5.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		btn6.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		btn7.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		btn8.setPrefSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
		
		
		// 02 code
		// add in buttons in a 4x2 layout
		gp.addRow(0, btn1, btn2);
		gp.addRow(1, btn3, btn4);
		gp.addRow(2, btn5, btn6);
		gp.addRow(3, btn7, btn8);
		
	}
	
	// stop 
	public void stop(){
		System.out.println("Application stops");
	}
	
	// launch
	public static void main(String[] args){
		launch(args);
	}
	
	private Button btn1, btn2, btn3, btn4;
	private Button btn5, btn6, btn7, btn8;

}
