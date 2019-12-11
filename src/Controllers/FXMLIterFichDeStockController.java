/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author MSm
 */
public class FXMLIterFichDeStockController implements Initializable {
    
    @FXML
    private void menu(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXMLWelcome.fxml"));
    	Scene home_page_scene = new Scene(home_page_parent);
    	Stage app_stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	app_stage.hide();
    	app_stage.setScene(home_page_scene);
    	app_stage.show();
    }
    
    @FXML
    private void FichDeStock(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXMLFichDeStock.fxml"));
    	Scene home_page_scene = new Scene(home_page_parent);
    	Stage app_stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	app_stage.hide();
    	app_stage.setScene(home_page_scene);
    	app_stage.show();
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("interFichDeStock is now loaded!");
    }    
    
}
