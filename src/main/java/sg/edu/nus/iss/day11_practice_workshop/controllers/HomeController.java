package sg.edu.nus.iss.day11_practice_workshop.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class HomeController {
    
    @GetMapping
    public String index() {
        
        return "index";
    }


    @PostMapping("/result")
    public String result(@RequestParam(name="inputNum", defaultValue ="1") Integer unit, Model model) {

        List<Integer> lstInt = new ArrayList<>(); 
        Random rand = new Random();

        Integer loopValue = unit;
        Integer currVal = 1; 

        while(currVal < loopValue) {
            Integer number = rand.nextInt(30);
            if(!lstInt.contains(number)) {
                lstInt.add(number);
            }
            currVal++;
        }
        model.addAttribute("numbers", lstInt);
        return "result";
    }
}
