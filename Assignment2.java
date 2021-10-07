package Assignment;


	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
	import io.restassured.specification.ResponseSpecification;

		public class Assignment2 {

			
			@Test
			public void getUserdetailsStatusCodeData() {
				
				RestAssured.baseURI="https://reqres.in";
				ResponseSpecification response= RestAssured.given().when().log().ifValidationFails().then().statusCode(202);
				System.out.println("response is"+response);
				

			
			}
		}


	


