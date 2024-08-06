package com.volo.matchat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatChatController {

    @Autowired
    private MatchatAIService matchatAIService;

    @PostMapping("/chat")
    public String chat(
            @RequestBody String userInput){
        return matchatAIService.chat(userInput);
    }
}
