/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearcher.gui.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import wordsearcher.bll.WordManager;
import wordsearcher.gui.model.WordModel;

/**
 *
 * @author pgn
 */
public class MainController implements Initializable {

    @FXML
    private ListView lstWords;

    @FXML
    private TextField txtQuery;

    /**
     * The word model (Part of the MVC pattern. Resides in the GUI layer.
     */
    private WordModel model;
    
    /**
     * The manager of words. Resides in the logic layer. Performs logical operations.
     */
    private WordManager wordManager;

    /**
     * Constructs the Controller. 
     */
    public MainController() {
        model = new WordModel();
        wordManager = new WordManager();
    }

    /**
     * Performs a word search.
     * @param event 
     */
    @FXML
    void handleSearch(ActionEvent event) 
    {
        String query = txtQuery.getText().trim();
        List<String> searchResult = wordManager.beginSearch(query);
        model.setWords(searchResult);
    }

    /**
     * Initializes the controller to the default setting.
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        //Databinding:
        lstWords.setItems(model.getWords());
        try 
        {
            List<String> allWords = wordManager.getAllWords();
            model.setWords(allWords);
        } catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
    }

}