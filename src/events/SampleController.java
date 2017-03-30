package events;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	private TextField nameField;
	@FXML
	private Button helloButton;
	@FXML
	private Button byeButton;
	
	@FXML
	public void initialize(){
		helloButton.setDisable(true);
		byeButton.setDisable(true);
	}
	
	@FXML
	public void onButtonClicked(ActionEvent e){
		if(e.getSource().equals(helloButton)){
			System.out.println("Oiii, " + nameField.getText());
		} else if(e.getSource().equals(byeButton)){
			System.out.println("Tchau, " + nameField.getText());
		}			
	}
	@FXML
	public void handleKeyReleased(){
		String text = nameField.getText();
		boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
		helloButton.setDisable(disableButtons);
		byeButton.setDisable(disableButtons);
	}
}
