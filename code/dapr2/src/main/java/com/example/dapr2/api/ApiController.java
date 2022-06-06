package com.example.dapr2.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ApiController {
    
    @GetMapping(path = "/api/value")
    public String doCommand(@RequestParam(required = false, defaultValue = "") String command) {

        if ("throw".equals(command)) {
            throw new Error("Throwing as requested");
        }

        if ("wait".equals(command)) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return "Dapr2: c - " + command;
    }
}
