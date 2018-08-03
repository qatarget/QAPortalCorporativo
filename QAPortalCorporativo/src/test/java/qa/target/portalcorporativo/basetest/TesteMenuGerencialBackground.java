package qa.target.portalcorporativo.basetest;

import org.junit.Test;

public class TesteMenuGerencialBackground {
	
	private TesteLogin login = new TesteLogin();
	
	
	@Test
	public void CadastrarNovoBackgound() throws InterruptedException {
		
		login.deveRealizarAcessoSistema();
		
		
	}

}
