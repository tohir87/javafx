package javaFXbyExample;

// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class Example009 extends Application {
	
	// init method
	public void init() {
		tg_radiobutton_group = new ToggleGroup();
		display_label = new Label("Radio Button 1 selected");
		rb1 = new RadioButton("Radio Button 1");
		rb2 = new RadioButton("Radio Button 2");
		rb3 = new RadioButton("Radio Button 3");
		
		// add radio buttons to toggle group
		rb1.setToggleGroup(tg_radiobutton_group);
		rb2.setToggleGroup(tg_radiobutton_group);
		rb3.setToggleGroup(tg_radiobutton_group);
		
		// set default selection on the first radio button
		rb1.setSelected(true);
		
	}
	
	// start method
	public void start(Stage primaryStage){
		primaryStage.setTitle("Radio button example");
		VBox vb = new VBox();
		primaryStage.setScene(new Scene(vb, 400, 300));
		
		primaryStage.show();
		
		// add button to the layout
		vb.getChildren().addAll(display_label, rb1, rb2, rb3);
		
		// add event listener to rb1
		rb1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				display_label.setText("Radio Button 1 selected");
			}
		});
		
		// add event listener to rb2
		rb2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				display_label.setText("Radio Button 2 selected");
			}
		});
		
		// add event listener to rb3
		rb3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				display_label.setText("Radio Button 3 selected");
			}
		});
	}
	
	// stop method
	public void stop(){
		System.out.println("App stops");
	}
	
	// main method
	public static void main(String[] args){
		launch(args);
	}
	
	private RadioButton rb1, rb2, rb3;
	private Label display_label;
	private ToggleGroup tg_radiobutton_group;
}
