package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.WordsKey;
import com.MiCarreraPerfectaBackend.Repository.WordsKeyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cabrera
 */
@Service
public class WordsKeyServiceImpl implements WordsKeyService{
    
    @Autowired WordsKeyRepository wordsKeyRepository;

    @Override
    public List<WordsKey> getWordKeyByName(String name) {
        return wordsKeyRepository.findWordKeyByName(name);
    }

    @Override
    public WordsKey getWordKeyById(int id) {
        return wordsKeyRepository.findWordKeyById(id);
    }

    @Override
    public List<WordsKey> getAllWordsKey() {
        return wordsKeyRepository.findAllWordsKey(); 
    }
    
}