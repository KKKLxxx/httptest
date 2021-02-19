package com.example.httptest.Controller;

import com.example.httptest.Entity.Word;
import com.example.httptest.Service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordController
{
    @Autowired
    WordService wordService;

    @PostMapping(value = "/addWord")
    public boolean addWord(@RequestParam("spelling") String spelling, @RequestParam("explanation") String explanation)
    {
        return wordService.addWord(spelling, explanation);
    }

    @RequestMapping(value = "/showWords",method = RequestMethod.GET)
    public List<Word> showWords()
    {
        return wordService.showWords();
    }
}
