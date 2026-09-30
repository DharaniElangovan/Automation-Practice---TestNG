package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PIM extends ProjectSpecificMethods{
	@Test
	public  void pim() {
			// PIM
		
		  cd.findElement(By.xpath("//span[text()='PIM']")).click();
		  cd.findElement(By.xpath("//button[text()=' Add ']")).click();
		  cd.findElement(By.xpath("//input[@name='firstName']")).sendKeys("David");
		  cd.findElement(By.xpath("//input[@name='lastName']")).sendKeys("S");
		  //cd.findElement(By.xpath("//div[@class='oxd-switch-wrapper']")).click();
		  cd.findElement(By.className("oxd-switch-wrapper")).click();
		  cd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("davids"); //same class name is there for multiple elements and
		 // no other attributes to locate this element do ablosute xpath used
		  cd.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("David@123456789"); 
		  //cd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("David@123456789");
		  cd.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("David@123456789");
		  cd.findElement(By.xpath("//button[@type='submit']")).click();
		 

		
		  
		  
		  //https://www.youtube.com/watch?v=jH3gR4x5gGU&list=
		  //PLnNg6KqJ3HGj6WEz6jXwp1bvMAsjw-Nlp&index=9
		 

		
		
	}
}


