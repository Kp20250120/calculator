package com.maths.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";  // This refers to welcome.html in the templates folder (Thymeleaf)
    }
}
