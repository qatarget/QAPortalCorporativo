package qa.portalcorporativo.page;

import org.openqa.selenium.By;
import qa.portalcorporativo.core.BasePage;




public class MenuGerencialMesorregiaoPage  extends BasePage{
	
	
	public void SetClicarGerencial () throws InterruptedException {
		Thread.sleep(2000);
		clicarBotaoBy(By.xpath("//ul[@class='style-hover']//a[@title='Gerencial'][contains(text(),'Gerencial')]"));
	} 
	
	public void SetClicarMesorregiao() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotaoBy(By.linkText("MESORREGIÃO"));
		}
	
	

}
