package api.test;

import api.endpoints.OrderEndPoints;
import api.payload.Order;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class StoreTests {
    Faker faker;
    Order orderPayload;
    public Logger logger;

    @BeforeClass
    public void setUp(){
        faker = new Faker();
        orderPayload = new Order();

        orderPayload.setId(faker.idNumber().hashCode());
        orderPayload.setPetId(faker.idNumber().hashCode());
        orderPayload.setQuantity(faker.number().numberBetween(1,5));
        orderPayload.setShipDate(LocalDateTime.now().toString());
        orderPayload.setStatus("approved");
        orderPayload.setComplete(true);

        logger = LogManager.getLogger(this.getClass());
    }

    @Test(priority = 1)
    public void testPostOrder(){
        logger.info("*********** Creating Order ***********");
        Response response = OrderEndPoints.createOrderStore(orderPayload);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("*********** Order Is Created ***********");
    }

    @Test(priority = 2)
    public void testGetOrderById(){
        logger.info("*********** Reading Order Info ***********");
        Response response = OrderEndPoints.readOrderStore(this.orderPayload.getId());
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("*********** Order Info Is Displayed ***********");
    }

    @Test(priority = 3)
    public void testDeleteById(){
        logger.info("*********** Deleting User ***********");
        Response response = OrderEndPoints.deleteOrderStore(this.orderPayload.getId());
        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("*********** User Deleted ***********");
    }

    @Test(priority = 4)
    public void testGetInventory(){
        logger.info("*********** Reading Inventory Info ***********");
        Response response = OrderEndPoints.readInventory();
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("*********** Inventory Info is Displayed ***********");
    }

}
