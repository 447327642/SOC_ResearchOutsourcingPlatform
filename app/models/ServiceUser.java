package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class ServiceUser extends Model {
/*
    @Id
    @Constraints.Min(10)
    public Long id;*/

    @Id
    @Constraints.Required
    public String username;

    @Column(name = "keywords")
    public String keywords;
    @Column(name = "email")
    public String email;

    public static Finder<String, ServiceUser> find = new Finder<String,ServiceUser>(ServiceUser.class);

}