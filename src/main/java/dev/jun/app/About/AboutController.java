package dev.jun.app.About;

import dev.jun.core.controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class AboutController extends Controller {

    @FXML
    private Label aboutus;
    @FXML
    private ImageView logo;
    @FXML
    private  Label author;
    @FXML
    private Label name;
    @FXML
    private Label address;
    
    @FXML
    private TextArea text2;
    @FXML
    private Label contactus;
    @FXML
    private Label email;
    @FXML
    private Label cellnum;

    @Override
    protected void load_fields() {
      
    }

    @Override
    protected void load_bindings() {
      
    }

    @Override
    protected void load_listeners() {
        logo.setImage(new Image(getClass()
                                .getResource("/dev/jun/assets/img/hgj.png").toExternalForm()));

      
    }
    
}
