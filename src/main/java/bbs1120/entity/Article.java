package bbs1120.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;

}
