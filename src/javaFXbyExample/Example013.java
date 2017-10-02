package javaFXbyExample;

// imports
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import javafx.stage.Stage;


// class definition
public class Example013 extends Application {
	
	// init method
	// Overriden init method
	@Override
	public void init(){
		// Initialise all layouts and widgets
		lbl_display = new Label("Slider value set at 5.0");
		sli_slider = new Slider(0, 10, 5);
		vb_mainlayout = new VBox();
		vb_mainlayout.getChildren().addAll(lbl_display, sli_slider);
		
		// Customise the slider a little bit
		sli_slider.setShowTickMarks(true);
		sli_slider.setShowTickLabels(true);
		sli_slider.setMajorTickUnit(1);
		sli_slider.setBlockIncrement(0.5);
		
		// add event listener into the slider
		sli_slider.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(final ObservableValue<? extends Number> observable, final Number oldValue, final Number newValue){
				lbl_display.setText("Slider value set to: " + newValue);
			}
		});
		
		
	}
	
	// start method
	// Overriden start method
	@Override
	public void start(Stage primaryStage){
		primaryStage.setTitle("Slider Example");
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300));
		primaryStage.show();
		
	}
	
	// stop method
	public void stop(){
		
	}
	
	// main method
	public static void main(String[] args){
		launch(args);
	}
	
	// private fields of the class
	private Label lbl_display;
	private Slider sli_slider;
	private VBox vb_mainlayout;

}
