package javaFXbyExample;

// imports
import javafx.application.Application; 
import javafx.beans.value.ChangeListener; 
import javafx.beans.value.ObservableValue; 
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar; 
import javafx.scene.control.Slider; 
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Example015ProgressBar extends Application {
	
	public void init() {
		// create all widgets and add them to the layout
		vb_mainlayout = new VBox();
		pb_bar = new ProgressBar(0.2);
		sli_slider = new Slider(0, 100, 20); 
		vb_mainlayout.getChildren().addAll(pb_bar, sli_slider);
		
		// set all the ticks for the slider
		sli_slider.setShowTickMarks(true); 
		sli_slider.setShowTickLabels(true); 
		sli_slider.setMajorTickUnit(10);
		
		// set the progress bar to grow
		pb_bar.setMaxWidth(Double.MAX_VALUE);
		
		// set a listener on the slider value property and get it to change the progress // bar
		sli_slider.valueProperty().addListener(new ChangeListener<Number>() {
		      // overridden changed method to respond to the change in slider value
			public void changed(final ObservableValue<? extends Number> observable, final Number oldValue, final Number newValue) {
			            // update the value on the progress bar
				pb_bar.setProgress((double) newValue / 100); }
			});
	}
	
	// overridden start method
	public void start(Stage primaryStage) {
	// set a title, size and scene 
		primaryStage.setTitle("Progress Bar example"); 
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300)); 
		primaryStage.show();
	}
	
	// overridden stop method
	public void stop() {
	}
	
	// entry point into our program that will launch our javafx example
	public static void main(String[] args) { 
		launch(args);
	}
	
	// private fields that include a progress bar and a slider
	private ProgressBar pb_bar; 
	private Slider sli_slider;
	private VBox vb_mainlayout;


}
