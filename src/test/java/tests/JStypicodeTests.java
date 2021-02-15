package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import model.Users;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JStypicodeTests {

    @BeforeTest
    public void initTests(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void verifyHTTPStatusCode(){
        Response response = RestAssured.when().get("/users").andReturn();
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void verifyHTTPResponseHeader(){
        Response response = RestAssured.when().get("/users").andReturn();
        String respContentTypeHeader = response.getHeader("Content-Type");
        Assert.assertEquals(respContentTypeHeader, "application/json; charset=utf-8");
    }

    @Test
    public void verifyHTTPResponseBody(){
        Response response = RestAssured.when().get("/users").andReturn();
        ResponseBody responseBody = response.getBody();
        Users[] users = responseBody.as(Users[].class);
        System.out.println(users.length);
        Assert.assertEquals(users.length, 10);
    }
}
