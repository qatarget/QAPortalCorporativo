package qa.target.portalcorporativo.basepage;

import org.openqa.selenium.By;
import qa.target.portalcorporativo.core.DSL;

public class MenuGerencialBackgroundPage {

	private DSL dsl = new DSL();

	public void aguardarCarregar(int tempo) throws InterruptedException 
	{
		dsl.esperaCarregar(tempo);
	}
	
	public void SetclicarMenuGerencial() {
		dsl.clicarBotaoBy(By.cssSelector(".menu-desktop .click-menu"));
	}
	
	public void SetClicarSubMenu(String menu) {

		dsl.clicarBotaoBy(By.linkText(menu));
	}
	
	public void SetClicarNovoItem() {
		dsl.clicarBotaoBy(By.cssSelector("[class='btn btn-sm btn-success btn-success-app p-2']"));
	}
	
	public void SetEscreveTitulo(String texto) {
		dsl.escreveTexto(By.className("titulo"), texto);
	}
	

}
