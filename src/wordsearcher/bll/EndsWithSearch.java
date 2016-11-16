/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearcher.bll;

/**
 *
 * @author Bruger
 */
public class EndsWithSearch implements IwordComparer
{
    private final String query;

    public EndsWithSearch(String query) 
    {
        this.query = query;
    }
    
    @Override
    public boolean compare(String word) 
    {
        return word.endsWith(query);
    }
}
