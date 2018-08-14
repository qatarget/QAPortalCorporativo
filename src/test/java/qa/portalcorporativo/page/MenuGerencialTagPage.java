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
}
