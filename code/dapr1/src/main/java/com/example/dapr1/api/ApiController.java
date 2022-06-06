package com.example.dapr1.api;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class ApiController {

    @Value("${dapr2.url}")
    private String dapr2Url;

    @GetMapping(path = "/api/value")
    public String getValue(@RequestParam(required = false, defaultValue = "") String command) {
        return "Dapr1: " + askDapr2(command);
    }

    private String askDapr2(String payload) {
        RestTemplate rest = new RestTemplate();

        var params = Collections.singletonMap("command", payload);
        var respEntity = rest.exchange(dapr2Url + "/api/value?command={command}", HttpMethod.GET, null, String.class, params);

        return respEntity.getBody();
    }
}