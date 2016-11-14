/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearcher.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import wordsearcher.gui.model.WordModel;

/**
 *
 * @author pgn
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ListView lstWords;

    @FXML
    private TextField txtQuery;

    private WordModel model;

    public FXMLDocumentController() {
        model = new WordModel();
    }

    /**
     * Performs a word search.
     * @param event 
     */
    @FXML
    void handleSearch(ActionEvent event) 
    {
        String query = txtQuery.getText();
        model.doSearch(query);
    }

    /**
     * Initializes the controller to the default setting.
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lstWords.setItems(model.getWords());
        try {
            model.reset();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
