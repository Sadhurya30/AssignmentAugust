package week3.day3Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		*Assignment 3:Duplicate Lead*

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//	    1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/");

//	    2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

//	    3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

//	    4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

//	    5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

//	    6. Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();

//	    7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Microsoft");

//	    8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijay");

//	    9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sethupathi");

//	    10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ram");

//	    11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

//	    12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Tester");

//	    13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sram10@gmail.com");

//	    14. Select State/Province as NewYork Using Visible Text
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD = new Select(State);
		stateDD.selectByVisibleText("New York");

//	    15. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();

//	    16. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		String expectedTitle1 = "View Lead | opentaps CRM";
		String actualTitle1 = driver.getTitle();

		if (expectedTitle1.equals(actualTitle1)) {
			System.out.println("First expected result page is displayed");
		} else {
			System.out.println("First expected result page is not displayed");
		}

//		17. Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();

//      18. Clear the CompanyName Field using .clear() And Enter new CompanyName
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("Microsoft");

//      19.	Clear the FirstName Field using .clear() And Enter new FirstName
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("Prasad");

//      20.   Click on Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();

//      21.   Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		String expectedTitle2 = "View Lead | opentaps CRM";
		String actualTitle2 = driver.getTitle();

		if (expectedTitle2.equals(actualTitle2)) {
			System.out.println("Second expected result page is displayed");
		} else {
			System.out.println("Second expected result page is not displayed");
		}
		
		driver.close();
	}
	

}