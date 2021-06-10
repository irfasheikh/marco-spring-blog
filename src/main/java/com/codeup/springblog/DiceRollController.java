package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class DiceRollController {



    @GetMapping("/roll-dice")

    public String roll() {
        return "it's time to roll that dice!";
    }


    @GetMapping(path = "/roll-dice/{n}")
        public String randomRoll(
                @PathVariable int n,

    )


}
