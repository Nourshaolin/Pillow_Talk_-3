package pillow.system.database;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long userId;
    @Column(nullable = false)
    private String name;
    private Boolean status;

    private String password;


    public User(long userId, String name,Boolean status,String password) {
        this.userId = userId;
        this.name = name;
        this.status=status;
        this.password=password;
    }

    public long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){this.name=name;}

}
