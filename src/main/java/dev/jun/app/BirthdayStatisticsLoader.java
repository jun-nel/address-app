package dev.jun.app;

import java.io.IOException;

import dev.jun.App;
import dev.jun.core.loader.Loader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BirthdayStatisticsLoader extends Loader {

    public BirthdayStatisticsLoader(App app) {
        super("BIRTHDAY_STATISTICS", app);
    }

    @Override
    public void load() {
        try {
            StackPane root = loader.load();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(
                    getClass().getResource("/dev/jun/assets/theme/SKIN.CSS")
                            .toExternalForm());

            BirthdayStatisticsController controller = loader.getController();
            controller.load(app);

            Stage statisticsStage = new Stage();
            statisticsStage.setTitle("Address App - Birthday Statistics");
            statisticsStage.getIcons()
                    .add(new Image(
                            getClass().getResource("/dev/jun/assets/img/favicon.png")
                                    .toExternalForm()));
            statisticsStage.initOwner(app.getApplicationStage());
            statisticsStage.initModality(Modality.APPLICATION_MODAL);
            statisticsStage.setResizable(false);
            statisticsStage.setScene(scene);
            statisticsStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
