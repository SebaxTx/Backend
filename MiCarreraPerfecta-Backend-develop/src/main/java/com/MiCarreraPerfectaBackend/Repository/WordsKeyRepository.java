package com.MiCarreraPerfectaBackend.Repository;

import com.MiCarreraPerfectaBackend.Entity.WordsKey;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cabrera
 */
@Repository
public interface WordsKeyRepository extends JpaRepository <WordsKey, Integer>{
    
    @Query("SELECT wk FROM WordsKey wk")
    List<WordsKey> findAllWordsKey();
    
    @Query("SELECT wk FROM WordsKey wk WHERE wk.word LIKE %:word%")
    List<WordsKey> findWordKeyByName(@Param ("word") String word);
    
    @Query("SELECT wk FROM WordsKey wk WHERE wk.id_word_key = :id_word_key")
    WordsKey findWordKeyById(@Param ("id_word_key") int id_branch);
    
}