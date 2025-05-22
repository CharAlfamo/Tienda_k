package com.tienda;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index"; // Esto carga src/main/resources/templates/index.html
    }

    @GetMapping("/multimedia")
    public String multimedia() {
        return "multimedia";
    }

    @GetMapping("/ejemplo2")
    public String ejemplo2() {
        return "ejemplo2";
    }

    @GetMapping("/iframes")
    public String iframes() {
        return "iframes";
    }
}
