package qa.portalcorporativo.page;

import org.openqa.selenium.By;

import qa.portalcorporativo.core.BasePage;

public class MenuGerencialBackgroungPage extends BasePage {
	
	public void aguardarCarregar(int tempo) throws InterruptedException 
	{
		esperaCarregar(tempo);
	}
	
	public void SetclicarMenuGerencial() {
		clicarBotaoBy(By.cssSelector(".menu-desktop .click-menu"));
	}
	
	public void SetClicarSubMenu(String menu) {

		clicarBotaoBy(By.linkText(menu));
	}
	
	public void SetClicarNovoItem() {
		clicarBotaoBy(By.cssSelector("[class='btn btn-sm btn-success btn-success-app p-2']"));
	}
	
	public void SetEscreveTitulo(String texto) {
		escreveTexto(By.className("titulo"), texto);
	}
	
	public void SetRolarPagina(String rolagem) {
		RolarPagina(rolagem);
	}

}
