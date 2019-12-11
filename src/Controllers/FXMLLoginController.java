/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javafx.scene.control.TextField;


import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class FXMLLoginController implements Initializable {
		    
	@FXML
	private TextField user;
	
	@FXML
	private PasswordField pass;
	
	@FXML
	private Label labelmsg;
	
	
    @FXML
    private void Login(ActionEvent event) throws IOException, SQLException{
    	
    	String username = user.getText();
        String password = pass.getText();
        if(username.equals("user")&&password.equals("user"))
        { 
        	Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXMLWelcome.fxml"));
        	Scene home_page_scene = new Scene(home_page_parent);
        	Stage app_stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	app_stage.hide();
        	app_stage.setScene(home_page_scene);        
        	app_stage.show();
          
        }
        else labelmsg.setText("Username or Password invalid!");
    	
        System.out.println("You clicked me!");        
    }
    
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Login is now loaded!");
//        handler=new DBHandler();
    }    
    
}
