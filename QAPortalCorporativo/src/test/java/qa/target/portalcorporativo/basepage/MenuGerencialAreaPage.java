package qa.target.portalcorporativo.basepage;

import org.openqa.selenium.By;
import qa.target.portalcorporativo.core.DSL;

public class MenuGerencialAreaPage {

	private DSL dsl = new DSL();

	public void SetClicarMenuGerencial() {
		dsl.clicarBotaoBy(By.xpath("//ul[@class='style-hover']//a[@title='Gerencial'][contains(text(),'Gerencial')]"));
	}

	public void aguardarCarregarPagina(int tempo) throws InterruptedException  {
		dsl.esperaCarregar(tempo);
	}

	public void SetDepartamento(String nome) {
		dsl.escreveTexto(By.name(nome), dsl.geraDepartamentoAleatorio());
	}

	public void SetEmail(String campo) 
	{
		dsl.escreveTexto(By.name(campo), dsl.GeraEmailAleatorio());
	}

	public void SetTextArea(String campo, String texto) {
		dsl.escreveTexto(By.name(campo), texto);
	}

	public void SetClicarSubMenu(String menu) {

		dsl.clicarBotaoBy(By.linkText(menu));
	}
	
	public void SetSelecionarCombo() {
		dsl.clicarBotaoBy(By.xpath("//li[contains(text(),'Expansão')]"));
	}
	
	public void SetClicarBotaoSalvar() {
		dsl.clicarBotaoBy(By.xpath("//div[@class='gc-modal modal fade in show']//button[@type='submit'][contains(text(),'Salvar')]"));
	}
	
	public void SetClicarBotaoNovoItem() {
		dsl.clicarBotaoBy(By.xpath("//div[@class='col d-flex justify-content-end']//button[2]"));
	}
	
	public void SetEhAtivo(String campo) {
		dsl.clicarBotaoBy(By.name(campo));
	}
	
	public void SetClicarComboBox() {
		dsl.clicarBotaoBy(By.xpath("//section[@class='col-md-6']//span[@class='select2-selection select2-selection--single']"));
	}

}
