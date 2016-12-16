package models;

import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.*;

@Entity
public class Bug extends Model {

    @Id
    @Constraints.Required
    public String bugname;

    @Column(name = "description")
    public String description;

    @Column(name = "status")
    public String status;

    public static Finder<String, Bug> find = new Finder<String,Bug>(Bug.class);


}