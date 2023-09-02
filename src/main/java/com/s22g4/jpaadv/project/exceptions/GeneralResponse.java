package com.s22g4.jpaadv.project.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeneralResponse {
    private int status;
    private String message;
    private long timestamp;
}

