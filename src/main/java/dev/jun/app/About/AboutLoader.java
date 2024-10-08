package dev.jun.app.About;

import java.io.IOException;


import dev.jun.App;

import dev.jun.core.loader.Loader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AboutLoader extends Loader {

    public AboutLoader( App app) {
        super( "About/ABOUT_US",app);
    }

    @Override
    public void load() {
         try {
            StackPane root = loader.load();
            Scene scene = new Scene(root);
            // scene.getStylesheets().add(
            //         getClass().getResource("/dev/jun/assets/theme/SKIN.CSS")
            //                 .toExternalForm());

            AboutController controller = loader.getController();
            controller.load(app);

            Stage AboutStage = new Stage();
            AboutStage.setTitle("Address App - Birthday Statistics");
            AboutStage.getIcons()
                    .add(new Image(
                            getClass().getResource("/dev/jun/assets/img/favicon.png")
                                    .toExternalForm()));
           AboutStage.initOwner(app.getApplicationStage());
           AboutStage.initModality(Modality.APPLICATION_MODAL);
           AboutStage.setResizable(false);
           AboutStage.setScene(scene);
           AboutStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

        
    
    

