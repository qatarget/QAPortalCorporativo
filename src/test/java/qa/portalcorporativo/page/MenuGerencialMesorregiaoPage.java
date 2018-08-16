package qa.portalcorporativo.page;

import org.openqa.selenium.By;
import qa.portalcorporativo.core.BasePage;




public class MenuGerencialMesorregiaoPage extends BasePage {
	
	public void SetClicarMenuGerencial() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotaoBy(By.xpath("//ul[@class='style-hover']//a[@title='Gerencial'][contains(text(),'Gerencial')]"));
	} 

	public void SetClicarMesorregiao() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotaoBy(By.linkText("MESORREGIÃO"));
		}

	public void SetClicarNovoItem() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotaoBy(By.cssSelector("[class='btn btn-sm btn-success btn-success-app p-2']"));
		
	}
	
	public void SetEscreverNome() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotaoBy(By.xpath("//app-root/app-main//app-mesoregiao/div[3]//form//app-mesoregiao-container-create/app-mesoregiao-field-create/div/section[1]//input[@name='nomeMesoRegiao']"));
		Thread.sleep(2000);
		escreveTexto(By.xpath("//app-root/app-main//app-mesoregiao/div[3]//form//app-mesoregiao-container-create/app-mesoregiao-field-create/div/section[1]//input[@name='nomeMesoRegiao']"), GeraMesorregiaoAleatorio());
		Thread.sleep(1000);

	}
	
	



}
