package br.com.danielmonteiro.feedbacksistem.modules.user;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserEntity {

    private UUID id;

    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9_.]{2,19}$", message = "Username inválido")
    private String username;

    @Email(message = "Insira um e-mail válido")
    private String email;

    @Length(min = 10, max = 20)
    private String password;
    private String description;

}
