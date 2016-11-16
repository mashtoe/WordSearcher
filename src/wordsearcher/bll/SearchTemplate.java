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
public abstract class SearchTemplate implements IwordComparer
{
    protected final String query;
    protected final boolean caseSensetive;

    public SearchTemplate(String query, boolean caseSensetive) 
    {
        this.query = query;
        this.caseSensetive = caseSensetive;
    }
    
    
}