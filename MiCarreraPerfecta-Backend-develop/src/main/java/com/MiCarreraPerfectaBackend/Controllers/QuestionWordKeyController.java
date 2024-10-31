package com.MiCarreraPerfectaBackend.Controllers;

import com.MiCarreraPerfectaBackend.Config.WebApiResponse;
import com.MiCarreraPerfectaBackend.Services.QuestionWordKeyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Quercetti
 */
@RestController
@RequestMapping("/questionwordkey")
public class QuestionWordKeyController {
    
    @Autowired
    QuestionWordKeyServices  questionWordKeyServices;
    
    @GetMapping
    public WebApiResponse getAllQuestionWordKey(){
        return WebApiResponse.newResponse(-1, "Status: ", questionWordKeyServices.getAllQuestionWordKey());
    }
    
    @GetMapping("/{id}")
    public WebApiResponse getQuestionWordKeyById(@PathVariable int id){
        return WebApiResponse.newResponse(-1, "Status: ", questionWordKeyServices.getQuestionWordKeyById(id));
    }
    
     @GetMapping("/question/{id}")
    public WebApiResponse responseQuestionById(@PathVariable int id){
        return WebApiResponse.newResponse(-1, "Status: ", questionWordKeyServices.getQuestionById(id));
    }
    
     @GetMapping("/wordkey/{id}")
    public WebApiResponse responseWordKeyById(@PathVariable int id){
        return WebApiResponse.newResponse(-1, "Status: ", questionWordKeyServices.getWordKeyById(id));
    }
    
}