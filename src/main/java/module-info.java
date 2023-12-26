module com.oseias.examcorrection {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oseias.examcorrection.controller to javafx.fxml;
    exports com.oseias.examcorrection;
}