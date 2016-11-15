/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearcher.gui.model;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author pgn
 */
public class WordModel {

    /**
     * The observable list, used for data binding the view to the model.
     */
    private final ObservableList<String> items;

    public WordModel() 
    {
        items = FXCollections.observableArrayList();
    }

    /**
     * Gets the observable list of words.
     * @return 
     */
    public ObservableList<String> getWords() {
        return items;
    }

    /**
     * Updates the word model to hold a new list of words.
     * @param words 
     */
    public void setWords(List<String> words)
    {
        items.clear();
        items.addAll(words);
        
    }
    
}