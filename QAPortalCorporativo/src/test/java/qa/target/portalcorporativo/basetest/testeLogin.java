package qa.target.portalcorporativo.basetest;
import qa.target.portalcorporativo.core.DSL;
import qa.target.portalcorporativo.core.DriverFactory;
import org.junit.Test;

import qa.target.portalcorporativo.basepage.loginPage;

public class testeLogin {

	private DSL dsl = new DSL();
	private loginPage page = new loginPage();
	
	
	
	@Test
	public void deveRealizarAcessoSistema() throws Exception {		
		
		
		page.url("http://server.target1.com.br:8895");
		page.aguardaCarregarPagina(3000);
		page.SetEmail("danilo@dmts.com.br");
		page.SetSenha("123456");		
		page.ClicaBotao();
		page.aguardaCarregarPagina(3000);
		page.selecionarEscola();	
		page.aguardaCarregarPagina(3000);
		page.ClicaBotao();
		
	}
}
