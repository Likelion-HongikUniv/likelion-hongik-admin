package Likelion.Recruiting.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import javax.persistence.Id;

@Entity
// @Entity(name="Member") 이렇게하면 JPA에서는 User를 Member 라는 이름으로 사용가능
@Getter @Setter
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String name;

    private String email;

    private String picture;

    private String role;

    private String username;



}