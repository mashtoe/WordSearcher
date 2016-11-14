/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearcher.gui.model;

import java.io.FileNotFoundException;
import java.util.List;
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

    /**
     * 
     * @throws FileNotFoundException 
     */
    public void reset() throws FileNotFoundException {
        items.clear();
        items.addAll(wordMgr.getAllWords());
    }

    /**
     * Searches the wordbase for words beginning with the given query.
     *
     * @param query The string to search for
     */
    public void doSearch(String query) 
    {
        List<String> searchResult = wordMgr.beginSearch(query);
        items.clear();
        items.addAll(searchResult);
    }
}
