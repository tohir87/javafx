package javaFXbyExample;

//imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class Example008 extends Application {

	// init method
		public void init(){
			// initialize buttons
			label_display = new Label("Checkbox is unchecked");
			chk_button = new CheckBox("This is a checkbox");
			
			
		}
		
		// start method
		public void start(Stage primaryStage){
			primaryStage.setTitle("Toggle button example");
			VBox vb = new VBox();
			primaryStage.setScene(new Scene(vb, 400, 300));
			primaryStage.show();
			
			// add the text and buttons to the layout
			vb.getChildren().addAll(label_display, chk_button);
			
			// add event listener to toggle button to update the text
			chk_button.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event){
					if (chk_button.isSelected()) {
						label_display.setText("Checkbox is checked");
					}else{
						label_display.setText("Checkbox is unchecked");
					}
				}
			});
			
		}
		
		// stop method
		public void stop(){}
		
		public static void main(String[] args){
			launch(args);
		}
		
		private CheckBox chk_button;
		private Label label_display;
}
