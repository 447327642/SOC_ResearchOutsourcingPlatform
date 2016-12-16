package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class User extends Model {

    @Id
    @Constraints.Min(10)
    public Long id;

    
    @Constraints.Required
    public String name;

    @Constraints.Required
    public String password;

    @Column(name = "email")
    public String email;

    @Column(name = "secureQuestion")
    public String secureQuestion;

    @Column(name = "secureAnswer")
    public String secureAnswer;

    @Column(name = "anonymous")
    public String anonymous;

    //public boolean done;

/*
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date dueDate = new Date();*/

    public static Finder<String, User> find = new Finder<String,User>(User.class);


}