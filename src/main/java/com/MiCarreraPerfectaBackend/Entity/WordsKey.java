package com.MiCarreraPerfectaBackend.Entity;

import jakarta.persistence.*;

/**
 *
 * @author Cabrera
 */
@Entity
@Table(name = "words_key")
public class WordsKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id_word_key;
    public String word;

    public WordsKey() {

    }

    public WordsKey(int id_word_key, String word) {
        this.id_word_key = id_word_key;
        this.word = word;
    }

    public int getId_word_key() {
        return id_word_key;
    }

    public void setId_word_key(int id_word_key) {
        this.id_word_key = id_word_key;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}