package br.com.danielmonteiro.feedbacksistem.modules.user;

import java.util.UUID;
import lombok.Data;

@Data
public class UserEntity {

    private UUID id;
    private String username;
    private String email;
    private String password;
    private String description;

}
