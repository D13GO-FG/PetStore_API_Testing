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

## Test Cases Pet
| TCID  | Model | Title      | HTTP   | URL                                        | Request Body                                                                                                                                                                                                             | Response                                                                                                                                                                                                                 | Authentication | Status Code |
|-------|-------|------------|--------|--------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------|-------------|
| TC005 | Pet   | Create Pet | Post   | https://petstore.swagger.io/v2/pet         | {<br>"id": 0,<br>"category": {<br>"id": 0,<br>"name": "string"<br>},<br>"name": "doggie",<br>"photoUrls": [<br>"string"<br>],<br>"tags": [<br>{<br>"id": 0,<br>"name": "string"<br>}<br>],<br>"status": "available"<br>} |                                                                                                                                                                                                                          | N/A            | 200         |
| TC006 | Pet   | Get Pet    | Get    | https://petstore.swagger.io/v2/pet/{petId} | Path Param: pet Id                                                                                                                                                                                                       | {<br>"id": 0,<br>"category": {<br>"id": 0,<br>"name": "string"<br>},<br>"name": "doggie",<br>"photoUrls": [<br>"string"<br>],<br>"tags": [<br>{<br>"id": 0,<br>"name": "string"<br>}<br>],<br>"status": "available"<br>} | N/A            | 200         |
| TC007 | Pet   | Update Pet | Post   | https://petstore.swagger.io/v2/pet/{petId} | {<br>"id": 0,<br>"category": {<br>"id": 0,<br>"name": "string"<br>},<br>"name": "doggie",<br>"photoUrls": [<br>"string"<br>],<br>"tags": [<br>{<br>"id": 0,<br>"name": "string"<br>}<br>],<br>"status": "available"<br>} |                                                                                                                                                                                                                          | N/A            | 200         |
| TC008 | Pet   | Delete Pet | Delete | https://petstore.swagger.io/v2/pet/{petId} | Path Param: pet Id                                                                                                                                                                                                       |                                                                                                                                                                                                                          | N/A            | 200         |

## Test Cases Order
| TCID  | Model | Title         | HTTP   | URL                                                  | Request Body                                                                                                                              | Response                                                                                                                                  | Authentication | Status Code |
|-------|-------|---------------|--------|------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|----------------|-------------|
| TC005 | Order | Create Order  | Post   | https://petstore.swagger.io/v2/store/order           | {<br>"id": 0,<br>"petId": 0,<br>"quantity": 0,<br>"shipDate": "2023-04-03T00:10:52.128Z",<br>"status": "placed",<br>"complete": true<br>} | {<br>"id": 0,<br>"petId": 0,<br>"quantity": 0,<br>"shipDate": "2023-04-03T01:41:03.985Z",<br>"status": "placed",<br>"complete": true<br>} | N/A            | 200         |
| TC006 | Order | Get Order     | Get    | https://petstore.swagger.io/v2/store/order/{orderId} | Path Param: order Id                                                                                                                      | {<br>"id": 0,<br>"petId": 0,<br>"quantity": 0,<br>"shipDate": "2023-04-03T01:42:26.579Z",<br>"status": "placed",<br>"complete": true<br>} | N/A            | 200         |
| TC007 | Order | Delete Order  | Delete | https://petstore.swagger.io/v2/store/order/{orderId} | Path Param: order Id                                                                                                                      |                                                                                                                                           | N/A            | 200         |
| TC008 | Order | Get Inventory | Get    | https://petstore.swagger.io/v2/store/inventory       |                                                                                                                                           | {<br>"totvs": 1,<br>"sold": 2,<br>"string": 434,<br>"pending": 4,<br>"available": 138<br>}                                                | N/A            | 200         |

### Design Patter
![Design Patter](src/main/resources/images/Rest_Assured_Framework.png)

### Git flow
![git flow](src/main/resources/images/GitFlow.png)

