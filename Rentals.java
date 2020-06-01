import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Rentals extends Application{
    public static void main(String[]args){
        launch();
    }
    public void start (Stage stage){

        Text text1 =new Text("Customer");
        Text text2= new Text("Genre");
        Text text3 =new Text("Movies");
        Text text4= new Text("Borrowed");
        Text text5= new Text("Returned");
        ComboBox combox1 =new ComboBox();
        ComboBox combox2 =new ComboBox();
        ComboBox combox3 =new ComboBox();
        ComboBox combox4 =new ComboBox();
        ComboBox combox5 =new ComboBox();
        Button save = new Button("Save Rental");
        Button returned = new Button("Retuen movie");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize (800,400);
        gridPane.setPadding(new Insets(20,20,20,20));
        gridPane.setAlignment(Pos.CENTER);

        gridPane.setStyle("-fx-background-color: BEIGE;"); 
        text1.setStyle("-fx-font: normal bold 15px 'serif';");
        text2.setStyle("-fx-font: normal bold 15px 'serif';");
        text3.setStyle("-fx-font: normal bold 15px 'serif';");
        text4.setStyle("-fx-font: normal bold 15px 'serif';");
        text5.setStyle("-fx-font: normal bold 15px 'serif';");
        save.setStyle("-fx-background-color:skyblue; -fx-text-fill:white;-fx-font: normal bold 15px 'serif';");
        returned.setStyle("-fx-background-color:skyblue; -fx-text-fill:white; -fx-font: normal bold 15px 'serif';");

        //size the combobox and the buttons
        combox1.setMinSize(150,20);
        combox2.setMinSize(150,20);
        combox3.setMinSize(150,20);
        combox4.setMinSize(150,20);
        combox5.setMinSize(150,20);
        save.setMinSize(150,20);
        returned.setMinSize(150,20);

        gridPane.setVgap(15);
        gridPane.setHgap(15);

        gridPane.add(text1,0,0);
        gridPane.add(combox1,1,0);
        gridPane.add(text2, 0,1);
        gridPane.add(combox2,1,1);
        gridPane.add(text3, 0,2);
        gridPane.add(combox3,1,2);
        gridPane.add(save,1,3);
        gridPane.add(combox4,1,4);
        gridPane.add(text4, 0,3);
        gridPane.add(returned,1,5);
        gridPane.add(text5, 0,5);
          gridPane.add(combox5,1,6);

        Scene scene= new Scene(gridPane);
        stage.setTitle("Rentals");

        stage.setScene(scene);
        stage.show();

    }
}