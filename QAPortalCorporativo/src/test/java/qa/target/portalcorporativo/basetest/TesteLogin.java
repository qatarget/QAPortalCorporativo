package qa.target.portalcorporativo.basetest;
import qa.target.portalcorporativo.core.DSL;
import qa.target.portalcorporativo.core.DriverFactory;
import org.junit.Test;

import qa.target.portalcorporativo.basepage.loginPage;

public class TesteLogin {

	private DSL dsl = new DSL();
	private loginPage page = new loginPage();
	
	
	
	@Test
	public void deveRealizarAcessoSistema() throws InterruptedException {		
		
		
		page.url("https://portal-stage.portalcna.com.br");
		page.aguardaCarregarPagina(3000);
		page.SetEmail("danilo@dmts.com.br");
		page.SetSenha("123456");		
		page.ClicaBotao();
		page.aguardaCarregarPagina(3000);
		page.selecionarEscola();	
		page.aguardaCarregarPagina(3000);
		page.ClicaBotao();
		page.aguardaCarregarPagina(5000);
		
	}
}