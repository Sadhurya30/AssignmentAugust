package week3.xpathassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FirstScriptAbhiBus {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get(" https://www.abhibus.com/");
			
			driver.findElement(By.id("source")).sendKeys("Chennai");
		
			driver.findElement(By.xpath("//li[text()='Chennai']")).click();
			
			driver.findElement(By.id("destination")).sendKeys("Bangalore");
		
			driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
			
			driver.findElement(By.id("datepicker1")).click();
			
			driver.findElement(By.linkText("7")).click();
			
			driver.findElement(By.linkText("Search")).click();
			
			WebElement bus = driver.findElement(By.xpath("//h2[@title='Yolo Bus']"));
			
			System.out.println(bus);
			
			String bus1 =bus.getText();
			System.out.println((bus1));
			
			
			driver.findElement(By.id("Bustypes4")).click();
			
			WebElement seat= driver.findElement(By.xpath("//p[text()='24 Seats Available']"));
			
			String seat1= seat.getText();
			
			driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
			
			driver.findElement(By.xpath("//a[@id='O3-2ZZ']")).click();
			
			WebElement ss1 = driver.findElement(By.xpath("//span[text()='DL1']"));
			String ss=ss1.getText();
			System.out.println("Seats Selected " + ss);
			
			WebElement fare = driver.findElement(By.xpath("//span[@id='ticketfare']"));
			String fare1 = fare.getText();
			System.out.println("Total Fare " + fare1);
			
			WebElement bp = driver.findElement(By.id("boardingpoint_id"));
			Select bp1 =new Select(bp);
			bp1.selectByIndex(3);
			
			WebElement dp = driver.findElement(By.id("droppingpoint_id"));
			Select dp1 = new Select(dp);
			dp1.selectByIndex(4);
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			driver.close();
			
	}

}
