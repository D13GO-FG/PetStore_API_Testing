package api.endpoints;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

// UserEndPoints.java
// Created for perform Create, Read, Update, Delete request the user API.
public class UserEndPoints {
    public static Response createUser(User payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Routes.post_url);
        return response;
    }

    public static Response readUser(String useName){
        Response response = given()
                .pathParams("username", useName)
                .when()
                .get(Routes.get_url);
        return response;
    }

    public static Response updateUser(String useName, User payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParams("username", useName)
                .body(payload)
                .when()
                .put(Routes.update_url);
        return response;
    }

    public static Response deleteUser(String useName){
        Response response = given()
                .pathParams("username", useName)
                .when()
                .delete(Routes.delete_url);
        return response;
    }
}
