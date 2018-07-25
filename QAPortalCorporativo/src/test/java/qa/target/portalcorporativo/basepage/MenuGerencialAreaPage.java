package qa.target.portalcorporativo.basepage;

import org.openqa.selenium.By;
import qa.target.portalcorporativo.core.DSL;

public class MenuGerencialAreaPage {

	private DSL dsl = new DSL();

	public void SetClicarMenu(By by) {
		dsl.clicarBotaoBy(by);
	}

	public void aguardarCarregarPagina(int tempo) throws InterruptedException  {
		dsl.esperaCarregar(tempo);
	}

	public void SetDepartamento(By by) {
		dsl.escreveTexto(by, dsl.GeraDepartamentoAleatorio());
	}

	public void SetEmail(By by) {
		dsl.escreveTexto(by, dsl.GeraEmailAleatorio());
	}

	public void SetTextArea(By by, String texto) {
		dsl.escreveTexto(by, texto);
	}

	public void SetClicarBotao(By by) {

		dsl.clicarBotaoBy(by);
	}
	
	

}
