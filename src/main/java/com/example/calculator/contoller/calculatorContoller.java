package com.example.calculator.contoller;


import com.example.calculator.service.calculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculatorContoller {
    @Autowired
    private calculatorService calculator;

    @RequestMapping("/sum")
    public String sum(@RequestParam("a") Integer a,
                      @RequestParam("b") Integer b) {
        return String.valueOf(calculator.sum(a, b));
    }
}
