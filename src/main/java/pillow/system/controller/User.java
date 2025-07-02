package pillow.system.controller;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long userId;

    @Column(nullable = false)
    private String name;


    public long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public User(long userId, String name) {
        this.userId = userId;
        this.name = name;
    }


}
