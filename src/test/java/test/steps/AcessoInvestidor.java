package test.steps;

import java.io.IOException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import test.core.BaseTest;
import test.pages.DashFIIPage;
import test.pages.DocumentosPage;
import test.pages.FundosInvestimentosPage;
import test.pages.HomePage;
import test.pages.InvestidorPage;

public class AcessoInvestidor extends BaseTest {
	HomePage pageHome = new HomePage();
	InvestidorPage pageInvestidor = new InvestidorPage();
	FundosInvestimentosPage pageFundosInvestimentosPage = new FundosInvestimentosPage();
	DashFIIPage pageDashFII = new DashFIIPage();
	DocumentosPage pageDocumentos = new DocumentosPage();

	/************ Acesso Aos fundos de Investimentos *********/
	@Dado("que estou acessando o site da vortx")
	public void queEstouAcessandoOSiteDaVortx()   throws InterruptedException {
		pageHome.acessarSite();
	}

	@Quando("clico em Investidor em Navbar")
	public void clicoEmInvestidorEmNavbar() throws InterruptedException {
		pageHome.acessarInvestidor();
	}

	@E("seleciono fundo de investimento")
	public void selecionoFundoDeInvestimento() throws InterruptedException {
		pageInvestidor.AcessarFundos();
	}

	@E("seleciono a primeira opção de fundo de investimento")
	public void selecionoAPrimeiraOpçãoDeFundoDeInvestimento() throws InterruptedException {
		pageFundosInvestimentosPage.acessarPrimeiroFundoInvestimentos();

	}

	@Então ("valido as informações da dash do primeiro Fundo de Investimentos")
	public void validoAsInformaçõesDaDashDoPrimeiroFundoDeInvestimentos() throws InterruptedException, IOException {

		pageDashFII.conteudoDashFII();

	}
	
	
	@E ("clico em documentos") 
	public void clicoEmDocumentos () throws InterruptedException {
		pageDashFII.acessarDocumentos();
	}
	
	
	@Então ("faço download do segundo arquivo")
	public void façoDownloadDoSegundoArquivo() throws InterruptedException, IOException {
		pageDocumentos.fazerDownloadPdf();
		finaliza();
	}

}
