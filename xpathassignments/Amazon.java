package week3.xpathassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		
		WebElement results =driver.findElement(By.xpath("//span[text()='1-48 of over 50,000 results for']"));
		String results1 = results.getText();
		System.out.println(results1);
		
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		
		driver.findElement(By.id("a-autoid-3-announce")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("s-result-sort-select_4")).click();
		
		WebElement a =driver.findElement(By.xpath("//span[text()='Xfopz']"));
		String a1 = a.getText();
		System.out.println(a1);
		
		WebElement b =driver.findElement(By.xpath("//h2[@class = 'a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		String b1 = b.getText();
		System.out.println(b1);
		//driver.close();
		
		WebElement c = driver.findElement(By.xpath("//span[text()='1,299']"));
		String c1 = c.getText();
		System.out.println("Discounted Price: "  + c1);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
		
		
		

		
	}

}
