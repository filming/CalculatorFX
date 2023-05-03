module me.filming.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;


    opens me.filming.calculatorfx to javafx.fxml;
    exports me.filming.calculatorfx;
}