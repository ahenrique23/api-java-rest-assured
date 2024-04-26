package pages;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UsersPage {

    private static final String BASE_URL = "https://reqres.in/api/users";

    public Response criarNovoUsuario(String nome, String cargo) {
        String requestBody = String.format("{\"name\": \"%s\", \"job\": \"%s\"}", nome, cargo);
        return given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post(BASE_URL);
    }

    public Response atualizarUsuario(int id, String nome, String cargo) {
        String requestBody = String.format("{\"name\": \"%s\", \"job\": \"%s\"}", nome, cargo);
        return given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .patch(BASE_URL + "/" + id);
    }
    public Response obterUsuario(int id) {
        return given()
                .when()
                .get(BASE_URL + "/" + 1);
    }

    public Response obterRecursoDesconhecido() {
        return given()
                .when()
                .get(BASE_URL);
    }
}
