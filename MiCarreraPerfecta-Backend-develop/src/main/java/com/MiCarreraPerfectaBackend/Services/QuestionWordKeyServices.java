package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.QuestionWordKey;
import java.util.List;

/**
 *
 * @author Quercetti
 */
public interface QuestionWordKeyServices {
    
    public List<QuestionWordKey>getAllQuestionWordKey();
    public QuestionWordKey getQuestionWordKeyById(int id_question_word_key);
    public List<QuestionWordKey> getQuestionById(int id_question);
    public List<QuestionWordKey> getWordKeyById(int id_word_key);
    
}    