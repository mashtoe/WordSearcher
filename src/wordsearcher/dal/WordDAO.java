/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearcher.dal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pgn
 */
public class WordDAO 
{
    private static final String wordFileName = "brit-a-z.txt";

    /**
     * Gets all words from the brit a-z text file.
     * @return List of all words.
     */
    public List<String> getAllWords() throws FileNotFoundException 
    {
        
        ArrayList<String> words = new ArrayList<>();

        //1 get a hold of the file !
        File wordFile = new File(wordFileName);
        FileReader fr = new FileReader(wordFile);
        BufferedReader br = new BufferedReader(fr);
        Scanner scan = new Scanner(br);
        
        
        while(scan.hasNextLine())
        {
            String word = scan.nextLine();
            words.add(word);
        }
        
        
        scan.close();
        return words;
    }
    
    
    
    
    
}
