package javaFXbyExample;
//imports
import javafx.application.Application; 
import javafx.beans.value.ChangeListener; 
import javafx.beans.value.ObservableValue; 
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler; 
import javafx.scene.Scene;
import javafx.scene.control.Label; 
import javafx.scene.control.ListView; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.VBox; 
import javafx.stage.Stage;

public class Example016ListView extends Application {
	public void init(){
		
		// initialise the widgets and layouts and add all widgets to the layout
		lbl_display = new Label("no item selected");
		vb_mainlayout = new VBox();
		ol_strings = FXCollections.observableArrayList("one", "two", "three", "four"); lv_strings = new ListView<String>(ol_strings);
		tf_adding = new TextField();
		vb_mainlayout.getChildren().addAll(lbl_display, lv_strings, tf_adding);
		
		// add in an event handler to the textfield which will add an item into the
		// observable list
		tf_adding.setOnAction(new EventHandler<ActionEvent>() {
		// overridden handle method that will add a new item to the list view @Override
		public void handle(ActionEvent event) {
		            ol_strings.add(tf_adding.getText());
		      }
		});
		
		// add in an event handler to the listview that will listen for events
		lv_strings.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			// overridden changed method that will listen for changes in the selected 
			// item. will update the display to reflect this change
			@Override
			public void changed(final ObservableValue<? extends String> observable,
				final String old_value, final String new_value) { 
					lbl_display.setText("Item selected: " + new_value);
				} 
			});
		
	}
	
	public void start(Stage primaryStage){
		// set a title, and a scene on the main window 
		primaryStage.setTitle("Listview example"); 
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300)); 
		primaryStage.show();
	}
	
	// overridden version of the stop method
	@Override
	public void stop() {
	}
	
	public static void main(String[] args) { 
		launch(args);
	}
	
    // private fields for this window
	private Label lbl_display;
	private TextField tf_adding;
	private VBox vb_mainlayout;
	private ListView<String> lv_strings; private ObservableList<String> ol_strings;
}
