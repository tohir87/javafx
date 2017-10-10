package javaFXbyExample;

//imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Slider;
import javafx.stage.Stage;
import java.util.*;

public class UnitConverter extends Application {
	
	public void init(){
		// Conversion Type - ComboBox
		conversion_type_combobox = new ComboBox<String>();
		conversion_type_combobox.getItems().addAll("Length", "Mass");
		conversion_type_combobox.setValue("Length");
		
		// buttons
		convert_button = new Button("Convert");
		reset_button = new Button("Reset");
		
		conversion_type_label = new Label("Conversion Type");
		imperial_label = new Label("Imperial");
		metric_label = new Label("Metric");
		accuracy_label = new Label("Accuracy");
		
		metric_textField = new TextField(); 
		accuracy_textField = new TextField();
		imperial_textField = new TextField();

		// Prevent the Accuracy and Metric TextFields being editable  
		accuracy_textField.setEditable(false);
		metric_textField.setEditable(false);
		
		initalizeControlValues();
//	 
		
		// Set radio buttons to toggle groups
		metric_radioButton_1.setToggleGroup(metric_toggleGroup);
		metric_radioButton_2.setToggleGroup(metric_toggleGroup);
		metric_radioButton_3.setToggleGroup(metric_toggleGroup);
		
		imperial_radioButton_1.setToggleGroup(imperial_toggleGroup);
		imperial_radioButton_2.setToggleGroup(imperial_toggleGroup);
		imperial_radioButton_3.setToggleGroup(imperial_toggleGroup);
		
		// Layout controls as per the diagram, feel free to improve the UI. 
		// How many rows and columns do you want - work this out on paper first 
		// My version has 5 rows and 8 columns you can look at the JavaFX API to 
		// see how to get controls to span more than one column
		
	
		// Method call (not declaration!)  to initialize the controls based on the conversion type.
		
		// Initialization for the controls if the conversion_type_combobox is set to Length
		
				
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Unit Converter");
		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		
		// set window size
		primaryStage.setScene(new Scene(gp, 800, 300));
		
		// set window visibility
		primaryStage.show();
		
		// add controls to gridpane
		gp.add(conversion_type_label, 0, 0);
		gp.add(conversion_type_combobox, 1, 0,3,1);
		gp.add(imperial_label, 0, 1);
		gp.add(imperial_textField, 1, 1);
		gp.add(metric_label, 2, 1);
		gp.add(metric_textField, 3, 1);
		
		
		gp.add(imperial_radioButton_1, 1, 2);
		gp.add(imperial_radioButton_2, 2, 2);
		gp.add(imperial_radioButton_3, 3, 2);
		gp.addRow(4, accuracy_label, accuracy_slider, accuracy_textField);
		gp.addRow(5, convert_button, reset_button);
		

	}
	
	public void stop(){
		System.out.println("exit");
	}
	
	// launch
	public static void main(String[] args){
		launch(args);
	}
	
	// Variable declaration. Although it is not correct to do so you may choose to initalize 
	// variable here also to avoid a very large init() method
	private void initalizeControlValues(){
		if(conversion_type_combobox.getValue() == "Length"){

			//Initialize length to 1.0
			imperial_textField.setText("1");
			
			// Set slider scale 0 to 6, set slider value to 4 and ticks to 1 unit intervals
			accuracy_slider = new Slider(0, 6, 4);
			accuracy_slider.setBlockIncrement(1);
			
			// Initialize the radio buttons
			imperial_radioButton_1 = new RadioButton("in");
			imperial_radioButton_2 = new RadioButton("foot");
			imperial_radioButton_3 = new RadioButton("yard");
			
			metric_radioButton_1 = new RadioButton("mm");
			metric_radioButton_2 = new RadioButton("cm");
			metric_radioButton_3 = new RadioButton("m");
				
			// Set default selections for the radio buttons
			imperial_radioButton_1.setSelected(true);
			metric_radioButton_1.setSelected(true);
		}
		// Initialization for the controls if the conversion_type_combobox is set to Mass
		else if(conversion_type_combobox.getValue() == "Mass"){
			
			// Initialize the mass to .5
			imperial_textField.setText("0.5");
			// Set slider scale 0 to 5, set slider value to 3 and ticks to 1 unit intervals
			accuracy_slider = new Slider(0, 5, 3);
			accuracy_slider.setBlockIncrement(1);
			
			// Initialize the radio buttons
			imperial_radioButton_1 = new RadioButton("oz");
			imperial_radioButton_2 = new RadioButton("lb");
			imperial_radioButton_3 = new RadioButton("stone");
			
			metric_radioButton_1 = new RadioButton("g");
			metric_radioButton_2 = new RadioButton("kg");
			metric_radioButton_3 = new RadioButton("tone");
			
			// Set default selections for the radio buttons
			imperial_radioButton_2.setSelected(true);
			metric_radioButton_2.setSelected(true);
			
		}
	}
	

	// Layout
	private GridPane gp;

	// Conversion Type
	private Label conversion_type_label;
	private ComboBox<String> conversion_type_combobox;
			
	// Imperial
	private Label imperial_label;
	private TextField imperial_textField;
	private ToggleGroup imperial_toggleGroup;
	private RadioButton imperial_radioButton_1;
	private RadioButton imperial_radioButton_2;
	private RadioButton imperial_radioButton_3;
	
	// Metric
	private Label metric_label;
	private TextField metric_textField ;
	private ToggleGroup metric_toggleGroup;
	private RadioButton metric_radioButton_1;
	private RadioButton metric_radioButton_2;
	private RadioButton metric_radioButton_3;
	
	//Accuracy
	private Label accuracy_label;
	private Slider accuracy_slider;
	private TextField accuracy_textField;
	private int accuracy;
	
	//Calculate and Erase
	private Button convert_button;
	private Button reset_button;

}
