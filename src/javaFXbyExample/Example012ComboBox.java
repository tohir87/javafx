package javaFXbyExample;
//imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Example012ComboBox extends Application {
	// overriden init method
	@Override
	public void init(){
		// initialize all our widgets and layouts
		vb_mainlayout = new VBox();
		lbl_display = new Label("ComboBox: No current selection");
		cmb_combobox = new ComboBox<String>();
		cmb_combobox.getItems().addAll("Choice 1", "Choice 2", "Choice 3");
		
		// Add all children to the layout
		vb_mainlayout.getChildren().addAll(lbl_display, cmb_combobox);
		
		// set an event listener
		cmb_combobox.setOnAction(new EventHandler<ActionEvent>() {
			// override handle method
			@Override
			public void handle(ActionEvent event){
				// change the display label depending on what choice was made
				lbl_display.setText("ComboBox: " + cmb_combobox.getValue());
			}
		});
		
	}
	
	//Overriden start method
	@Override
	public void start(Stage primaryStage){
		// set the title
		primaryStage.setTitle("ComboBox Example");
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300));
		primaryStage.show();
		
	}
	
	// stop method
	// overriden stop method
	@Override
	public void stop(){}
	
	// main method
	public static void main(String[] args){
		launch(args);
	}
	
	// private fields of this class
	private Label lbl_display;
	private VBox vb_mainlayout;
	private ComboBox<String> cmb_combobox;

}
