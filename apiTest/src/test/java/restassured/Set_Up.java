package restassured;

import org.junit.BeforeClass;
import static com.jayway.restassured.RestAssured.*;

public class Set_Up {
	
	@BeforeClass
	public static void test_setup(){
		
		 baseURI = "http://services.groupkt.com";
		 basePath = "/country/get";
	}

}
