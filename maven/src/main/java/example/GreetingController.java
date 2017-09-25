package example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by john on 2017/9/25.
 */
@Controller
public class GreetingController {
    @RequestMapping("/greeting")
    public String greeting(){
        return "greeting";
    }
}
