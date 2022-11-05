package com.omoluabi.hngtasktwo.controller;

import com.omoluabi.hngtasktwo.model.RequestStructure;
import com.omoluabi.hngtasktwo.model.ResponseStructure;
import com.omoluabi.hngtasktwo.service.ArithmeticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HngController {

    @Autowired
    private ArithmeticService arithmeticService;

    @PostMapping("/arithmetic")
    public ResponseStructure arithmeticOperation(@RequestBody RequestStructure requestStructure) {
        return arithmeticService.performOperation(requestStructure);
    }
}
