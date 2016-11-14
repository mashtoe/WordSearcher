/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearcher.gui.model;

import java.io.FileNotFoundException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import wordsearcher.bll.WordManager;

/**
 *
 * @author pgn
 */
public class WordModel {

    private final ObservableList<String> items;

    private WordManager wordMgr;
    
    public WordModel() {
        items = FXCollections.observableArrayList();
        wordMgr = new WordManager();
    }

    public ObservableList<String> getWords() {
        return items;
    }

    public void reset() throws FileNotFoundException 
    {
        items.clear();
        items.addAll(wordMgr.getAllWords());
    }
}
