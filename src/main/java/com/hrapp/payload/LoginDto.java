package com.hrapp.payload;

import lombok.Data;

@Data
public class LoginDto {
    private String email;
    private String password;
}
