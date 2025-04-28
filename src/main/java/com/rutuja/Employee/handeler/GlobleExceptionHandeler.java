package com.rutuja.Employee.handeler;

import com.rutuja.Employee.exception.ServiceException;
import com.rutuja.Employee.exception.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobleExceptionHandeler {

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<String> handleException(ServiceException ex) {

        return ResponseEntity.status(500)
                .body("An error occurred: " + ex.getErrorMessage().getErrMsg()+ " | Error Code: "+ex.getErrorMessage().getErrCode());

    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String> handleExceptionvalidate(ValidationException ex) {

        return ResponseEntity.status(500)
                .body("An error occurred: " + ex.getErrorList());

    }

}
