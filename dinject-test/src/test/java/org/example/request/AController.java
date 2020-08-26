package org.example.request;


import io.dinject.controller.Controller;
import io.javalin.http.Context;

import javax.inject.Inject;

@Controller
public class AController {

  @Inject
  AService service;

  @Inject
  Context context;

  public String get() {
    return "hi " + context.toString() + service.hi();
  }
}
