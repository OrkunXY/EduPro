package com.orkun.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    private ErrorMesseage createErrorMessage(ErrorType errorType, Exception exception){
        System.out.println("hata mesajini burada yaninlayabilirsin");
        return ErrorMesseage.builder()
                .code(errorType.getCode())
                .message(errorType.getMessage())
                .build();
    }

    @ExceptionHandler(EduProException.class)
    @ResponseBody
    public ResponseEntity<ErrorMesseage> handlerJava7MonoExceptiron(EduProException exception){
        System.out.println("java7monoexception hatasi....:"+exception.toString());
        return new ResponseEntity(createErrorMessage(exception.getErrorType(),exception), exception.getErrorType().getHttpStatus());
    }



        @ExceptionHandler(ArithmeticException.class)
        @ResponseBody
        public ResponseEntity<String> handleArithmeticException(ArithmeticException exception){
        System.out.println("aritmatik sistem hatasi..."+ exception.toString());
        return ResponseEntity.ok("sifira bolemezsin");
        }

        @ExceptionHandler(HttpMessageNotReadableException.class)
        @ResponseBody
        public ResponseEntity<ErrorMesseage> handleHttpMessageNotReadableExceptionException(HttpMessageNotReadableException exception){
            ErrorType errorType=ErrorType.BAD_REQUEST;
            return new ResponseEntity<>(createErrorMessage(errorType,exception),errorType.getHttpStatus());
        }

        @ExceptionHandler (Exception.class)
        @ResponseBody
        public ResponseEntity<String> handleException(Exception exception){
        ErrorType errorType=ErrorType.ERROR;
        return ResponseEntity.badRequest().body("ismail bir hata turuttu");
        }


}

