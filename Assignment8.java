package Assignment;


	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Assignment8 {
		
		@Test
		@Parameters("MyAge")
		public void mytest(String MyAge){
			System.out.println("From mytest1 , My age is : " +MyAge);
		}
		@Test
		@Parameters("MyName")
		public void mytest2(String MyName){
			System.out.println("From mytest2 , My age is : " +MyName);
		
		}
	}



