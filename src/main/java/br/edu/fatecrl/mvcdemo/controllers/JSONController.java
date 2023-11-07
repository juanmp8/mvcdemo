package br.edu.fatecrl.mvcdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class JSONController {

    @GetMapping("/data")
    public Map<String, String> jsonData() {
        Map<String, String> data = new HashMap<>();
        data.put("message", "Isso é um exemplo de dados JSON.");
        return data;
    }
}