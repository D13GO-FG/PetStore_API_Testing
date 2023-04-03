package api.endpoints;

import api.payload.Order;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class OrderEndPoints {
    public static Response createOrderStore(Order payload){
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Routes.store_post_url);
    }

    public static Response readOrderStore(int id){
        return given()
                .pathParams("id", id)
                .when()
                .get(Routes.store_get_url);
    }

    public static Response deleteOrderStore(int id){
        return given()
                .pathParams("id", id)
                .when()
                .delete(Routes.store_delete_url);
    }

    public static Response readInventory(){
        return given()
                .when()
                .get(Routes.store_inventory_url);
    }
}
