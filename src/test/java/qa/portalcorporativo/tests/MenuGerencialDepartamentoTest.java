package qa.portalcorporativo.tests;


import qa.portalcorporativo.page.MenuGerencialDepartamentoPage;
import org.junit.Test;
import qa.portalcorporativo.core.BaseTest;

public class MenuGerencialDepartamentoTest  extends BaseTest{
	
	
MenuGerencialDepartamentoPage page = new MenuGerencialDepartamentoPage();
	
	@Test
	
	public void CadastrarNovoDepartamento() throws InterruptedException {
		
		page.SetClicarMenuGerencial();
		page.SetClicarDepartamento();
		page.SetClicarNovoItem();
		page.SetClicarNome();
		page.SetClicarDescrição();
		page.SetClicarEmail();
		page.SetClicarAtivo();
		page.SetSalvar();
		
	}
	

	

	

}
