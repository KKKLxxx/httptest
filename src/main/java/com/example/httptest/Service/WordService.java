package com.example.httptest.Service;

import com.example.httptest.Entity.Word;
import com.example.httptest.Repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class WordService
{
    @Autowired
    WordRepository wordRepository;

    public boolean addWord(String spelling, String explanation)
    {
        List<Word> words = wordRepository.findAll();
        for (Word word : words)
        {
            if (word.getSpelling().equals(spelling))
                return false;
        }

        Word word=new Word();
        word.setSpelling(spelling);
        word.setExplanation(explanation);
        wordRepository.save(word);
        return true;
    }

    public List<Word> showWords()
    {
        List<Word> wordList = wordRepository.findAll();
        return wordList;
    }

}
