package jfxtras.styles.jmetro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;

public class TabPaneSample extends Application {

    private static final JMetro.Style STYLE = JMetro.Style.LIGHT;

    public static void main(String[] args) {
        launch(args);
    }

    public TabPaneSample() {
    }

    @Override
    public void start(Stage stage) {
        TabPane tabPane = new TabPane();

        Tab fileTab = new Tab();
        fileTab.setClosable(false);
        fileTab.setText("File");

        Tab homeTab = new Tab();
        homeTab.setClosable(false);
        homeTab.setText("Home");

        Tab insertTab = new Tab();
        insertTab.setClosable(false);
        insertTab.setText("Insert");

        Tab tableTab = new Tab();
        tableTab.setClosable(false);
        tableTab.setText("Table");

        Tab optionsTab = new Tab();
        optionsTab.setClosable(false);
        optionsTab.setText("Options");

        tabPane.getTabs().addAll(fileTab, homeTab, insertTab, tableTab, optionsTab);

        BorderPane root = new BorderPane(tabPane);

        if (STYLE.equals(JMetro.Style.DARK)) {
            root.setStyle("-fx-background-color: #111;");
        } else {
            root.setStyle("-fx-background-color: white;");
        }

        Scene scene = new Scene(root, 500, 200);

        new JMetro(STYLE).applyTheme(scene);

//        ScenicView.show(scene);


        stage.setTitle("TabPane Sample");
        stage.setScene(scene);
        stage.show();
    }
}