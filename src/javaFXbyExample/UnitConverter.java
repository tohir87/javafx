package javaFXbyExample;

//imports
import javafx.application.Application; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.GridPane;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

public class UnitConverter extends Application {
	
	public void init(){
		// initialize buttons
		btn_convert = new Button("Convert");
		btn_erase = new Button("Erase");
		
		// Initialize labels
		lbl_accuracy = new Label("Accuracy");
		lbl_imperial = new Label("Imperial");
		lbl_metric = new Label("Metric");
		lbl_type = new Label("Conversion Type");
		lbl_empty = new Label("");
		
		// Initialize textfields
		tf_accuracy = new TextField();
		tf_imperial = new TextField();
		tf_metric = new TextField();
		
		// initialize slider
		sli_slider = new Slider(0, 5, 2);
		
		// Customise the slider a little bit
		sli_slider.setShowTickMarks(true);
		sli_slider.setShowTickLabels(true);
		sli_slider.setMajorTickUnit(1);
		sli_slider.setBlockIncrement(0.5);
		
		// initialize combo box
		cmb_type = new ComboBox<String>();
		cmb_type.getItems().addAll("Length", "Mass");
		
		
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Unit Converter");
		// a grid pane for the scene graph
		GridPane gp = new GridPane();

		// set window size
		primaryStage.setScene(new Scene(gp, 800, 300));
		
		// set window visibility
		primaryStage.show();
		
		// add controls to gridpane
		gp.addRow(0, lbl_type, cmb_type);
		gp.addRow(1, lbl_imperial, tf_imperial, lbl_metric, tf_metric);
		gp.addRow(2, lbl_empty, sli_slider, lbl_empty, tf_accuracy);
		gp.addRow(4, btn_convert, btn_erase);
		

	}
	
	public void stop(){
		
	}
	
	// launch
	public static void main(String[] args){
		launch(args);
	}
	
	private Label lbl_type, lbl_imperial, lbl_metric, lbl_empty, lbl_accuracy;
	private Button btn_convert, btn_erase;
	private TextField tf_imperial, tf_metric, tf_accuracy;
	private ComboBox<String> cmb_type;
	private Slider sli_slider;

}
