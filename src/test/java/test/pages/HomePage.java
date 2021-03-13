package test.pages;

import static test.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.core.BasePage;
import tests.util.Captures;

public class HomePage extends BasePage {

	private By linkInvestidor = By.id("investidor");

	public void acessarSite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dimi_\\Desktop\\chrome\\chromedriver.exe");
		getDriver().get("https://vortx.com.br");

	}

	public void acessarInvestidor() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("investidor")));
		
		Captures captures = new Captures();
		captures.screenshot("1 Acessar link Investidor");

		super.clicarBotao(linkInvestidor);
	}

}
