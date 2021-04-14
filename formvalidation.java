import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class formvalidation {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Kowsi");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Murugesan");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Kowsimurugean11@gmail.com");	
		
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7708403033");
		driver.findElement(By.xpath("//input[@name='gender'][@value='Female']/following-sibling::label")).click();
		
		driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]")).click();
		Select month = new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]")));
		month.selectByValue("0");
		Select year = new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]")));
		year.selectByVisibleText("1998");
		driver.findElement(By.xpath("//div[@aria-label=\"Choose Sunday, January 11th, 1998\"]")).click();

		 driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\kowsalya.murugesan\\Downloads\\download.jpg");

 	    driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("Computer Science");
    	driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys(Keys.ENTER);
			
    	
        driver.findElement(By.xpath("//textArea[@id='currentAddress']")).sendKeys("Tiruppur,Tamilnadu");
		driver.findElement(By.xpath("//div[@id='state']")).click();
		driver.findElement(By.xpath("//div[@id='state']/descendant::div[1]/descendant::div[4]/child::input")).sendKeys("Haryana");
		driver.findElement(By.xpath("//input[@id='react-select-3-input']")).sendKeys(Keys.ENTER);
	      
		driver.findElement(By.xpath("//div[@id='city']")).click();
	    driver.findElement(By.xpath("//div[@id='city']/descendant::div[1]/descendant::div[4]/child::input")).sendKeys("Karnal");
	    driver.findElement(By.xpath("//input[@id='react-select-4-input']")).sendKeys(Keys.ENTER);
	 
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	 
	}

}
