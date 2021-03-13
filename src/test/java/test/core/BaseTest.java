package test.core;

import java.io.IOException;

import org.junit.After;

public class BaseTest {
	
//	@Before
//	public void inicializar() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dimi_\\Desktop\\chrome\\chromedriver.exe");
//		getDriver().get("(https://vortx.com.br");
//		
//	}

	@After
	public void finaliza() throws IOException {
		DriverFactory.killDriver();
	}

}
