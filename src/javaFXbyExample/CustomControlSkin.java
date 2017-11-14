package javaFXbyExample;

//basic implementation of a skin
//imports necessary for this class to work
import javafx.scene.control.Skin;
import javafx.scene.control.SkinBase;

public class CustomControlSkin extends SkinBase<CustomControl> implements Skin<CustomControl> {
	public CustomControlSkin(CustomControl cc) { 
		// call the super class constructor 
		super(cc);
	}
}
