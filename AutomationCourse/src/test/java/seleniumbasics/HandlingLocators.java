package seleniumbasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base {

	public void verifyLocator()
	{
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElements(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple Form Demo"));
        driver.findElement(By.cssSelector("input[id='single-input-field']"));
       
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
