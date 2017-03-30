package helloWorldSemXfml;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		//	Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			
			//construindo uma javanela sem o fxml
			GridPane root = new GridPane();
			root.setAlignment(Pos.CENTER);
			root.setVgap(10);
			root.setHgap(10);
			
			
			primaryStage.setTitle("Hello JavaFX");
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			
			//exibindo um texto dentro da janela
			Label greeting = new Label("Bem vindo ao JavaFX"); //adicionando texto
			greeting.setTextFill(Color.GREEN); //adicionando a cor do texto
			greeting.setFont(Font.font("Arial", FontWeight.BOLD, 70));
			root.getChildren().add(greeting);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
