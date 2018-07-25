package qa.target.portalcorporativo.basetest;

import org.junit.Test;
import org.openqa.selenium.By;
import qa.target.portalcorporativo.basepage.MenuGerencialAreaPage;

public class TesteMenuGerencialArea {

	private TesteLogin login = new TesteLogin();
	private MenuGerencialAreaPage page = new MenuGerencialAreaPage();

	@Test
	public void CadastrarNovaArea() throws InterruptedException {

		login.deveRealizarAcessoSistema();
		page.aguardarCarregarPagina(5000);
		page.SetClicarMenu(By.xpath("//ul[@class='style-hover']//a[@title='Gerencial'][contains(text(),'Gerencial')]"));
		page.SetClicarBotao(By.linkText("ÁREA"));
		page.aguardarCarregarPagina(3000);
		page.SetClicarBotao(By.xpath("//div[@class='col d-flex justify-content-end']//button[2]"));
		page.aguardarCarregarPagina(2000);
		page.SetDepartamento(By.name("nome"));
		page.aguardarCarregarPagina(1000);
		page.SetEmail(By.name("emailResponsavel"));
		page.SetTextArea(By.name("textoContato"), "Texto de Descrição");
		page.SetClicarBotao(By.name("ehAtivo"));
		page.aguardarCarregarPagina(2000);
		page.SetClicarBotao(By.xpath("//section[@class='col-md-6']//span[@class='select2-selection select2-selection--single']"));
		page.aguardarCarregarPagina(2000);
		page.SetClicarBotao(By.xpath("//li[contains(text(),'Expansão')]"));
		page.aguardarCarregarPagina(2000);
		page.SetClicarBotao(By.xpath("//div[@class='gc-modal modal fade in show']//button[@type='submit'][contains(text(),'Salvar')]"));

	}
}
