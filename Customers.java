import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Customers extends Application{
    public static void main(String[]args){
        launch();
    }
    public void start (Stage stage){
        Text text1 =new Text("Name");
        Text text2= new Text("Phone");
        Text text3 =new Text("Email");
        Text text4= new Text("Registered");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        ComboBox combox1 =new ComboBox();
        Button save = new Button("Save customer");
        Button remove = new Button("Remove Customer");
        GridPane gridPane = new GridPane();
        gridPane.setMinSize (800,400);
        gridPane.setPadding(new Insets(20,20,20,20));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-background-color: BEIGE;"); 
        text1.setStyle("-fx-font: normal bold 15px 'serif';");
        text2.setStyle("-fx-font: normal bold 15px 'serif';");
        text3.setStyle("-fx-font: normal bold 15px 'serif';");
        text4.setStyle("-fx-font: normal bold 15px 'serif';");
        save.setStyle("-fx-background-color:skyblue; -fx-text-fill:white;-fx-font: normal bold 15px 'serif';");
        remove.setStyle("-fx-background-color:skyblue; -fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
        combox1.setMinSize(150,20);
        save.setMinSize(150,20);
        remove.setMinSize(150,20);

        gridPane.setVgap(15);
        gridPane.setHgap(15);

        gridPane.add(text1,0,0);
        gridPane.add(textField1,1,0);
        gridPane.add(text2, 0,1);
        gridPane.add(textField2,1,1);
        gridPane.add(text3, 0,2);
        gridPane.add(textField3,1,2);
        gridPane.add(save,1,3);
        gridPane.add(text4, 0,4);
        gridPane.add(combox1,1,4);
        gridPane.add(remove,1,5);

        Scene scene= new Scene(gridPane);
        stage.setTitle("Customers ");

        stage.setScene(scene);
        stage.show();

    }
}