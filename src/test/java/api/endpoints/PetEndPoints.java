package api.endpoints;

import api.payload.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PetEndPoints {
    public static Response createPet(Pet payload){
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Routes.pet_post_url);
    }

    public static Response readPet(int id){
        return given()
                .pathParams("id", id)
                .when()
                .get(Routes.pet_get_url);
    }

    public static Response updatePet(Pet payload){
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .put(Routes.pet_update_url);
    }

    public static Response deletePet(int id){
        return given()
                .pathParams("id", id)
                .when()
                .delete(Routes.pet_delete_url);
    }
}
