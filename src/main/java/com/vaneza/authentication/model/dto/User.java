package com.vaneza.authentication.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
  private Long idUser;
  private String username;
  private String password;
  private String name;
  private String lastname;
  private String dni;
  private Boolean actualRegistered;
  private List<Role> roles;
}
