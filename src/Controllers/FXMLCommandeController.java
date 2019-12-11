/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

//import com.code.Date;

import DBConnection.DBHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author MSm
 */
public class FXMLCommandeController implements Initializable {
	
	@FXML
	private TextField Designation;
	
	@FXML
	private TextField quantiteCommande;
	
	@FXML
	private TextField numCommande;
	
	@FXML
	private TextField DateCommande;
	
	@FXML
	private TextField adresseCommande;
    
	private Connection connection;
	private DBHandler handler;
	private PreparedStatement pst;
	
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
    public void ajouter(ActionEvent event) throws SQLException, IOException {

    	String insert="INSERT INTO client (adresseClt,nomCltl,telClt,credit,achat)"+"VALUES (?,?,?,?,?)";
    	connection=handler.getConnection();
        try {
			pst = connection.prepareStatement(insert);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
         pst.setString(1, Designation.getText());
         pst.setInt(2, Integer.valueOf(quantiteCommande.getText()));
         pst.setInt(3, Integer.valueOf(numCommande.getText()));
 /*        Date d=Date.valueOf(DateCommande.getValue());
         pst.setDate(4,d);*/
         pst.setString(5, adresseCommande.getText());
         pst.executeUpdate();
         pst.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Commande is now loaded!");
    }    
    
}
