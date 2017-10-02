package javaFXbyExample;

// imports
import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem; 
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar; 
import javafx.scene.control.MenuItem; 
import javafx.scene.control.RadioMenuItem; 
import javafx.scene.control.ToggleGroup; 
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// class definition
public class Example014menubar extends Application {
	// init method
	// Overriden init method
	@Override
	public void init(){
		// initialise our widgets and layout
		vb_mainlayout = new VBox();
		lbl_dispay = new Label("No menu item selected");
		mb_menubar = new MenuBar();
		menu_file = new Menu("File");
		menu_help = new Menu("Help");
		mb_menubar.getMenus().addAll(menu_file, menu_help);
		vb_mainlayout.getChildren().addAll(mb_menubar, lbl_dispay);
		
		// addin menu items to the file menu
		mi_hello = new MenuItem("Hello");
		mi_quit = new MenuItem("Quit");
		cmi_cb1 = new CheckMenuItem("Check box 1");
		cmi_cb2 = new CheckMenuItem("Check box 2");
		menu_file.getItems().addAll(mi_hello, mi_quit, cmi_cb1, cmi_cb2);
		
		
		// add radio button menu items to a toggle group and add them to 
		// the help menu
		tg_rmi = new ToggleGroup();
		rmi_rb1 = new RadioMenuItem("Radio button 1");
		rmi_rb2 = new RadioMenuItem("Radio button 2");
		rmi_rb1.setToggleGroup(tg_rmi);
		rmi_rb2.setToggleGroup(tg_rmi);
		menu_help.getItems().addAll(rmi_rb1, rmi_rb2);
		
		// add in an event listener to a menu
		mi_hello.setOnAction(new EventHandler<ActionEvent>() {
			// overriden method to handle an event for this method
			@Override
			public void handle(ActionEvent event){
				lbl_dispay.setText("Selected hello menu item");
			}
		});
		
		cmi_cb1.setOnAction(new EventHandler<ActionEvent>() {
			// overriden method to handle an event for this method
			@Override
			public void handle(ActionEvent event){
				lbl_dispay.setText("Selected check box menu item set to " + cmi_cb1.isSelected());
			}
		});
		
		rmi_rb1.setOnAction(new EventHandler<ActionEvent>() {
			// overriden method to handle an event for this method
			@Override
			public void handle(ActionEvent event){
				lbl_dispay.setText("Selected radio menu item 1");
			}
		});
		
		rmi_rb2.setOnAction(new EventHandler<ActionEvent>() {
			// overriden method to handle an event for this method
			@Override
			public void handle(ActionEvent event){
				lbl_dispay.setText("Selected radio menu item 2");
			}
		});
	}
	
	// start method
	// Overriden start method
	@Override
	public void start(Stage primaryStage){
		primaryStage.setTitle("Menu example");
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
	private VBox vb_mainlayout;
	private Label lbl_dispay;
	private MenuBar mb_menubar;
	private Menu menu_file, menu_help;
	private MenuItem mi_hello, mi_quit;
	private RadioMenuItem rmi_rb1, rmi_rb2;
	private CheckMenuItem cmi_cb1, cmi_cb2;
	private ToggleGroup tg_rmi;
	


}
