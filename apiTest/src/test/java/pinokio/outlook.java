package pinokio;



import static com.jayway.restassured.RestAssured.given;

import java.net.URI;
import io.restassured.*;
import java.net.URISyntaxException;

import org.apache.http.HttpStatus;
import org.junit.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class outlook {
	
	@Test
	public void myapitest(){
		
		given().get("/iso2code/NG")
		.then()
		.statusCode(200)
		.log()
		.all();
		
	}
	
	@Test
	public void myapitest_0() throws URISyntaxException{
		
		Response response = given()
				.accept(ContentType.JSON)
				.when()
				.get(new URI("/all"));
		System.out.println(response.asString());
		
	}
	
	@Test
	public void assert_status() throws URISyntaxException{
		given()
		.accept(ContentType.JSON)
		.when()
		.get(new URI("/all"))
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_OK);
		
		
	}

}
