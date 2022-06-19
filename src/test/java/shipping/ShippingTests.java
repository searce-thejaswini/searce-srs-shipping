package shipping;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
//import org.testng.annotations.Test;


//import com.github.tomakehurst.wiremock.WireMockServer;
import io.restassured.response.Response;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static io.restassured.RestAssured.given;

public class ShippingTests {
	
	@Test
    public void validateDistance() {
        Response response =  given().when().get("http://localhost:8080/api/shipping/calc/4374516");
        String title = response.jsonPath().get("distance");
        AssertJUnit.assertEquals("9235", title);
    }
	
}

