package qa.portalcorporativo.tests;


import qa.portalcorporativo.page.MenuGerencialTagPage;
import org.junit.Test;
import qa.portalcorporativo.core.BaseTest;

public class MenuGerencialTagTest  extends BaseTest {

	MenuGerencialTagPage page = new MenuGerencialTagPage();
	
	@Test
	
	public void CadastrarNovaTag () throws InterruptedException {
	
		page.SetClicarMenuGerencial();
		page.SetClicarTAG();
		page.SetClicarNovoItem();
		page.SetEscreverNome();
		page.SetSelecionarCategoria();
		page.SetCategoria();
		page.SetAtivo();
		page.SetClicarSalvar();
	}
}
