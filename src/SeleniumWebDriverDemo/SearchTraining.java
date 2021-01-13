package SeleniumWebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchTraining {
	WebDriver driver;
	
	//Launching the firefox browser
	public void LaunchBrowser() {
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com");
	}
	//Searching selenium training and clicking on it
	public void search() throws InterruptedException {
		driver.findElement(By.id("header_srch")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='search_icon input-search-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[text()='Selenium 3.0 Training']")).click();
		System.out.println("The page title is " + driver.getTitle());
	}
	
	// close the browser
	public void closebrowser() {
		driver.quit();
	}
	

	public static void main(String[] args) throws InterruptedException {
		SearchTraining obj = new SearchTraining();
		obj.LaunchBrowser();
		obj.search();
		//obj.closebrowser();
		


	}

}
