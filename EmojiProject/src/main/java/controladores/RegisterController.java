/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class RegisterController implements Initializable {

    @FXML
    private TextField txtUser;
    @FXML
    private TextField txtPsw;
    @FXML
    private TextField txtConfirmPsw;
    @FXML
    private Button backButton;
    @FXML
    private Button saveButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToPrimary(ActionEvent event) {
    }

    @FXML
    private void save(ActionEvent event) {
    }
    
}
