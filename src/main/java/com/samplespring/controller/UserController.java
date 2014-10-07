package com.samplespring.controller;

import com.samplespring.model.User;
import com.samplespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandre on 10/6/14.
 */
/* Création d'un controller managé par spring */
@Controller
@RequestMapping("/users")
public class UserController {

  /* Injection du userService depuis le contexte Spring */
  @Autowired
  UserService userService;

  @RequestMapping(method = RequestMethod.GET)
  public String printWelcome(ModelMap model) {
    List<User> users = new ArrayList<>();
    users = userService.readAll();
    model.addAttribute("users", users);
    return "user";
  }

}
