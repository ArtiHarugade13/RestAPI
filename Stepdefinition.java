package Assignment1;


	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;

	public class Stepdefinition {

		@BeforeTest
		public void setupbaseURL() {
			RestAssured.baseURI="https://reqres.in";
		}
		
		@Test
		public void getUserDetailsCode() {
		
			RestAssured.given()
			.when()
			.get("/api/users?page=2")
			.then()
			.assertThat().log()
			.all()
			.statusCode(200)
			.and()
			.contentType(ContentType.JSON).and()
			.header("Server", "cloudflare")
			.and()
			.header("Content-encoding", "gzip");
			
		}
		
		@Test
		public void createUser() {
			RestAssured.given()
			.when()
			.body("{\n"
					+ "    \"name\": \"morpheus\",\r\n"
					+ "    \"job\": \"leader\"\r\n"
					+ "}")
			.post("/api/users")
			.then()
			.assertThat()
			.statusCode(201);
		}
		}



