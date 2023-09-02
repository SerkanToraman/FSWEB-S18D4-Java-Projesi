package com.s22g4.jpaadv.project.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class GeneralException extends RuntimeException{
    private HttpStatus status;
    public GeneralException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
