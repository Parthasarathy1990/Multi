package org.multi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutliDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\partha\\WinHandles\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement a = d.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select s = new Select(a);
		List<WebElement> opt = s.getOptions();
		for (WebElement allopt : opt) {
			String text = allopt.getText();
			System.out.println(text);
			s.selectByVisibleText(text);
			if (text.equals("Switch Commands") || text.equals("WebElement Commands")) {
				s.selectByVisibleText(text);
				
			}
			
		}
	}

}
