package bo.ucb.ingsoft.practica1;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="actor")
public class Actor {
   
    @Id
    @Column(name="actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer actor_id;
    
    @Column(name="first_name")
    private String firstname;

    @Column(name="last_name")
    private String last_name;

    @Column(name="last_update")
    private Date last_update;

    public Actor(){
    }

    public Integer getActorId (){
        return actor_id;
    }
    public void setActorId(Integer actor_id) {
        this.actor_id = actor_id;
    }
    public String getFirstName(){
        return firstname;
    }
    public void setFirstName(String firstname){
        this.firstname=firstname;
    }
    public String getLastName(){
        return last_name;
    }
    public void setLastName(String last_name){
        this.last_name=last_name;
    }
}

