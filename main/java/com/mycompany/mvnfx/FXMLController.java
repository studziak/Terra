package com.mycompany.mvnfx;

import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private ImageView preview;
    @FXML
    private Label karta1;
    
    @FXML
    private void handleMouseEntered(MouseEvent e){
        System.out.println("najechalem i chuj");
      //  System.out.println(karta1.getProperties().toString());
      
        Image img = new Image("file:src//main//resources//deskCard//png//terra5.png");
        preview.setImage(img);
        preview.setPreserveRatio(true);
        
    }
    
    @FXML
    private void handleMouseExited(MouseEvent e){
        System.out.println("a teraz wylazlem i chuj");
        preview.setImage(null);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
