package week3.day3Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       //Launch browser
				ChromeDriver driver = new ChromeDriver();
				
				// Maximize the window
				driver.manage().window().maximize();
				
				// Load the url
				driver.get("http://leaftaps.com/opentaps/");
				
				// Locate username field and Enter password as DemoSalesManager
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				
				//Locate password field and enter password as crmsfa
			    driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Click on the Login button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Get title of the welcome page
				String welcomePageTitle = driver.getTitle();
				System.out.println("welcomePageTitle : " + welcomePageTitle);
				
				// Click on the crmsfa link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				// Get title of the MyHome page
				//String HomePageTitle = driver.getTitle();
				//System.out.println("HomePageTitle : " + HomePageTitle);
				
				// Click on the leads tab
			    driver.findElement(By.linkText("Leads")).click();
				
				//Click on the create lead 
		        driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter companyName as TestLeaf
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				//enter the firstname
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sadhurya");
				//enter the lastname
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
				//enter the first name (local)
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sadhu");
				//enter the department name
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
				//enter the description
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Manual and Automation");
				//enter the email address
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sadhupari@gmail.com");
				//select the state/province 
				
				WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select state1 = new Select(state);
				state1.selectByVisibleText("New York");
				
				//click the ccreate lead
				driver.findElement(By.className("smallSubmit")).click();
				
				//get the title
				String title = driver.getTitle();
				System.out.println(title);
				
				
				//To close the window
				driver.close();

		
   }

}
