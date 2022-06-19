package shipping;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class WireMockJunitTest {

	@Test
    public void testStatusCodePositive() {
        given().
                when().
                get("http://localhost:8080/api/shipping/calc/4374516").
                then().
                assertThat().statusCode(200);
    }
	
    
  
}