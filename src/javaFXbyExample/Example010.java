package javaFXbyExample;

//imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;


public class Example010 extends Application {
	// init method
	public void init(){
		// initialize all controls
		label_username = new Label("No Username");
		label_password = new Label("No Password");
		label_ulabel = new Label("Username");
		label_plabel = new Label("Password");
		tf_username = new TextField();
		pf_password = new PasswordField();
		gp_userpass = new GridPane();
		
		// put the textfields together on the gridpane layout
		gp_userpass.add(label_ulabel, 0, 0);
		gp_userpass.add(label_plabel, 0, 1);
		gp_userpass.add(tf_username, 1, 0);
		gp_userpass.add(pf_password, 1, 1);
		GridPane.setHgrow(tf_username, Priority.ALWAYS);
		GridPane.setHgrow(pf_password, Priority.ALWAYS);
		
		// add an event to the text field
		tf_username.setOnAction(new EventHandler<ActionEvent>() {
			// override this method
			@Override
			public void handle(ActionEvent event){
				label_username.setText("Username is: " + tf_username.getText());
			}
		});
		
		// add an event to the text field
		pf_password.setOnAction(new EventHandler<ActionEvent>() {
			// override this method
			@Override
			public void handle(ActionEvent event){
				label_password.setText("Password is: " + pf_password.getText());
			}
		});
		
		
		
		
	}
	
	public void start(Stage PrimaryStage){
		PrimaryStage.setTitle("textfield and passwordfield example");
		VBox vb = new VBox();
		vb.setFillWidth(true);
		
		PrimaryStage.setScene(new Scene(vb, 400, 300));
		
		PrimaryStage.show();
		
		vb.getChildren().addAll(label_username, label_password, gp_userpass);
	}
	
	// stop method
	public void stop(){}
	
	// main method
	public static void main(String[] args){
		launch(args);
	}
	
	// private fields that include texts, text field and password field
	private Label label_username, label_password, label_ulabel, label_plabel;
	private TextField tf_username;
	private PasswordField pf_password;
	private GridPane gp_userpass;
}
