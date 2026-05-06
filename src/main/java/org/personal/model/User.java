package org.personal.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("user_account")
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
