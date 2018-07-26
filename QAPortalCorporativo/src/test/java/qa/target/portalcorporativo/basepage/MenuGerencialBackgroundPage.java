package qa.target.portalcorporativo.basepage;

import org.openqa.selenium.By;
import qa.target.portalcorporativo.core.DSL;

public class MenuGerencialBackgroundPage {

	private DSL dsl = new DSL();

	public void aguardaCarregarPagina(int tempo) throws InterruptedException {
		dsl.esperaCarregar(tempo);
	}

	public void SetClicarMenu(By by) {
		dsl.clicarBotaoBy(by);
	}

	public void SetClicar(By by) {

		dsl.clicarBotaoBy(by);
	}
	
	
	public void SetEscreveTexto(By by, String texto) {
		dsl.escreveTexto(by, texto);
	}

}
