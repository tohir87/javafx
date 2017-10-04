package javaFXbyExample;

//imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Example011TextArea extends Application {
	public void init(){
		// initialize our layouts and widgets
		vb_mainlayout = new VBox();
		ta_textarea = new TextArea();
		ta_response = new TextArea();
		
		// attach the areas to the pane
		vb_mainlayout.getChildren().addAll(ta_textarea, ta_response);
		ta_response.setEditable(false);
		
		
		
		
		ta_textarea.textProperty().addListener(new ChangeListener<String>() {
			// method that must be overridden to listen for changes in the text area 
			@Override
			public void changed(final ObservableValue<? extends String> observable,
			final String oldValue, final String newValue) { 
				ta_response.setText(newValue);
			} 
			});
		
	}
	
	public void start(Stage primaryStage){
		// set a title on the primary stage, a size and a scene 
		primaryStage.setTitle("TextArea example"); 
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300)); 
		primaryStage.show();
	}
	
	// stop method
	public void stop(){}
	
	// main method
	public static void main(String[] args){
		launch(args);
	}
	
	private VBox vb_mainlayout;
	private TextArea ta_textarea, ta_response;
}
