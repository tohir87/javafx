package javaFXbyExample;

// imports
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.CheckBox; 
import javafx.scene.control.Label; 
import javafx.scene.control.ListCell; 
import javafx.scene.layout.HBox;

public class TaskItemCellRenderer extends ListCell<TaskItem> {
	// default constructor for this class
	public TaskItemCellRenderer(Example017CustomListView ref){
		// call the super class
		super();
		this.ref = ref;
		
		// 04 code
		// initialise all of our widgets and layouts
		hb_mainlayout = new HBox();
		cb_done = new CheckBox();
		lbl_task_name = new Label(); 
		hb_mainlayout.getChildren().addAll(cb_done, lbl_task_name);
		
		// 12 code
		
	}
	
	// method that will update the display of a list cell whenever it needs to update
	public void updateItem(TaskItem item, boolean empty){
		super.updateItem(item, empty);
		
		// 08 code goes here
		// update what is displayed for this item assuming that we have an item
		if (!empty && item != null){
			cb_done.setSelected(item.complete);
			lbl_task_name.setText(item.name);
			setGraphic(hb_mainlayout);
		}else {
			setGraphic(null);
		}
	}
	
	// private fields in the class
	private HBox hb_mainlayout;
	private CheckBox cb_done;
	private Label lbl_task_name;
	
	// reference the application
	private Example017CustomListView ref;
}
