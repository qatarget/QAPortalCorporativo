package qa.portalcorporativo.core;

import static qa.portalcorporativo.core.DriverFactory.getDriver;
//import static qa.portalcorporativo.core.DriverFactory.killDriver;
import qa.portalcorporativo.page.LoginPage;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {

	@Rule
	public TestName testName = new TestName();

	private LoginPage page = new LoginPage();

	@Before
	public void inicializa() throws InterruptedException {
		page.acessarTelaInicial();
		page.SetEmail("danilozanutto@gmail.com");
		page.SetSenha("123456");
		page.entrar();
		page.aguardaCarregarPagina(2000);
		page.selecionarEscola();
		page.entrar();
		page.aguardaCarregarPagina(6000);
	}

	@After
	public void finaliza() throws IOException 
	{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File print = ss.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(print, new File("target" + File.separator + "screenshot" + File.separator
				+ testName.getMethodName() +  ".jpg"));

	//	if (Propriedades.FECHAR_BROWSER) {
		//	killDriver();
	//	}
	}

}
