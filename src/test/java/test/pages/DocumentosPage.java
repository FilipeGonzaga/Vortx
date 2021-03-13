package test.pages;

import static test.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.core.BasePage;
import tests.util.Captures;

public class DocumentosPage extends BasePage{
	
	private By accordionDemonstracaoFinanceira = By.xpath("//*[@id=\"Demonstração Financeira\"]/p");
	private By linkPdf = By.xpath("//*[@id=\"doc-Demonstração Financeira\"]/a[2]/p");
	
	public void fazerDownloadPdf() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Demonstração Financeira\"]/p")));
		
		super.clicarBotao(accordionDemonstracaoFinanceira);
		
		Captures captures = new Captures();
		captures.screenshot("5 baixar PDF");
		
		super.clicarBotao(linkPdf);
		
		Thread.sleep(5000);
		
	}

}
