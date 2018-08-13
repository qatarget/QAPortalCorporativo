package qa.portalcorporativo.tests;

import qa.portalcorporativo.core.BaseTest;
import qa.portalcorporativo.page.LoginPage;
import qa.portalcorporativo.page.MenuGerencialBackgroungPage;
import org.junit.Test;

public class MenuGerencialBackgroundTest extends BaseTest {

	MenuGerencialBackgroungPage page = new MenuGerencialBackgroungPage();
	LoginPage loginPage = new LoginPage();
	
	@Test
	public void CadastrarNovoBackground() throws InterruptedException {
		
		page.SetclicarMenuGerencial();
		page.SetClicarSubMenu();
		page.SetClicarNovoItem();
		page.SetEscreveTitulo();

	}

}
