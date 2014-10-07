package com.samplespring.dao;

import com.mongodb.MongoClient;
import com.samplespring.model.User;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandre on 10/6/14.
 */
/* Ce DAO est managé par Spring, c'est un singleton */
@Repository
public class UserDao {

    public static final String DB_NAME = "test";
    public static final String MONGO_HOST = "localhost";
    public static final int MONGO_PORT = 27017;

  /*
    Création en dure d'une liste d'utilisateurs
    Cette liste simule une base de donnée quelconque
    Initialisée avec les valeures suivantes
  */
    public void init(){
    	try {
            MongoClient mongo = new MongoClient(
                    MONGO_HOST, MONGO_PORT);
            MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
            User u = new User("113", "PankajKr", "Bangalore, India");
            mongoOps.insert(u);
        	Query searchUserQuery = new Query(Criteria.where("lastname").is("PankajKr"));

        	User savedUser = mongoOps.findOne(searchUserQuery, User.class);

 
            System.out.println(savedUser.getLastname());
            mongo.close();
             
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
  List<User> users = new ArrayList<>();
  {
    users.add(new User("John","Doe","123456789"));
    users.add(new User("Alex","Alex","123456789"));
  }

  /* CRUD Repository Operations: */
  /* CREATE */
  public void create(User user){
    users.add(user);
  }

  /* READ */
  public List<User> readAll(){
    return users;
  }

  /* UPDATE */
  public User update(int index, User user){
    users.remove(index);
    users.add(index, user);
    return users.get(index);
  }

  /* DELETE */
  public void delete(int index){
    users.remove(index);
  }

}
