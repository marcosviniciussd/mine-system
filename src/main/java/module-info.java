module com.project.minesystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.minesystem to javafx.fxml;
    exports com.project.minesystem;
}