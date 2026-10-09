module com.biblioteca.tallerpatronesestructurales {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.biblioteca.tallerpatronesestructurales to javafx.fxml;
    exports com.biblioteca.tallerpatronesestructurales;
}