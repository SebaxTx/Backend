package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.QuestionWordKey;
import com.MiCarreraPerfectaBackend.Repository.QuestionWordKeyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Quercetti
 */
@Service
public class QuestionWordKeyServicesImpl implements QuestionWordKeyServices {
    
    @Autowired
    QuestionWordKeyRepository questionWordKeyRepository;
    
    @Override
    public List<QuestionWordKey> getAllQuestionWordKey() {
       List <QuestionWordKey> question =  questionWordKeyRepository.findAllQuestionWordKey();
       return question;
    }


    @Override
    public List<QuestionWordKey> getQuestionById(int id_question) {
       return questionWordKeyRepository.findQuestionById(id_question);
    }

    @Override
    public QuestionWordKey getQuestionWordKeyById(int id_question_word_key) {
       return questionWordKeyRepository.findQuestionWordKeyById(id_question_word_key);
    }

    @Override
    public List<QuestionWordKey> getWordKeyById(int id_word_key) {
       return questionWordKeyRepository.findWordKeyById(id_word_key);
    }
    
}
