package test.pages;

import static test.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.core.BasePage;
import tests.util.Captures;

public class DashFIIPage extends BasePage {

	private By textoDashFII = By.xpath("//*[@id=\"__next\"]/div/section[1]/section/section[2]/div");
	private By linkDocumentos = By.id("2");
	

	public String conteudoDashFII() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/section[1]/section/section[2]/div")));
	
		Captures captures = new Captures();
		captures.screenshot("4 Conteúdo Dash de Investimentos FII");
		
		return super.obterTexto(textoDashFII);
	}
	
	public void acessarDocumentos() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("2")));
	
		super.clicarBotao(linkDocumentos);
	}

}
