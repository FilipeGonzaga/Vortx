package test.pages;

import static test.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.core.BasePage;
import tests.util.Captures;

public class FundosInvestimentosPage extends BasePage{

	private By linkPrimeiroFundo = By.xpath("//a//div[contains(text(),'FII - XP LOG FUNDO DE INVESTIMENTO IMOBILIARIO  ')]");
	
	public void acessarPrimeiroFundoInvestimentos() {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a//div[contains(text(),'FII - XP LOG FUNDO DE INVESTIMENTO IMOBILIARIO  ')]")));
		
		Captures captures = new Captures();
		captures.screenshot("3 Acessar Primeiro Fundo");
		
		super.clicarBotao(linkPrimeiroFundo);
		
	}
}
