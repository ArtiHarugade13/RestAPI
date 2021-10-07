package Assignment;


	import org.testng.Assert;
	import org.testng.annotations.Test;

	import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonObject;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.restassured.RestAssured;
	import io.restassured.http.Method;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class Assignment5 {
		@Test
		@Given("Set http Request")

		public void set_http_request(){
			String api="http://api.exchangeratesapi.io/v1/latest?access_key=4fb75ee62f86c0674b3199081e4ab3bd";
			
		}

		@When("create a  negative scenario")
		@Test
		public void create_a_negative_assertion_scenario() {
			JsonObject request = new JsonObject();
			request.set("sucess","false");
			request.set("base","EUR");
			request.set("date","2021-09-27");
			Response res= RestAssured.post("http://api.exchangeratesapi.io/v1/latest?access_key=4fb75ee62f86c0674b3199081e4ab3bd");
			int statuscode = res.getStatusCode();
			int expected = res.getStatusCode();
			int assigned = 200;
			Assert.assertEquals(expected, assigned);
			System.out.println("Statuscode is" +statuscode);
		}

		@Then("print the negative response into console")
		@Test
		public void print_the_negative_response_into_console() {
			
			Response res = RestAssured.post("http://api.exchangeratesapi.io/v1/latest?access_key=4fb75ee62f86c0674b3199081e4ab3bd");
			System.out.println("Response body is:" +res);
			System.out.println("Negative response received");
		}
		}



