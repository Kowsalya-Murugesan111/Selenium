import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TASK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://phptravels.org/register.php");
		
		driver.findElement(By.xpath("//input[@id=\"inputFirstName\"]")).sendKeys("Kowsi");
		driver.findElement(By.xpath("//input[@id='inputLastName']")).sendKeys("Murugesan");
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("Kowsimurugean11@gmail.com");	
		
		//selecting country code
		driver.findElement(By.xpath("//div[@class='flag-container']")).click();
		driver.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/descendant::div[2]/descendant::div[10]/descendant::ul[1]/descendant::li[102]//span[@class='country-name']")).click();	
	  
		driver.findElement(By.xpath("//input[@id='inputPhone']")).sendKeys("7708403039");

		driver.findElement(By.xpath("//input[@id='inputAddress1']")).sendKeys("Kalam Street");
		driver.findElement(By.xpath("//input[@id='inputAddress2']")).sendKeys("4th lane");
		driver.findElement(By.xpath("//input[@id='inputCity']")).sendKeys("Tiruppur");
	    driver.findElement(By.xpath("//input[@id='stateinput']")).sendKeys("TamilNadu");
	    driver.findElement(By.xpath("//input[@id='inputPostcode']")).sendKeys("641606");
	    
	    //selecting country
		   driver.findElement(By.xpath("//select[@id='inputCountry']")).click();
	       driver.findElement(By.xpath("//select[@id='inputCountry']/option[@value='IN']")).click();
	   
	    driver.findElement(By.xpath("//select[@id='customfield1']/option[@value='Friend']")).click();
	    driver.findElement(By.xpath("//input[@id='customfield2']")).sendKeys("7708403039");

	    //generating password 
		   driver.findElement(By.xpath("//*[@id=\"containerPassword\"]/div[4]/button")).click();
		   driver.switchTo().activeElement().sendKeys(Keys.ENTER);
           driver.findElement(By.xpath("//button[@id=\"btnGeneratePasswordInsert\"]")).click();

           }

}
