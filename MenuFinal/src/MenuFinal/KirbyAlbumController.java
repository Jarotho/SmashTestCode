/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package MenuFinal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class KirbyAlbumController implements Initializable {

    @FXML
    private AnchorPane KirbyPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void KirbyWiki(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("KirbyWiki.fxml"));
    KirbyPane.getChildren().setAll(pane);
    }

    @FXML
    private void BackToMenu(ActionEvent event) throws IOException {
        ScrollPane pane = FXMLLoader.load(getClass().getResource("Album.fxml"));
    KirbyPane.getChildren().setAll(pane);
    }
    
}
