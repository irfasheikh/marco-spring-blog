package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @GetMapping( "/add/{number}/and/{number2}")
    @ResponseBody

    public String add(@PathVariable int number , int number2) {
        return number + " plus " + number2 + " is equal to " + (number + number2);
    }

    @GetMapping("/subtract/{number}/and/{number2}")
    @ResponseBody

    public String subtract(@PathVariable int number, int number2) {
        return number + "minus" + number2 + " is equals to " + (number2 - number);
    }

    @GetMapping ("/multiply/{number}/and/{number2}")
    @ResponseBody

    public String multiply(@PathVariable int number, int number2) {
        return number  + "multiplied by" + number2 + " is equal to " + (number * number2);
    }

    @GetMapping("/divide/{number}/{number2}")
    @ResponseBody

    public String divide(@PathVariable int number, int number2) {
        return number + "divided by" + number2 + " is equal to " + (number/number2);
    }

    
}
