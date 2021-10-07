package Assignment;


	import org.testng.Assert;
	import org.testng.annotations.Test;

	import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonObject;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;

	public class Assignment6 {
		@Test
		@Given("Set http Request")

		public void set_http_request(){
			String api="http://api.exchangeratesapi.io/v1/latest?access_key=4fb75ee62f86c0674b3199081e4ab3bd";
			
		}
		
		@When("To get date & time")
		@Test
		public void to_ger_date_time() {
			JsonObject request = new JsonObject();
			request.set("sucess","false");
			request.set("base","EUR");
			request.set("date","2021-09-27");
			Response res= RestAssured.post("http://api.exchangeratesapi.io/v1/latest?access_key=4fb75ee62f86c0674b3199081e4ab3bd");
			System.out.println(res.getBody());
		}

		@Then("print the response into console")
		@Test
		public void print_the_response_into_console() {
			
			Response res = RestAssured.post("http://api.exchangeratesapi.io/v1/latest?access_key=4fb75ee62f86c0674b3199081e4ab3bd");
			System.out.println("Response body is:" +res);
			System.out.println("Negative  received");
		}
		}

