package org.personal.dto;

import lombok.Getter;
import lombok.Setter;
import org.personal.model.User;

public class UserDTO {
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

    public UserDTO(){}

    public UserDTO(Long id, String firstName, String lastName, Boolean enabled, String username, String emailAddress){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.enabled = enabled;
        this.username = username;
    }

    public static User toEntity(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getId());
        user.setLastName(userDTO.getLastName());
        user.setFirstName(userDTO.getFirstName());
        user.setEnabled(userDTO.getEnabled());
        user.setEmailAddress(userDTO.getEmailAddress());

        return user;
    }
}
