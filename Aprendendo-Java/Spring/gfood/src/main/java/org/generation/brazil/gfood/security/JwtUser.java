package org.generation.brazil.gfood.security;

import java.util.Collection;
import java.util.Date;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class JwtUser implements UserDetails {

  private final Long id;
  private final String userName;
  private final String firstName;
  private final String lastName;
  private final String password;
  private final String email;
  private final Collection<? extends GrantedAuthority> authorities;
  private final boolean enabled;
  private final Date lastPasswordResetDate;

}
