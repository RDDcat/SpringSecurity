package maro.study.SpringSecurity.account;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String username;
    private String password;
    private String role;

}
