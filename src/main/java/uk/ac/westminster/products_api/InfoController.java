package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;

public class InfoController {
    @GetMapping("/info")
    public String info(){
        return "something an app";
    }

}
