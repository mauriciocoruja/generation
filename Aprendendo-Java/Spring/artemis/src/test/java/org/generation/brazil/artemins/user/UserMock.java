package org.generation.brazil.artemins.user;

import com.github.javafaker.Faker;

public class UserMock{
  public static User getUserMock(){
    User newUser = new User();
    Faker faker = new Faker();

    newUser.setNome(faker.name().firstName());
    newUser.setEmail(faker.internet().emailAddress());
    newUser.setLogin(faker.name().username());
    newUser.setSenha(faker.internet().password());

    return newUser;
  }

}
