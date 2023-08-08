package week3.xpathassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.className("nav-icon")).click();
		
		driver.findElement(By.xpath("//a[text() ='Movie Library']")).click();
		
		//WebElement city = driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']"));
		//Select city1 = new Select(city);
		//city1.selectByVisibleText("Chennai");
		
		//WebElement genre = driver.findElement(By.xpath("//select[@name = 'genre']"));
		//Select genre1 = new Select(genre);
		//genre1.selectByVisibleText("ANIMATION");
		
		//WebElement language = driver.findElement(By.xpath(""));
		//Select language1 = new Select(language);
		//genre1.selectByVisibleText("ENGLISH");
		
		
		
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select citydd = new Select(city);
		citydd.selectByVisibleText("Chennai");

		WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));
		Select genredd = new Select(genre);
		genredd.selectByVisibleText("ANIMATION");
	
		WebElement language = driver.findElement(By.xpath("//select[@name='lang']"));
		Select languagedd = new Select(language);
		languagedd.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted'])[1]")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		WebElement cinema = driver.findElement(By.id("cinemaName"));
		Select cinema1 = new Select(cinema);
		cinema1.selectByVisibleText("INOX The Marina Mall, OMR, Chennai");
		Thread.sleep(3000);
		
		driver.findElement(By.name("name")).sendKeys("Sadhurya");
		Thread.sleep(3000);
		
		WebElement time = driver.findElement(By.name("timings"));
		Select time1 = new Select(time);
		time1.selectByVisibleText("09:00 AM - 12:00 PM");
		Thread.sleep(3000);
		
		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		Thread.sleep(3000);
		
		WebElement food = driver.findElement(By.name("food"));
		Select food1 = new Select(food);
		food1.selectByVisibleText("Yes");
		Thread.sleep(3000);
		
		driver.findElement(By.name("mobile")).sendKeys("8825958174");
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("sad123@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("comment")).sendKeys("nil");
		Thread.sleep(1000);
		
		driver.close();
		

	}

}

