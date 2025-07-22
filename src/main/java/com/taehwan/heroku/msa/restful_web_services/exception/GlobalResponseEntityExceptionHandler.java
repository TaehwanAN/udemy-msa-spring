package com.taehwan.heroku.msa.restful_web_services.exception;

import com.taehwan.heroku.msa.restful_web_services.user.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
  
  @ExceptionHandler(UserNotFoundException.class)
  protected ResponseEntity<ExceptionDetail> handleUserNotFoundException(Exception ex, WebRequest req){
    ExceptionDetail exceptionDetail = new ExceptionDetail(
        LocalDateTime.now(), ex.getMessage(), req.getDescription(true)
    );
    return new ResponseEntity<ExceptionDetail>(exceptionDetail, HttpStatus.NOT_FOUND);
  }
}
