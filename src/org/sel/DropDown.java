package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace-selenium\\Selenium day 6\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s =new Select(day);
		List<WebElement> list = s.getOptions();
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			WebElement element = list.get(i);
			String text = element.getText();
			System.out.println(text);
			
		}
		}
}
