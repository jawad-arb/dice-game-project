package com.arbahi.dicegameproject.user;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String login;
    private String password;
    private String bestScore;
}
