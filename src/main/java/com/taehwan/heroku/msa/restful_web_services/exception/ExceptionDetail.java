package com.taehwan.heroku.msa.restful_web_services.exception;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ExceptionDetail {
  private LocalDateTime datetime;
  private String message;
  private String detail;
  
  public ExceptionDetail(LocalDateTime datetime, String detail, String message) {
    super();
    this.datetime = datetime;
    this.detail = detail;
    this.message = message;
  }
}
