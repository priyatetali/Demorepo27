
import org.testng.*;
import org.testng.annotations.*;


public class StudentTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite: Setting Global variables");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class: Initializing the test cases");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before class: Preparing a test");
	}
}
