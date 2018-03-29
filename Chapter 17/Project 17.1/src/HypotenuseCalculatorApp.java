

import java.text.NumberFormat;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox; 



public class HypotenuseCalculatorApp extends Application {
	
	private TextField sideA;
	private TextField sideB;
	private TextField sideC;
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Right Triangle Calculator");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		
		Scene scene = new Scene(grid,300,100);
		
		grid.add(new Label("Side A:"),0,0);
		sideA = new TextField();
		grid.add(sideA, 1, 0);
		
		grid.add(new Label("Side B:"),0,1);
		sideB = new TextField();
		grid.add(sideB, 1, 1);
		
		grid.add(new Label("Side C:"),0,2);
		sideC = new TextField();
		sideC.setEditable(false);
		grid.add(sideC, 1, 2);
		
		Button calculateButton = new Button("Calculate");
		calculateButton.setOnAction(event -> calculateButtonClicked());
	
		Button exitButton = new Button("Exit");
		exitButton.setOnAction(event -> exitClicked());
		
		HBox buttonBox = new HBox(10);
		buttonBox.getChildren().add(calculateButton);
		buttonBox.getChildren().add(exitButton);
		buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
		grid.add(buttonBox, 0, 4, 2, 1);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void exitClicked() {
		System.exit(0);
	}

	private void calculateButtonClicked() {
		Validation v = new Validation();
		String errorMSG = "";
		errorMSG += v.isDouble(sideA.getText(), "Side A");
		errorMSG += v.isDouble(sideB.getText(), "Side B");
		if (errorMSG.isEmpty()) {
			double a = Double.parseDouble(sideA.getText());
			double b = Double.parseDouble(sideB.getText());
			double top = ((b * b) + (a * a));
			double ans = Math.sqrt(top);
			NumberFormat number = NumberFormat.getInstance();
			number.setMaximumFractionDigits(3);
			sideC.setText(number.format(ans));
		}
		else {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Invalid Data!");
			alert.setContentText(errorMSG);
			alert.showAndWait();
			
		}
	}
	public static void main(String[] args) {
		launch(args);
	}

}
