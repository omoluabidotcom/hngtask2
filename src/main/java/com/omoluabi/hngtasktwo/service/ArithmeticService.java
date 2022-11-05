package com.omoluabi.hngtasktwo.service;

import com.omoluabi.hngtasktwo.model.ArithmeticOperationType;
import com.omoluabi.hngtasktwo.model.RequestStructure;
import com.omoluabi.hngtasktwo.model.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {

    public ResponseStructure responseStructure = new ResponseStructure();

    public ResponseStructure performOperation(RequestStructure requestStructureParam) {

        ArithmeticOperationType operationType = null;
        Integer x = null;
        Integer y = null;

        if(requestStructureParam.getX() != null
                && requestStructureParam.getY() != null
                && requestStructureParam.getOperation_type() != null) {

            x = requestStructureParam.getX();
            y = requestStructureParam.getY();
            operationType =  ArithmeticOperationType.valueOf(requestStructureParam.getOperation_type().toUpperCase());

        } else {
            throw new IllegalArgumentException("Illegal Argument in payload");
        }

        Integer result;

        if(operationType == ArithmeticOperationType.ADDITION) {
            result = x+y;

            responseStructure.setSlackUsername("Omolluabii");
            responseStructure.setOperation_type("ADDITION");
            responseStructure.setResult(result);

            return responseStructure;
        }

        if(operationType == ArithmeticOperationType.SUBTRACTION) {
            result = x-y;

            responseStructure.setSlackUsername("Omolluabii");
            responseStructure.setOperation_type("SUBTRACTION");
            responseStructure.setResult(result);

            return responseStructure;
        }

        if(operationType == ArithmeticOperationType.MULTIPLICATION) {
            result = x*y;

            responseStructure.setSlackUsername("omolluabii");
            responseStructure.setOperation_type("MULTIPLICATION");
            responseStructure.setResult(result);

            return responseStructure;
        }

        return responseStructure;
    }

}
