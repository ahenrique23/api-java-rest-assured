package tests;

import pages.UsersPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersTest {

    @Test
    public void testCriarNovoUsuario() {
        UsersPage usersPage = new UsersPage();

        String nome = "TesteTestando";
        String cargo = "leader";

        int statusCode = usersPage.criarNovoUsuario(nome, cargo).getStatusCode();

        assertEquals(201, statusCode, "Status code não é 201 - Created");
    }

    @Test
    public void testAtualizarUsuario() {
        UsersPage usersPage = new UsersPage();

        int idUsuario = 1;
        String nome = "teste";
        String cargo = "testando testado";

        int statusCode = usersPage.atualizarUsuario(idUsuario, nome, cargo).getStatusCode();

        assertEquals(200, statusCode, "Status code não é 200 - OK");
    }

    @Test
    public void testObterUsuario() {
        UsersPage usersPage = new UsersPage();

        int statusCode = usersPage.obterRecursoDesconhecido().getStatusCode();

        assertEquals(200, statusCode, "Status code não é 200 - OK");
    }

    @Test
    public void testObterRecursoDesconhecido() {
        UsersPage unknownPage = new UsersPage();

        int statusCode = unknownPage.obterRecursoDesconhecido().getStatusCode();

        assertEquals(200, statusCode, "Status code não é 200 - OK");
    }
}
