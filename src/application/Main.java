package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // 1. Garanta que essa variável estática exista para armazenar a cena
    private static Scene mainScene;

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
            Parent parent = loader.load();
            
            // 2. CORREÇÃO: Guarde a referência na variável estática de classe (sem o "Scene" na frente)
            mainScene = new Scene(parent);
            
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Sample JavaFX application");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 3. Garanta que o método GET retorne a variável estática correta
    public static Scene getMainScene() {
        return mainScene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
