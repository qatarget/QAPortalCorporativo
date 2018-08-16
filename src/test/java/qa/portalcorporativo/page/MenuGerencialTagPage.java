package qa.portalcorporativo.page;

import org.openqa.selenium.By;
import qa.portalcorporativo.core.BasePage;


public class MenuGerencialTagPage extends BasePage {

	public void SetClicarMenuGerencial() throws InterruptedException {
		Thread.sleep(1000);
		clicarBotaoBy(By.xpath("//ul[@class='style-hover']//a[@title='Gerencial'][contains(text(),'Gerencial')]"));
	} 

	public void SetClicarTAG() throws InterruptedException {
		Thread.sleep(1000);
		clicarBotaoBy(By.linkText("TAG"));
		}
	
	public void SetClicarNovoItem() throws InterruptedException {
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector("[class='btn btn-sm btn-success btn-success-app p-2']"));
		
		
	}
	
	
	public void SetEscreverNome() throws InterruptedException {
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector(".form-control.ng-touched"));
		Thread.sleep(2000);
		escreveTexto(By.cssSelector(".form-control.ng-touched"), geraNomeAleatorio());
		Thread.sleep(1000);
		
	}
	
	public void SetSelecionarCategoria () throws InterruptedException{
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector(".ng-touched .select2-selection__arrow"));
		Thread.sleep(1000);
	}
	
	public void SetCategoria () throws InterruptedException {
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector(".select2-search__field"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector(".select2-search__field"), "texto");
		Thread.sleep(1000);
	}
	
	public void SetAtivo () throws InterruptedException {
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector("[formcontrolname='ehAtivo']"));
		Thread.sleep(1000);
		}
	
	public void SetClicarSalvar () throws InterruptedException {
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector("app-tag [aria-hidden] .btn-success-app"));
		Thread.sleep(1000);
	}
}
