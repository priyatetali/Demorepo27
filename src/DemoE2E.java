import org.testng.annotations.Test;

public class DemoE2E {
	
	@Test(groups= {"smoke"})
	public void sampleTest() {
		System.out.println("TestNG tags are working: This is my first test case");
	}
	
	@Test
	public void sampleTest1() {
		System.out.println("TestNG tags are working");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
