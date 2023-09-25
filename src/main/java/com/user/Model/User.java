package com.user.Model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
//    @Id
    @NotNull
    private Integer userId;
    @NotEmpty
    private String userAdd;
    @NotBlank
    private String userName;
    @Email(message = "Invalid Email id format (user@example.com) !!")
    private String userEmail;
    @Pattern(regexp = "^(\\+?\\d{1,4}[-\\s]?)?\\d{10}$", message = "Invalid phone number !!")
    @Size(min = 10,max = 12,message = "Enter complete Number !!")
    private String userContact;
//    @Past(message = "invalid DOB !! ")
//    @Pattern(regexp = "^(\\d{2}-\\d{2}-\\d{4})$")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate userDOB;


}
