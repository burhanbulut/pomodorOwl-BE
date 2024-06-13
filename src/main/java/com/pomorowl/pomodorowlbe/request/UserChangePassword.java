package com.pomorowl.pomodorowlbe.request;

import lombok.Data;

@Data
public class UserChangePassword {
    String username;
    String password;
    String newPassword;
}
