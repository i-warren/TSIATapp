import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TSIAT_App extends Application {

    private Label lblLocation = new Label("Location");
    private Text txtLocation = new Text(null);
    private Label lblDetail = new Label("Detail");
    private Text txtDetail = new Text(null);
    private Label lblRandomEvent =  new Label("Random Event");
    private Text txtRandomEvent = new Text(null);
    private Button moveForward =  new Button("Move Forward");
    private Button goBack = new Button("Go Back");
    private Button stayPut = new Button("Stay Put");
    private Button startReset = new Button("Start/Reset");


    @Override   // Override the start method of Application class
    public void start(Stage primaryStage) {


        BorderPane pane = new BorderPane();

        // add top banner image
        Pane bannerPane =  new Pane();
        ImageView bannerView = new ImageView("TSIAT_Companion_Banner.jpg");
        bannerView.setFitWidth(820);
        bannerView.setFitHeight(200);
        bannerPane.getChildren().add(bannerView);



        // add left Location
        VBox locationVbox = new VBox();
        locationVbox.setPadding(new Insets(5, 5, 5, 5));    // set Padding
        ScrollPane scrollLocation = new ScrollPane(txtLocation);
        scrollLocation.setPrefSize(400, 400);
        locationVbox.getChildren().addAll(lblLocation, scrollLocation);
        pane.setLeft(locationVbox);

        // add Right Vbox
        VBox detailsVbox = new VBox();
        detailsVbox.setPadding(new Insets(5, 5, 5, 5));    // set Padding
        ScrollPane scrollDetail = new ScrollPane(txtDetail);
        scrollDetail.setPrefSize(400, 250);

        ScrollPane scrollRandomEvent = new ScrollPane(txtRandomEvent);
        scrollRandomEvent.setPrefSize(400, 132);
        detailsVbox.getChildren().addAll(lblDetail, scrollDetail, lblRandomEvent, scrollRandomEvent);
        pane.setRight(detailsVbox);

        // create navigation hbox
        HBox navigation = new HBox(40); // spacing = 20
        navigation.setPadding(new Insets(5, 5, 25, 40));    // set Padding

        // Set buttons with preferred width
        moveForward.setPrefWidth(150);
        goBack.setPrefWidth(150);
        stayPut.setPrefWidth(150);
        startReset.setPrefWidth(150);

        // add buttons to navigation pane and set to Bottom of pane
        navigation.getChildren().addAll(moveForward, goBack, stayPut, startReset);
        pane.setTop(bannerPane);
        pane.setBottom(navigation);


        // create a scene and set it in the stage
        Scene scene = new Scene(pane, 820, 700);
        primaryStage.setTitle("This Ship is a Tomb Companion");  // set Title
        primaryStage.setScene(scene);           // Place scene in stage
        primaryStage.show();                    // Display stage
    }
    public static void main(String[] args) {
        launch(args);
    }
}
