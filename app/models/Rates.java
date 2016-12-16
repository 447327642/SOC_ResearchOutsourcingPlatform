package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Rates extends Model {

    @Constraints.Required
    public String project;
    @Constraints.Required
    public String user;

    @Constraints.Required
    public String provider;

    @Column(name = "projectrate")
    public int projectrate;

    @Column(name = "providerrate")
    public int providerrate;

    @Column(name = "comment")
    public String comment;

    //public boolean done;

/*
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date dueDate = new Date();*/

    public static Finder<Long, Rates> find = new Finder<Long,Rates>(Rates.class);


}