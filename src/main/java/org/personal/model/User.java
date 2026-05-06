package org.personal.model;


import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(schema = "user_account")
public class User {
    @Id
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private Boolean enabled;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String emailAddress;
}
