package com.samplespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexandre on 10/6/14.
 */
@Controller
@RequestMapping("/")
public class WelcomeController {

  @RequestMapping
  public String printWelcome(ModelMap model) {
    return "hello";
  }

}
