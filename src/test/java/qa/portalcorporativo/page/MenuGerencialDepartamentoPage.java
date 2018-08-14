package qa.portalcorporativo.page;

import org.openqa.selenium.By;
import qa.portalcorporativo.core.BasePage;

public class MenuGerencialDepartamentoPage extends BasePage {

	public void SetClicarMenuGerencial() throws InterruptedException {
		Thread.sleep(1000);
		clicarBotaoBy(By.xpath("//ul[@class='style-hover']//a[@title='Gerencial'][contains(text(),'Gerencial')]"));
	}

			
	public void SetClicarDepartamento() throws InterruptedException {
	
	clicarBotaoBy(By.linkText("DEPARTAMENTO"));
	Thread.sleep(2000);
	}
	
	public void SetClicarNovoItem () throws InterruptedException {
	
		clicarBotaoBy(By.cssSelector("[class='btn btn-sm btn-success btn-success-app p-2']"));
		Thread.sleep(2000);
		
	}
	
	public void SetClicarNome() throws InterruptedException {
		
		clicarBotaoBy(By.xpath("//app-root/app-main//app-departamento/div[3]//form//app-departamento-container-create/div/section[1]//input[@name='nmDepartamento']"));
		Thread.sleep(2000);
		escreveTexto(By.xpath("//app-root/app-main//app-departamento/div[3]//form//app-departamento-container-create/div/section[1]//input[@name='nmDepartamento']"), geraNomeAleatorio());
	}
	
	public void SetClicarDescrição() throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("textarea"));
		Thread.sleep(2000);
		escreveTexto(By.cssSelector("textarea"), "TesteQA");
	}
	
	public void SetClicarEmail() throws InterruptedException {
		
		clicarBotaoBy(By.cssSelector("[class='col-md-6']:nth-of-type(3) [autocomplete]"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector("[class='col-md-6']:nth-of-type(3) [autocomplete]"), GeraEmailAleatorio());
	}
	
	public void SetClicarAtivo() throws InterruptedException {
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector("[formcontrolname='ehAtivo']"));
	}
	
	
	public void SetSalvar() throws InterruptedException {
		
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector("[aria-hidden] .btn-success-app"));
		
	}
}	
