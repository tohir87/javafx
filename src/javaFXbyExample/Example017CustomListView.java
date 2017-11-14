package javaFXbyExample;

import java.util.ArrayList;
import javafx.application.Application; 
import javafx.beans.value.ChangeListener; 
import javafx.beans.value.ObservableValue; 
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler; 
import javafx.scene.Scene;
import javafx.scene.control.Label; 
import javafx.scene.control.ListCell; 
import javafx.scene.control.ListView; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.VBox; 
import javafx.stage.Stage;
import javafx.util.Callback;

public class Example017CustomListView extends Application {
	
	public void init(){
		// 05 code
		// generate a few task items for the arraylist
		al_taskitems = new ArrayList<TaskItem>(); 
		al_taskitems.add(new TaskItem(false, "task 1")); 
		al_taskitems.add(new TaskItem(true, "task 2")); 
		al_taskitems.add(new TaskItem(false, "task 3")); 
		al_taskitems.add(new TaskItem(true, "task 4"));
		
		// 06 code
		// initialise all of our widgets
		vb_mainlayout = new VBox();
		ol_items = FXCollections.observableArrayList(al_taskitems);
		lv_items = new ListView<TaskItem>(ol_items);
		lbl_display = new Label("no item selected");
		tf_adding = new TextField(); 
		vb_mainlayout.getChildren().addAll(lbl_display, lv_items, tf_adding);
		
		// 07 code
		// set a cell factory in our list view
//		lv_items.setCellFactory(new Callback<ListView<TaskItem>, ListCell<TaskItem>>() {
//			// override to create nre cell items
//			@Override
//			public ListCell<TaskItem> call(ListView<TaskItem>){
//				TaskItemCellRenderer r = new TaskItemCellRenderer(Example017CustomListView.this);
//				r.setEditable(true);
//				return r;
//			}
//		});
		
		// 09 code
		
		// 10 code
	}
	
	public void start(Stage primaryStage){
		primaryStage.setTitle("Custom ListView item example"); 
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
	
	 // private fields of the class
	private VBox vb_mainlayout;
	private ArrayList<TaskItem> al_taskitems; 
	private ObservableList<TaskItem> ol_items; 
	private ListView<TaskItem> lv_items; 
	private Label lbl_display;
	private TextField tf_adding;

}
