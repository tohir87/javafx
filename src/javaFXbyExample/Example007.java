package javaFXbyExample;

// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class Example007 extends Application {
	
	// init method
	public void init(){
		// initialize buttons
		tbtn_button = new ToggleButton("Toggle me");
		label_display = new Label("Button is in the off state");
		
		
	}
	
	// start method
	public void start(Stage primaryStage){
		primaryStage.setTitle("Toggle button example");
		VBox vb = new VBox();
		primaryStage.setScene(new Scene(vb, 400, 300));
		primaryStage.show();
		
		// add the text and buttons to the layout
		vb.getChildren().addAll(label_display, tbtn_button);
		
		// add event listener to toggle button to update the text
		tbtn_button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event){
				if (tbtn_button.isSelected()) {
					label_display.setText("Button is in the on state");
				}else{
					label_display.setText("Button is in the off state");
				}
			}
		});
		
	}
	
	// stop method
	public void stop(){}
	
	public static void main(String[] args){
		launch(args);
	}
	
	private ToggleButton tbtn_button;
	private Label label_display;

}
