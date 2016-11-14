/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearcher.gui.controller;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import wordsearcher.gui.model.WordModel;

/**
 *
 * @author pgn
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ListView lstWords;

    private WordModel model;

    public FXMLDocumentController() {
        model = new WordModel();
    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        try 
        {
            lstWords.setItems(model.getWords());
            model.reset();
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
       
    }

}
