package com.orkun.exception;

import lombok.Getter;

@Getter
public class EduProException extends RuntimeException {
    private final ErrorType errorType;
    public EduProException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }
    public EduProException(ErrorType errorType, String errorMesseage){
        super(errorMesseage);
        this.errorType=errorType;

    }

}
