package Assignment;


	import org.testng.Assert;
	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class Assignment3 {

		@Test
		public void verify_statusCode()
		{
			String url = "https://reqres.in/api/users?page=2";
			
			RequestSpecification http_request = RestAssured.given();
			Response response = http_request.get(url);
			int statusCode = response.getStatusCode();
			System.out.println("print status code" + statusCode);
			Assert.assertEquals(statusCode, 200, "status code are matched");
			
		}
	}


