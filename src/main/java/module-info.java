module eu.bluefogdev.maskoverride {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;


    opens eu.bluefogdev.maskoverride to javafx.fxml;
    exports eu.bluefogdev.maskoverride;
}