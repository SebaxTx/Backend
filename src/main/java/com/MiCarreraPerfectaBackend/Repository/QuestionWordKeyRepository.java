package com.MiCarreraPerfectaBackend.Repository;

import com.MiCarreraPerfectaBackend.Entity.QuestionWordKey;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Quercetti
 */
@Repository
public interface QuestionWordKeyRepository extends JpaRepository<QuestionWordKey,Integer>{
    
    @Query ("SELECT qwk FROM QuestionWordKey qwk")
    List<QuestionWordKey>findAllQuestionWordKey();
    
    @Query ("SELECT qwk FROM QuestionWordKey qwk WHERE qwk.id_question_word_key = :id_question_word_key")
    QuestionWordKey findQuestionWordKeyById(@Param("id_question_word_key")int id_question_word_key);
    
    @Query ("SELECT qwk FROM QuestionWordKey qwk WHERE qwk.id_question = :id_question")
    List<QuestionWordKey> findQuestionById(@Param("id_question")int id_question);
  
    @Query ("SELECT qwk FROM QuestionWordKey qwk WHERE qwk.id_word_key = :id_word_key")
    List<QuestionWordKey> findWordKeyById(@Param("id_word_key")int id_word_key);
    
}