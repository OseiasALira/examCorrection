package com.oseias.examcorrection.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MainViewController {

    @FXML
    private Button addAnwserStudentButton;

    @FXML
    private Button addExamButton;

    @FXML
    private Button addStudentButton;

    @FXML
    private TableColumn<?, ?> firstColumnTableOverView;

    @FXML
    private VBox menuLeftSide;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableView<?> tableOverView;

}
