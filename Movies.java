import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Movies extends Application{

    public static void main(String[]args){
        launch(args);
    }
    public void start(Stage stage){
        Text text1 =new Text("Genre");
        Text text2= new Text("Name");
        TextField textField1 = new TextField();
        Text text3 = new Text("Register");
        ComboBox combox1 =new ComboBox();
        Button save = new Button("Save Movie");
        ComboBox combox2 =new ComboBox();
        Button remove = new Button("Remove Movie");
        GridPane gridPane = new GridPane();
        gridPane.setMinSize (400, 200);
        gridPane.setPadding(new Insets(15,15,15,15));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-background-color: BEIGE;"); 
        save.setStyle("-fx-background-color:skyblue; -fx-text-fill:white;-fx-font: normal bold 15px 'serif';");
        remove.setStyle("-fx-background-color:skyblue; -fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
        combox1.setMinSize(150,20);
        combox2.setMinSize(150,20);
        save.setMinSize(150,20);
        remove.setMinSize(150,20);



        gridPane.setVgap(7);
        gridPane.setHgap(7);

        gridPane.add(text1,0,0);
        gridPane.add(combox1,1,0);
        gridPane.add(text2, 0,1);
        gridPane.add(textField1,1,1);
        gridPane.add(save,1,2);
        gridPane.add(text3, 0,3);
        gridPane.add(combox2,1,3);
        gridPane.add(remove,1,4);
        Scene scene= new Scene(gridPane);
        stage.setTitle("Movies");

        stage.setScene(scene);
        stage.show();



       

        
    }
}