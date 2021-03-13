package test.pages;

import static test.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.core.BasePage;
import tests.util.Captures;

public class InvestidorPage extends BasePage {

	private By linkFundoInvestimento = By.xpath("//div//h2[contains(text(),'Fundos de Investimento')]");

	public void AcessarFundos() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//h2[contains(text(),'Fundos de Investimento')]")));
		
		Captures captures = new Captures();
		captures.screenshot("2 Acessar link Fundo de Investimentos");
		
		super.clicarBotao(linkFundoInvestimento);

	}

}
