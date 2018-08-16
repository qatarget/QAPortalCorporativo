package qa.target.portalcorporativo.basetest;
import org.junit.Test;

import qa.target.portalcorporativo.basepage.loginPage;

public class TesteLogin {

	private loginPage page = new loginPage();
	
	
	
	@Test
	public void deveRealizarAcessoSistema() throws InterruptedException {		
		
		
		page.url("http://server.target1.com.br:8895/");
		page.aguardaCarregarPagina(3000);
		page.SetEmail("danilozanutto@gmail.com");
		page.SetSenha("123456");		
		page.ClicaBotao();
		page.aguardaCarregarPagina(3000);
		page.selecionarEscola();	
		page.aguardaCarregarPagina(3000);
		page.ClicaBotao();
		page.aguardaCarregarPagina(5000);
		
	}
}