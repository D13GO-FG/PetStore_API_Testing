package api.test;

import api.endpoints.PetEndPoints;
import api.payload.Category;
import api.payload.Pet;
import api.payload.Tag;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PetTests {
    Faker faker;
    Pet petPayload;
    Category category;
    Tag tag;
    public Logger logger;

    @BeforeClass
    public void setUp(){
        faker = new Faker();
        petPayload = new Pet();

        category = new Category();
        category.setId(faker.idNumber().hashCode());
        category.setName(faker.dog().breed());

        tag = new Tag();
        tag.setId(faker.idNumber().hashCode());
        tag.setName(faker.dog().gender());

        List<Tag> list = new ArrayList<>(List.of(tag));

        petPayload.setId(faker.idNumber().hashCode());
        petPayload.setCategory(category);
        petPayload.setName(faker.dog().name());
        petPayload.setPhotoUrls(Collections.singletonList("https://res.cloudinary.com/dktx1oojk/image/upload/f_auto,dpr_auto,q_60,fl_progressive/w_0.8888392857142857142857142857,h_1.0,c_fill,g_auto/w_1536,h_1152,c_scale/www2022/powerinit/15458/Print_AniCura_Dogs_352_Siberian%20husky.jpg"));
        petPayload.setTags(list);
        petPayload.setStatus("available");

        logger = LogManager.getLogger(this.getClass());
    }

    @Test(priority = 1)
    public void testPostPet(){
        logger.info("************* Creating Pet *************");
        Response response = PetEndPoints.createPet(petPayload);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("************* Pet Is Created*************");
    }

    @Test(priority = 2)
    public void testGetPetById(){
        logger.info("************* Reading pet info *************");
        Response response = PetEndPoints.readPet(this.petPayload.getId());
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("************* Pet info is Displayed *************");
    }

    @Test(priority = 3)
    public void testUpdatePet(){
        logger.info("************* Updating Pet *************");
        petPayload.setName(faker.dog().name());
        category.setName(faker.dog().breed());
        petPayload.setCategory(category);

        Response response = PetEndPoints.updatePet(petPayload);
        response.then().log().body();
        Assert.assertEquals(response.getStatusCode(), 200);

        logger.info("************* Pet Updated *************");

        Response responseAfterUpdate = PetEndPoints.readPet(this.petPayload.getId());
        Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
    }

    @Test(priority = 4)
    public void testDeletePetById(){
        logger.info("************* Deleting Pet *************");
        Response response = PetEndPoints.deletePet(this.petPayload.getId());
        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("************* Pet Deleted *************");
    }
}
