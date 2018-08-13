package qa.portalcorporativo.tests;

import org.junit.Test;
import qa.portalcorporativo.core.BaseTest;

import qa.portalcorporativo.page.MenuGerencialAreaPage;

public class MenuGerencialAreaTest extends BaseTest {

	MenuGerencialAreaPage page = new MenuGerencialAreaPage();
	
	@Test
	public void CadastrarNovaArea() throws InterruptedException {

		
		page.SetClicarMenuGerencial();
		page.SetClicarSubMenu();
		page.SetClicarBotaoNovoItem();
		page.SetDepartamento();
		page.SetEmail();
		page.SetTextArea("Texto de Descrição");
		page.SetEhAtivo();
		page.SetClicarComboBox();
		page.SetSelecionarCombo();
		page.SetClicarBotaoSalvar();

	}

}
