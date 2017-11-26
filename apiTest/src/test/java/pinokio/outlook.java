package pinokio;

import org.junit.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import static com.jayway.restassured.RestAssured.*;

import java.net.URI;
//import io.restassured.*;
import java.net.URISyntaxException;

public class outlook {
//	
//	@Test
//	public void myapitest(){
//		
//		given().get("http://www.groupkt.com/post/c9b0ccb9/country-and-other-related-rest-webservices.htm")
//		.then()
//		.statusCode(200)
//		.log()
//		.all();
//		
//	}
	
	@Test
	public void myapitest_0() throws URISyntaxException{
		
		Response response = given()
				.accept(ContentType.JSON)
				.when()
				.get(new URI("http://services.groupkt.com/country/get/all"));
		System.out.println(response.asString());
		
	}

}
