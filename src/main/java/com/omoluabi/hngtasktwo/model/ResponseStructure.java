package com.omoluabi.hngtasktwo.model;

import org.springframework.stereotype.Component;

@Component
public class ResponseStructure {

    String slackUsername;
    Integer result;
    String operation_type;

    public ResponseStructure() {}

    public ResponseStructure(String slackUsername, Integer result, String operation_type) {

        this.slackUsername = slackUsername;
        this.result = result;
        this.operation_type = operation_type;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public String getSlackUsername() {
        return slackUsername;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getResult() {
        return result;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }

    public String getOperation_type() {
        return operation_type;
    }

}
