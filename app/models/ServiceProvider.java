package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class ServiceProvider extends Model {
/*
    @Id
    @Constraints.Min(10)
    public Long id;*/

    @Id
    @Constraints.Required
    public String username;

    @Column(name = "credential")
    public String credential;


    @Column(name = "researchAreas")
    public String researchAreas;

    @Column(name = "publications")
    public String publications;

    @Column(name = "professionalServices")
    public String professionalServices;
    //public boolean done;
    @Column(name= "keyword")
    public String keyword;
    @Column(name = "email")
    public String email;
    @Column(name = "university")
    public String university;


/*
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date dueDate = new Date();*/

    public static Finder<String, ServiceProvider> find = new Finder<String,ServiceProvider>(ServiceProvider.class);


}