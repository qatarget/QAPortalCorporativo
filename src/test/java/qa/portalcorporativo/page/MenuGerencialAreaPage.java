package qa.portalcorporativo.page;

import org.openqa.selenium.By;

import qa.portalcorporativo.core.BasePage;

public class MenuGerencialAreaPage extends BasePage {

	public void SetClicarMenuGerencial() throws InterruptedException {
		aguardarCarregarPagina(2000);
		clicarBotaoBy(By.xpath("//ul[@class='style-hover']//a[@title='Gerencial'][contains(text(),'Gerencial')]"));
	}

	public void aguardarCarregarPagina(int tempo) throws InterruptedException {
		esperaCarregar(tempo);
	}

	public void SetDepartamento() throws InterruptedException {
		
		aguardarCarregarPagina(2000);
		escreveTexto(By.name("nome"), GeraDepartamentoAleatorio());
	}

	public void SetEmail() throws InterruptedException {
		
		aguardarCarregarPagina(1000);
		escreveTexto(By.name("emailResponsavel"), GeraEmailAleatorio());
	}

	public void SetTextArea(String texto) {
		escreveTexto(By.name("textoContato"), texto);
	}

	public void SetClicarSubMenu() {

		clicarBotaoBy(By.linkText("Ã�REA"));
	}

	public void SetSelecionarCombo() throws InterruptedException {
		
		aguardarCarregarPagina(2000);
		clicarBotaoBy(By.xpath("//li[contains(text(),'ExpansÃ£o')]"));
	}

	public void SetClicarBotaoSalvar() throws InterruptedException {
		
		aguardarCarregarPagina(2000);
		clicarBotaoBy(By.xpath(
				"//div[@class='gc-modal modal fade in show']//button[@type='submit'][contains(text(),'Salvar')]"));
	}

	public void SetClicarBotaoNovoItem() throws InterruptedException {
		aguardarCarregarPagina(3000);
		clicarBotaoBy(By.xpath("//div[@class='col d-flex justify-content-end']//button[2]"));
	}

	public void SetEhAtivo() {
		clicarBotaoBy(By.name("ehAtivo"));
	}

	public void SetClicarComboBox() throws InterruptedException {
		
		aguardarCarregarPagina(2000);
		clicarBotaoBy(
				By.xpath("//section[@class='col-md-6']//span[@class='select2-selection select2-selection--single']"));
	}
}
