package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class chatMessage extends Model {

    @Id
    @Constraints.Min(10)
    public Long id;

    
    @Constraints.Required
    public String sender;

    @Constraints.Required
    public String receiver;


    @Column(name = "message")
    public String message;



/*
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date dueDate = new Date();*/

    public static Finder<String, chatMessage> find = new Finder<String,chatMessage>(chatMessage.class);


}