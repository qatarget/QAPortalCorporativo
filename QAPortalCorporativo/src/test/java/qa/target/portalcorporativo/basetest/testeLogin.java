package qa.target.portalcorporativo.basetest;
import qa.target.portalcorporativo.core.DSL;
import qa.target.portalcorporativo.core.DriverFactory;
import org.junit.Test;

import qa.target.portalcorporativo.basepage.loginPage;

public class testeLogin {

	private DSL dsl = new DSL();
	private loginPage page = new loginPage();
	
	
	
	@Test
	public void deveRealizarAcessoSistema() {
		
		
		page.SetEmail("danilo@dmts.com.br");
		page.SetSenha("123456");
		page.ClicaBotao();		
		page.selecionarEscola();		
		page.ClicaBotao();
		
	}
}
