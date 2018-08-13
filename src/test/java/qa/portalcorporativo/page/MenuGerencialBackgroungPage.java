package qa.portalcorporativo.page;

import org.openqa.selenium.By;

import qa.portalcorporativo.core.BasePage;

public class MenuGerencialBackgroungPage extends BasePage {
	
	public void aguardarCarregar(int tempo) throws InterruptedException 
	{
		esperaCarregar(tempo);
	}
	
	public void SetclicarMenuGerencial() throws InterruptedException {
		esperaCarregar(5000);
		clicarBotaoBy(By.cssSelector(".menu-desktop .click-menu"));
	}
	
	public void SetClicarSubMenu() throws InterruptedException {
		
		esperaCarregar(2000);
		clicarBotaoBy(By.linkText("BACKGROUND"));
	}
	
	public void SetClicarNovoItem() throws InterruptedException {
		
		esperaCarregar(2000);
		clicarBotaoBy(By.cssSelector("[class='btn btn-sm btn-success btn-success-app p-2']"));
	}
	
	/***
	 * Gera título automaticamente.
	 * @throws InterruptedException
	 */
	public void SetEscreveTitulo() throws InterruptedException {
		
		esperaCarregar(2000);
		//clicarBotaoBy(By.name("titulo"));
		escreveTexto(By.name("titulo"), GerarTituloAleatorio());
	}
	
	public void SetRolarPagina(String rolagem) {
		RolarPagina(rolagem);
	}
	
	public void SetProcurarImage() {
		
		clicarBotaoBy(By.xpath("//button[contains(text(),'Procurar')]"));
		
	}

}
