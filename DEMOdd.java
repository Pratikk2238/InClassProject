package basepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMOdd {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement wahington=driver.findElement(By.xpath("//div[@id='box3']"));
		
		WebElement osolo=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement copenhagen=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement seoul=driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement stockholm=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement madrid=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));	
		
		
		WebElement us=driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement denmark=driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement southkorea=driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement spain=driver.findElement(By.xpath("//div[@id='box107']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement norway=driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement sweden=driver.findElement(By.xpath("//div[@id='box102']"));	
		
		Actions act= new Actions(driver);
		act.dragAndDrop(wahington, us).perform();
		act.dragAndDrop(rome,italy).perform();
		act.dragAndDrop(madrid, spain).perform();
		act.dragAndDrop(stockholm, sweden).perform();
		act.dragAndDrop(copenhagen, denmark).perform();
		act.dragAndDrop(seoul, southkorea).perform();
		act.dragAndDrop(osolo, norway).perform();
		
		
	}
	

}
