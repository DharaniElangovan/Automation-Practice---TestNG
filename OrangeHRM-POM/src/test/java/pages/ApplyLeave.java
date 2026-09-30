package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ApplyLeave extends ProjectSpecificMethods{
	@Test
	public void applyLeave() {
		// Apply Leave
		
				cd.findElement(By.xpath("//span[text()='Leave']")).click();
				cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				cd.findElement(By.linkText("Apply")).click();
				cd.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
				cd.findElement(By.xpath("//*[contains(text(),'CAN - Bereavement')]")).click();
				WebElement leaveCount=cd.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-leave-balance-text']"));
				System.out.println("Leave Balance Is:" + leaveCount.getText());
				WebElement dateField1 = cd.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]"));
				dateField1.sendKeys("2026-09-08");
				dateField1.sendKeys(Keys.TAB);
				cd.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]")).sendKeys("2026-09-10");
				cd.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
