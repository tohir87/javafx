package javaFXbyExample;

//imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class Example006 extends Application {
	
	// init method
	public void init(){
		// initialize the button and labels
		label = new Label("This button has been clicked 0 times");
		btn = new Button("Click me");
		clicks = 0;
	}
	
	// the start method
	public void start(Stage primaryStage) {
		// set title
		primaryStage.setTitle("Event Listener");
		VBox vb = new VBox();
		primaryStage.setScene(new Scene(vb, 400, 300));
		// show
		primaryStage.show();
		
		// add text and button to vertical box layout
		vb.getChildren().addAll(label, btn);
		
		// code 02
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event){
				clicks++;
				label.setText("This button has been clicked " + clicks + " times");
			}
		});
	}
	
	// stop
	public void stop(){}
	
	public static void main(String[] args){
		launch(args);
	}
	
	private Label label;
	private Button btn;
	private int clicks;

}
