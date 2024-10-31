package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.WordsKey;
import java.util.List;

/**
 *
 * @author Cabrera
 */
public interface WordsKeyService {
    
    public List<WordsKey> getAllWordsKey();
    
    public WordsKey getWordKeyById(int id);
    
    public List<WordsKey> getWordKeyByName(String name);
    
}