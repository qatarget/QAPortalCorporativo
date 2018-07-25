package qa.target.portalcorporativo.basepage;
import org.openqa.selenium.By;
import qa.target.portalcorporativo.core.DSL;
import qa.target.portalcorporativo.core.DriverFactory;


public class loginPage {

	private DSL dsl = new DSL();
	
	public void url(String url) 
	{
		dsl.maximizaJanela();
		DriverFactory.getDriver().get(url);
	}
	
	public void finalizaTest() {
		DriverFactory.killDriver();
	}
	
	public void aguardaCarregarPagina(int tempo) throws InterruptedException
	{
        dsl.esperaCarregar(tempo);
    }

    public void SetEmail(String email)
    {
        dsl.escreveId("Username", email);
    }

    public void SetSenha(String senha)
    {
        dsl.escreveId("Password", senha);
    }

    public void ClicaBotao()
    {
        dsl.clicarBotaoBy(By.tagName("button"));
    }

    public void selecionarEscola() throws InterruptedException
    {
        DriverFactory.getDriver().findElement(By.xpath("//app-root/app-trocaescola/main[@role='main']/div[@class='content-960 mobile-row']//select")).click();
        dsl.esperaCarregar(3000);
        DriverFactory.getDriver().findElement(By.cssSelector("[value='276']")).click();
    }	
    
}
