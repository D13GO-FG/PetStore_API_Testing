# PetStore Framework to API testing using Hybrid Driven Testing

### Technologies
1. Rest Assured
2. TestNG
3. Apache POI
4. AventStack report

[Documentation: Swagger PetStore](https://petstore.swagger.io/#/)

## Test Cases User
| TCID  | Model | Title       | HTTP Request | URL                                            | Request Body                                                                                                                                                                           | Response                                                                                                                                                                               | Authentication | Status Code |
|-------|-------|-------------|--------------|------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------|-------------|
| TC001 | User  | Create User | Post         | https://petstore.swagger.io/v2/user            | {<br>"id": 0,<br>"username": "string",<br>"firstName": "string",<br>"lastName": "string",<br>"email": "string",<br>"password": "string",<br>"phone": "string",<br>"userStatus": 0<br>} | successful operation                                                                                                                                                                   | N\\A           | 200         |
| TC002 | User  | Get User    | Get          | https://petstore.swagger.io/v2/user/{username} | Path Param: Username                                                                                                                                                                   | {<br>"id": 0,<br>"username": "string",<br>"firstName": "string",<br>"lastName": "string",<br>"email": "string",<br>"password": "string",<br>"phone": "string",<br>"userStatus": 0<br>} | N\\A           | 200         |
| TC003 | User  | Update User | Put          | https://petstore.swagger.io/v2/user/{username} | {<br>"id": 0,<br>"username": "string",<br>"firstName": "string",<br>"lastName": "string",<br>"email": "string",<br>"password": "string",<br>"phone": "string",<br>"userStatus": 0<br>} | successful operation                                                                                                                                                                   | N\\A           | 200         |
| TC004 | User  | Delete User | Delete       | https://petstore.swagger.io/v2/user/{username} | Path Param: Username                                                                                                                                                                   | Deleted                                                                                                                                                                                | N\\A           | 200         |

### Design Patter
![Design Patter](src/main/resources/images/Rest_Assured_Framework.png)

### Git flow
![git flow](src/main/resources/images/GitFlow.png)

