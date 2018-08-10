package qa.portalcorporativo.tests;

import org.junit.Test;

import qa.portalcorporativo.core.BaseTest;
import qa.portalcorporativo.page.MenuGerencialAreaPage;


public class MenuGerencialAreaTest extends BaseTest{
	
	MenuGerencialAreaPage page = new MenuGerencialAreaPage();
	
	@Test
	public void CadastrarNovaArea() throws InterruptedException {
		
		page.aguardarCarregarPagina(5000);
		page.SetClicarMenuGerencial();
		page.SetClicarSubMenu("ÁREA");
		page.aguardarCarregarPagina(3000);
		page.SetClicarBotaoNovoItem();
		page.aguardarCarregarPagina(2000);
		page.SetDepartamento("nome");
		page.aguardarCarregarPagina(1000);
		page.SetEmail("emailResponsavel");
		page.SetTextArea("textoContato", "Texto de Descrição");
		page.SetEhAtivo("ehAtivo");
		page.aguardarCarregarPagina(2000);
		page.SetClicarComboBox();
		page.aguardarCarregarPagina(2000);
		page.SetSelecionarCombo();
		page.aguardarCarregarPagina(2000);
		page.SetClicarBotaoSalvar();

	}
	

}
