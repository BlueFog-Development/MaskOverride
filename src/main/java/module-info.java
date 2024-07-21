module eu.bluefogdev.maskoverride {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.prefs;
    requires java.logging;

    opens eu.bluefogdev.maskoverride to javafx.fxml;
    exports eu.bluefogdev.maskoverride;
}