package org.engine.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ActivatePasswordTokenDTO {

    // Request data

    @NotNull
    @NotEmpty
    @Size(min=254, max=255, message = "'Confirmation Token' value '${validatedValue}' must be between {min} and {max} characters long.")
    private String confirmationToken;

    // Server Response data

    @NotNull
    @NotEmpty
    @Size(min=3, max=10, message = "'Login' value '${validatedValue}' must be between {min} and {max} characters long.")
    private String login;

    private Integer status;

    private String error;

    private String errorDescription;
}
