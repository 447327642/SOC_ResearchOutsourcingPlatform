package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class File extends Model {
/*
    @Id
    @Constraints.Min(10)
    public Long id;*/

    @Id
    @Constraints.Min(10)
    public Long id;

    @Constraints.Required
    public String sender;

    @Constraints.Required
    public String receiver;

    @Constraints.Required
    public String fileName;

    //public boolean done;

/*
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date dueDate = new Date();*/

    public static Finder<String, File> find = new Finder<String,File>(File.class);


}