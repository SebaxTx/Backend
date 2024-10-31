package com.MiCarreraPerfectaBackend.Controllers;

import com.MiCarreraPerfectaBackend.Config.WebApiResponse;
import com.MiCarreraPerfectaBackend.Services.WordsKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Cabrera
 */
@RestController
@RequestMapping("/wordskey")
public class WordsKeyController {
    
    @Autowired
    private WordsKeyService wordsKeyService;
    
    @GetMapping
    public WebApiResponse getAllWordsKey(){
        return WebApiResponse.newResponse(-1, "Status: ", wordsKeyService.getAllWordsKey());
    }
    
    @GetMapping("/{id}")
    public WebApiResponse getWordKeyById(@PathVariable int id){ 
        return WebApiResponse.newResponse(-1, "Status: ", wordsKeyService.getWordKeyById(id));
    }
    
    @GetMapping("/name/{name}")
    public WebApiResponse getWordKeyByName(@PathVariable String name){
        return WebApiResponse.newResponse(-1, "Status: ", wordsKeyService.getWordKeyByName(name));
    }
    
}