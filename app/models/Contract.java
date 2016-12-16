package models;

import javax.persistence.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.ConcurrencyMode;
import play.data.validation.*;

/**
 * Created by Fengnan on 12/5/16.
 */
@Entity
public class Contract extends Model {
    @Id
    @Constraints.Required
    public String project;

    @Column(name = "provider")
    public String provider;
    @Column(name = "user")
    public String user;
    @Column(name = "content")
    public String content;

    public static Finder<String, Contract> find = new Finder<String,Contract>(Contract.class);
}
