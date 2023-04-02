package api.endpoints;

/*

Swagger URI --> https://petstore.swagger.io/v2/

Create user(Post): https://petstore.swagger.io/v2/user
Get User(Get): https://petstore.swagger.io/v2/user/{username}
Update User(Put): https://petstore.swagger.io/v2/user/{username}
Delete User(Delete): https://petstore.swagger.io/v2/user/{username}

 */

public class Routes {
    public static String base_url = "https://petstore.swagger.io/v2";

    // User module
    public static String post_url = base_url + "/user";
    public static String get_url = base_url + "/user/{username}";
    public static String update_url = base_url + "/user/{username}";
    public static String delete_url = base_url + "/user/{username}";

    // Store module

    public static String pet_post_url = base_url + "/pet";
    public static String pet_get_url = base_url + "/pet/{id}";
    public static String pet_update_url = base_url + "/pet";
    public static String pet_delete_url = base_url + "/pet/{id}";


    // Pet module
}
