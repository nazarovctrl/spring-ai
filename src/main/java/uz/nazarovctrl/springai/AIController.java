package uz.nazarovctrl.springai;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AIController {
    @Autowired
    private ChatClient chatClient;

    @GetMapping("/chat/{message}")
    public String chat(@PathVariable String message) {
        return chatClient.generate(message);
    }
}