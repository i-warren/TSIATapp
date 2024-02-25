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

import java.io.IOException;

public class TSIAT_App extends Application {

    private Label lblLocation = new Label("Location");
    private Text txtLocation = new Text(null);
    private Label lblDetail = new Label("Detail");
    private Text txtDetail = new Text(null);
    private Label lblRandomEvent =  new Label("Random Event");
    private Text txtRandomEvent = new Text(null);
    private Label lblSectionNum = new Label("Section Number:");
    private Button btnPushForward =  new Button("Push Forward");
    private Button btnGoBack = new Button("Go Back");
    private Button btnStayPut = new Button("Stay Put");
    private Button btnStartReset = new Button("Start/Reset");

    private AdventureTracker appTracker = new AdventureTracker();

    public TSIAT_App() throws IOException {
    }


    @Override   // Override the start method of Application class
    public void start(Stage primaryStage) throws IOException {


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
        txtLocation.wrappingWidthProperty().bind(scrollLocation.widthProperty());
        locationVbox.getChildren().addAll(lblLocation, scrollLocation);
        pane.setLeft(locationVbox);

        // add Right Vbox
        VBox detailsVbox = new VBox();
        detailsVbox.setPadding(new Insets(5, 5, 5, 5));    // set Padding
        ScrollPane scrollDetail = new ScrollPane(txtDetail);
        scrollDetail.setPrefSize(400, 250);
        txtDetail.wrappingWidthProperty().bind(scrollDetail.widthProperty());

        ScrollPane scrollRandomEvent = new ScrollPane(txtRandomEvent);
        scrollRandomEvent.setPrefSize(400, 132);
        txtRandomEvent.wrappingWidthProperty().bind(scrollRandomEvent.widthProperty());

        detailsVbox.getChildren().addAll(lblDetail, scrollDetail, lblRandomEvent, scrollRandomEvent, lblSectionNum);
        pane.setRight(detailsVbox);

        // create navigation hbox
        HBox navigation = new HBox(40); // spacing = 20
        navigation.setPadding(new Insets(5, 5, 25, 40));    // set Padding

        // button set button actions
        btnPushForward.setOnAction(e -> {
            try {
                pushForward();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        btnGoBack.setOnAction(e -> {
            try {
                goBack();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        btnStayPut.setOnAction(e -> {
            try {
                stayPut();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        btnStartReset.setOnAction(e -> {
            try {
                startReset();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // Set buttons with preferred width
        btnPushForward.setPrefWidth(150);
        btnGoBack.setPrefWidth(150);
        btnStayPut.setPrefWidth(150);
        btnStartReset.setPrefWidth(150);

        // add buttons to navigation pane and set to Bottom of pane
        navigation.getChildren().addAll(btnPushForward, btnGoBack, btnStayPut, btnStartReset);
        pane.setTop(bannerPane);
        pane.setBottom(navigation);


        // create a scene and set it in the stage
        Scene scene = new Scene(pane, 820, 700);
        primaryStage.setTitle("This Ship is a Tomb Companion");  // set Title
        primaryStage.setScene(scene);           // Place scene in stage
        primaryStage.show();                    // Display stage
    }

    private void setTextFields(AdventureTracker adv) {
        lblSectionNum.setText("Section Number: " + appTracker.getSectionNum());
        txtLocation.setText(adv.getLocation().toString());
        txtDetail.setText(adv.getDetail().toString());
        txtRandomEvent.setText(adv.getRandomEvent().toString());

    }

    private void startReset() throws IOException {
        if (appTracker.getSectionNum() != 0) {
            appTracker = new AdventureTracker();
        }

        setTextFields(appTracker);
    }

    private void stayPut() throws IOException {
        appTracker.stayPut();
        setTextFields(appTracker);
    }

    private void goBack() throws IOException {
        appTracker.goBack();
        setTextFields(appTracker);
    }

    private void pushForward() throws IOException{
        if (appTracker.getSectionNum() < 27) {
            appTracker.pushForward();
            setTextFields(appTracker);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
