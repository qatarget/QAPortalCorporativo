package qa.portalcorporativo.page;

import org.openqa.selenium.By;
import qa.portalcorporativo.core.BasePage;


public class MenuGerencialTagPage extends BasePage {

	public void SetClicarMenuGerencial() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotaoBy(By.xpath("//ul[@class='style-hover']//a[@title='Gerencial'][contains(text(),'Gerencial')]"));
	} 

	public void SetClicarTAG() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotaoBy(By.linkText("TAGS"));
		}
	
	public void SetClicarNovoItem() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotaoBy(By.cssSelector("[class='btn btn-sm btn-success btn-success-app p-2']"));
		
		
	}
	
	
	public void SetEscreverNome() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotaoBy(By.xpath("//app-root/app-main//app-tag/div[3]//form//app-tag-container-create/div/section[1]//input[@name='nome']"));
		Thread.sleep(2000);
		escreveTexto(By.xpath("//app-root/app-main//app-tag/div[3]//form//app-tag-container-create/div/section[1]//input[@name='nome']"), geraNomeAleatorio());
		Thread.sleep(1000);
		
	}
	
	public void SetSelecionarCategoria () throws InterruptedException{
		Thread.sleep(2000);
		clicarBotaoBy(By.xpath("//app-root/app-main//app-tag/div[3]//form//app-tag-container-create/div/section[2]/div/span//span[@role='combobox']"));
		Thread.sleep(1000);
	}
	
	public void SetCategoria () throws InterruptedException {
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector(".select2-search__field"));
		Thread.sleep(2000);
		escreveTexto(By.cssSelector(".select2-search__field"), "Pedagógico");
		Thread.sleep(2000);
		clicarBotaoBy(By.cssSelector(".select2-results__options .select2-results__option:nth-of-type(2)"));
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
