package org.generation.brazil.artemins.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;
import org.generation.brazil.artemins.ArtemisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArtemisApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @LocalServerPort
    private int port;

    /**
    * Monta a url para a chamada de teste da API
     * @param path - caminho da API
     * @return String
    * */

    private String getRootUrl(String path){
        return "http://localhost:" + port + "/api/v1" + path;
    }

/*    private String gerarNome(){
        String nome = RandomStringUtils.randomAlphabetic(10);
        return nome;
    }

    private String gerarEmail(){
        String email = RandomStringUtils.randomAlphabetic(5);
        return email+"@gmail.com";
    }

    private String gerarUsuario(){
        String usuario = RandomStringUtils.randomAlphabetic(5);
        return usuario;
    }
    private String gerarSenha(){
        String senha = RandomStringUtils.randomAlphanumeric(5);
        return senha;
    }*/

    @Test
    public void testCreate(){
/*        User u = new User();
        Faker faker = new Faker();

        u.setNome(faker.name().firstName());
        u.setEmail(faker.internet().emailAddress());
        u.setLogin(faker.name().username());
        u.setSenha(faker.internet().password());*/

    User newUser = UserMock.getUserMock();

        ResponseEntity<User> postResponse = testRestTemplate.postForEntity(getRootUrl("/user"),newUser, User.class);

        assertNotNull(postResponse);

        assertEquals(201, postResponse.getStatusCodeValue());
    }
}
