package com.taehwan.heroku.msa.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
* 1. DispatchServlet: Autoconfiguration --> Mapping Servlet
* 2. JacksonHttpMessageConverters: Autoconfiguration --> Converting Class -> JSON
* 3. Error Page: ErrorMvcAutoConfiguration
* 4. Jar files: Starter Projects(Spring Web)
* */


// REST API
@RestController
public class HelloWorldController {

  private final String pathHome = "/hello-world";
  private final String pathBean = "/hello-world-bean";
  private final String pathVar = pathHome + "/path-variable/{name}";

  /*
  "/hello-world"
  return "Hello World"
  */
//  @RequestMapping(method = RequestMethod.GET, path = pathHome)
  @GetMapping(pathHome)
  public String helloWorld() {
    return "Hello World";
  }

  @GetMapping(pathBean)
  public HelloWorldBean helloWorldBean(){
    return new HelloWorldBean("Hello World");
  }

  @GetMapping(pathVar)
  public HelloWorldBean helloWorldPathVariable(
      @PathVariable String name
  ){
    return new HelloWorldBean(String.format("Hello World To %s", name));
  }

}
