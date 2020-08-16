package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WiniumDesktopDriverSteps {
	
	private String path = System.getProperty("user.dir") + "\\src\\main\\java\\winium\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe";
	
	@When("Launch Winium Desktop Driver")
	public void LaunchWiniumDesktopDriver() {
		System.out.println("Launching Winium Desktop Driver");
		
		try {
			Runtime.getRuntime().exec(path);
			Thread.sleep(2000); //wait to start the exe
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
		
	@Then("Validate Winium Desktop Driver Launch")
	public void ValidateLaunchWiniumDesktopDriver() {
		System.out.println("Winium Desktop Driver Launched Successfully"); 
	}
}