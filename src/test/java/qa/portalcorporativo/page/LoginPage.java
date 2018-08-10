package qa.portalcorporativo.page;

import qa.portalcorporativo.core.BasePage;
import static qa.portalcorporativo.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	
	public void acessarTelaInicial() 
	{
		getDriver().get("http://server.target1.com.br:8895/");
	}
	
		
	public void aguardaCarregarPagina(int tempo) throws InterruptedException
	{
        esperaCarregar(tempo);
    }

    public void SetEmail(String email)
    {
        escreveId("Username", email);
    }

    public void SetSenha(String senha)
    {
        escreveId("Password", senha);
    }

    public void entrar()
    {
        clicarBotaoBy(By.tagName("button"));
    }

    public void selecionarEscola() throws InterruptedException
    {
        getDriver().findElement(By.xpath("//app-root/app-trocaescola/main[@role='main']/div[@class='content-960 mobile-row']//select")).click();
        esperaCarregar(3000);
        getDriver().findElement(By.cssSelector("[value='276']")).click();
    }

}
