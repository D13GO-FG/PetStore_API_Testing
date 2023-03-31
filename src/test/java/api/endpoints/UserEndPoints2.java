package api.endpoints;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

// UserEndPoints.java
// Created for perform Create, Read, Update, Delete request the user API.
public class UserEndPoints2 {
    // Method created for getting URLs from properties file.
    static ResourceBundle gerUrl(){
        return ResourceBundle.getBundle("routes"); // Load properties file, name of file (not path).
    }
    public static Response createUser(User payload){
        String post_url = gerUrl().getString("post_url");
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(post_url);
    }

    public static Response readUser(String useName){
        String get_url = gerUrl().getString("get_url");
        return given()
                .pathParams("username", useName)
                .when()
                .get(get_url);
    }

    public static Response updateUser(String useName, User payload){
        String update_url = gerUrl().getString("update_url");
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParams("username", useName)
                .body(payload)
                .when()
                .put(update_url);
    }

    public static Response deleteUser(String useName){
        String delete_url = gerUrl().getString("delete_url");
        return given()
                .pathParams("username", useName)
                .when()
                .delete(delete_url);
    }
}
