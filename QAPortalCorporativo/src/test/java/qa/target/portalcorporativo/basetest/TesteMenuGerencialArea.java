package qa.target.portalcorporativo.basetest;

import org.junit.Test;
import org.openqa.selenium.By;
import qa.target.portalcorporativo.basepage.MenuGerencialAreaPage;

public class TesteMenuGerencialArea {

	private TesteLogin login = new TesteLogin();
	private MenuGerencialAreaPage page = new MenuGerencialAreaPage();

	@Test
	public void CadastrarNovaArea() throws InterruptedException {

		login.deveRealizarAcessoSistema();
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
