package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import project.componentes.elmParteDrc;
import project.componentes.elmParteIzq;

import java.io.IOException;
import java.net.URL;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        elmParteIzq sccInfo = new elmParteIzq();
        elmParteDrc sccElmto = new elmParteDrc();
        
        HBox contenedorPrincipal = new HBox(5);
        VBox Vizq = new VBox();
        VBox Vder = new VBox();

        contenedorPrincipal.setPrefSize(600, 540);

        sccInfo.scc_Controllers().setPrefSize(300, 0);
        sccElmto.scc_info().setPrefSize(300, 0);

        sccInfo.scc_Controllers().getStyleClass().addAll("borde_caja");
        sccElmto.scc_info().getStyleClass().addAll("borde_caja");


        contenedorPrincipal.getChildren().addAll(sccElmto.scc_info(), sccInfo.scc_Controllers());

        contenedorPrincipal.setAlignment(Pos.CENTER);

        Scene scene = new Scene(new AnchorPane(contenedorPrincipal), 640, 550);

        AnchorPane.setTopAnchor(contenedorPrincipal, 5.0);
        AnchorPane.setLeftAnchor(contenedorPrincipal, 5.0);
        AnchorPane.setRightAnchor(contenedorPrincipal, 5.0);
        AnchorPane.setBottomAnchor(contenedorPrincipal, 5.0);

        // Cargar y agregar la hoja de estilos
        scene.getStylesheets().addAll(getClass().getResource("/style/stl.css").toExternalForm());


        stage.setTitle("FORMULARIO");
        stage.setScene(scene);
        stage.show();
        

    }

    public static void main(String[] args) {
        launch();
    }

}