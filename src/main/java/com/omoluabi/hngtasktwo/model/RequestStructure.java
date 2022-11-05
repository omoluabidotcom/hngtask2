package com.omoluabi.hngtasktwo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestStructure {

    String operation_type;
    Integer x;
    Integer y;
}
