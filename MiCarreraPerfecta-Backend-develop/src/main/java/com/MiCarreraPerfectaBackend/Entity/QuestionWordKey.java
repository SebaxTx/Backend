package com.MiCarreraPerfectaBackend.Entity;

import jakarta.persistence.*;

/**
 *
 * @author Quercetti
 */
@Entity
@Table(name = "question_word_key")
public class QuestionWordKey {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id_question_word_key;
    public int id_question;
    public int id_word_key;

    public QuestionWordKey() {
    }

    public QuestionWordKey(int id_question_word_key, int id_question, int id_word_key) {
        this.id_question_word_key = id_question_word_key;
        this.id_question = id_question;
        this.id_word_key = id_word_key;
    }

    public int getId_question_word_key() {
        return id_question_word_key;
    }

    public void setId_question_word_key(int id_question_word_key) {
        this.id_question_word_key = id_question_word_key;
    }

    public int getId_question() {
        return id_question;
    }

    public void setId_question(int id_question) {
        this.id_question = id_question;
    }

    public int getId_word_key() {
        return id_word_key;
    }

    public void setId_word_key(int id_word_key) {
        this.id_word_key = id_word_key;
    }
    
}
