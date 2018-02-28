package io.javabrains.springbootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Master
 */
@RestController
public class HelloController {
    
    @RequestMapping(method = RequestMethod.GET , value = "/hello")
    public String sayHi(){
        return "Hi";
    }
}
