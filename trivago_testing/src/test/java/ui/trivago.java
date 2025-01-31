package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trivago {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Initializing WebDriver...");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.com");
		driver.manage().window().maximize();
		System.out.println("Opened Trivago website");

		System.out.println("Selecting destination...");
		driver.findElement(By.xpath("//span[text()=\"Destination\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Where to?\"]")).sendKeys("Paris");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Where to?\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Destination selected: Paris");

		System.out.println("Selecting check-in and check-out dates...");
		driver.findElement(By.xpath("//span[@data-testid=\"search-form-calendar-checkin-value\"]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//time[@datetime='2025-01-13']")).click();
		driver.findElement(By.xpath("//time[@datetime='2025-01-14']")).click();
		Thread.sleep(1000);
		System.out.println("Selected check-in date: 2025-01-13, check-out date: 2025-01-14");

		System.out.println("Selecting guests...");
		driver.findElement(By.xpath("//span[text()=\"Guests and rooms\"]"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-testid=\"adults-amount-plus-button\"]")).click();
		driver.findElement(By.xpath("//button[@data-testid=\"children-amount-plus-button\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Apply\"]")).click();
		Thread.sleep(3000);
		System.out.println("Guests updated: 1 adult and 1 child");

		System.out.println("Applying filters...");
		driver.findElement(By.xpath("//button[@name=\"more_filters\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-testid=\"4-star-hotels-filter\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Apply\"]")).click();
		Thread.sleep(2000);
		System.out.println("4-star filter applied");

		System.out.println("Extracting hotel name...");
		WebElement HotelName = driver.findElement(By.xpath("//span[@itemprop='name']"));
		System.out.println("Hotel Name: " + HotelName.getText());

		System.out.println("Clicking on champion deal...");
		driver.findElement(By.xpath("//ol/li[1]//button[@data-testid=\"champion-deal\"]")).click();
		System.out.println("Champion deal clicked");

		driver.quit();
		System.out.println("Driver quit successfully");
	}
}
