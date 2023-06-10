package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void acessarAplicacao() {
		driver.manage().window().maximize();
		driver.get("https://ttsmp3.com/");
	}
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 10000)");
	}
	
	
	public void selecionarVoz() {
		WebElement dropdown = driver.findElement(By.id("sprachwahl"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Portuguese / Cristiano");
	}
	
	public void preencheComTexto(String texto) {
		driver.findElement(By.id("voicetext")).sendKeys(texto);
	}
	
	public void clickReproducao() {
		driver.findElement(By.id("vorlesenbutton")).click();
	}
	
}


