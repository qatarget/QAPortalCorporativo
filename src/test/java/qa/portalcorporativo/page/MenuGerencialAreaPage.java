package qa.portalcorporativo.page;

import org.openqa.selenium.By;

import qa.portalcorporativo.core.BasePage;

public class MenuGerencialAreaPage extends BasePage{

	public void SetClicarMenuGerencial() {
		clicarBotaoBy(By.xpath("//ul[@class='style-hover']//a[@title='Gerencial'][contains(text(),'Gerencial')]"));
	}

	public void aguardarCarregarPagina(int tempo) throws InterruptedException  {
		esperaCarregar(tempo);
	}

	public void SetDepartamento(String nome) {
		escreveTexto(By.name(nome), GeraDepartamentoAleatorio());
	}

	public void SetEmail(String campo) 
	{
		escreveTexto(By.name(campo), GeraEmailAleatorio());
	}

	public void SetTextArea(String campo, String texto) {
		escreveTexto(By.name(campo), texto);
	}

	public void SetClicarSubMenu(String menu) {

		clicarBotaoBy(By.linkText(menu));
	}
	
	public void SetSelecionarCombo() {
		clicarBotaoBy(By.xpath("//li[contains(text(),'Expansão')]"));
	}
	
	public void SetClicarBotaoSalvar() {
		clicarBotaoBy(By.xpath("//div[@class='gc-modal modal fade in show']//button[@type='submit'][contains(text(),'Salvar')]"));
	}
	
	public void SetClicarBotaoNovoItem() {
		clicarBotaoBy(By.xpath("//div[@class='col d-flex justify-content-end']//button[2]"));
	}
	
	public void SetEhAtivo(String campo) {
		clicarBotaoBy(By.name(campo));
	}
	
	public void SetClicarComboBox() {
		clicarBotaoBy(By.xpath("//section[@class='col-md-6']//span[@class='select2-selection select2-selection--single']"));
	}
}
