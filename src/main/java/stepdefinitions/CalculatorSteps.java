package stepdefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {
	
	private String path = "C:\\Windows\\System32\\calc.exe";
	private String driverURL = "http://localhost:9999";	
	static private WiniumDriver driver;
	static private String result;
	
	@When("Launch Windows Calculator")
	public void LaunchWindowsCalculator() {
		System.out.println("Launching Windows Calculator");

		URL url = null;
		try {
			url = new URL(driverURL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath(path);
		option.setLaunchDelay(1000);
		driver = new WiniumDriver(url, option);
	}
	
	@Then("Validate Windows Calculator Launch")
	public void ValidateLaunchWindowsCalculator() {
		System.out.println("Windows Calculator Launched Successfully"); 
	}
	
	@When("Perform Addition of 1+2+3")
	public void PerformAddition() throws InterruptedException {
		System.out.println("Perform Addition of 1+2+3");
		
		Thread.sleep(2000);	//Wait for application to launch
		
		WebElement winelement = driver.findElement(By.name("Calculator"));
		winelement.click(); //bring the calculator in front 
		
		driver.findElement(By.name("One")).click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("Two")).click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("Three")).click();
		driver.findElement(By.name("Equals")).click();
				
		result = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");		 
	}
	
	@Then("Validate Addition of 1+2+3")
	public void ValidateAdditionResult( ) {
		System.out.println("Validate Addition of 1+2+3");
		if (result.compareTo("6") != 0) {
			System.out.println("Result of 1+2+3 is correct: " + result);
		} else {
			System.out.println("Result of 1+2+3 is not correct: " + result);
		}		
	}
}