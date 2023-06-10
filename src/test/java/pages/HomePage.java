package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofMillis(20000));
        }

	public void acessarAplicacao() {
		driver.manage().window().maximize();
		driver.get("https://www.naturalreaders.com/online/");
	}
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 10000)");
	}
	
	
	public void selecionarVoz() {
		driver.findElement(By.id("v_65")).click();
		driver.findElement(By.cssSelector("body > app-root > app-voice-selection > div > div > div.pw-voice-footer > button")).click();
	}
	
    public void preencheComTexto(String texto) {
        WebElement inputDiv = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("inputDiv")));
        inputDiv.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputDiv.sendKeys(Keys.DELETE);
        inputDiv.sendKeys(texto);
    }
	
	public void clickReproducao() {
        WebElement inputDiv = driver.findElement(By.id("inputDiv"));
        inputDiv.sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
        inputDiv.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("#pw-reading-page > div.pw-page-header > div > div.header-center.ng-star-inserted > app-pw-reading-bar > div > div > button.mat-focus-indicator.pw-read-btn.btn-hover.mat-icon-button.mat-button-base._mat-animation-noopable > span.mat-button-wrapper > svg")).click();
	}
	
}


