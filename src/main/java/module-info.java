module jun.addressapp {
    requires transitive javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;

    requires jakarta.xml.bind;

    requires java.prefs;

    requires net.datafaker;

    opens dev.jun.app to javafx.fxml;
    opens dev.jun.app.overview to javafx.fxml;
    opens dev.jun.app.overview.form to javafx.fxml;
    opens dev.jun.models.person to jakarta.xml.bind;
    opens dev.jun.app.About to javafx.fxml;

    exports dev.jun;
    exports dev.jun.models.person;
    exports dev.jun.libs.xml.adapter;
    exports dev.jun.app.About;
}
