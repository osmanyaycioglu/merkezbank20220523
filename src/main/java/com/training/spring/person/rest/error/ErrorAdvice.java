package com.training.spring.person.rest.error;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ErrorAdvice {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handleException(IllegalArgumentException exception){
        ErrorObj errorObj = new ErrorObj();
        errorObj.setDesc("Arguman doğru değil : " + exception.getMessage());
        errorObj.setErrorCode(10032);
        return errorObj;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handleException(MethodArgumentNotValidException exception){
        List<ErrorObj> errorObjs = new ArrayList<>();
        ErrorObj errorObj = new ErrorObj();
        errorObj.setDesc("Validasyon problemi.");
        errorObj.setErrorCode(10042);
        errorObj.setSubErrors(errorObjs);
        List<ObjectError> allErrors = exception.getAllErrors();
        for (ObjectError oe:allErrors) {
            ErrorObj subErrorObj = new ErrorObj();
            subErrorObj.setDesc(oe.toString());
            subErrorObj.setErrorCode(10042);
            errorObjs.add(subErrorObj);
        }
        return errorObj;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorObj handleException(Exception exception){
        ErrorObj errorObj = new ErrorObj();
        errorObj.setDesc("Beklenilmedik error oluştu : " + exception.getMessage());
        errorObj.setErrorCode(15000);
        return errorObj;
    }

}
