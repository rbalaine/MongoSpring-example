package com.samplespring.service;

import com.samplespring.dao.UserDao;
import com.samplespring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alexandre on 10/6/14.
 */
/* Ce service est managé par Spring */
@Service
public class UserService {

  /* Spring me permet d'injecter ce DAO dans mon service */
  @Autowired
  UserDao userDao;

  public List<User> readAll(){
	  userDao.init();
    return userDao.readAll();
  }

}
