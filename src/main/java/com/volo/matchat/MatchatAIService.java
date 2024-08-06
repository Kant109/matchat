package com.volo.matchat;


import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
interface MatchatAIService {

    @SystemMessage("You are a french assistant")
    String chat(String userInput);

}
