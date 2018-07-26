package qa.target.portalcorporativo.core;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;
import qa.target.portalcorporativo.core.DriverFactory;

public class DSL {

	private int randomiza(int n) {
		int ranNum = (int) (Math.random() * n);
		return ranNum;
	}

	private int mod(int dividendo, int divisor) {
		return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
	}

	/********* CNPJ, CPF, Pessoa, Empresa e E-mail ************/

	/**
	 * Gera CPF AleatÃ³rio com pontos ou sem pontos.
	 * @param comPontos
	 * @return
	 */
	public String geracpf(boolean comPontos) {
		int n = 9;
		int n1 = randomiza(n);
		int n2 = randomiza(n);
		int n3 = randomiza(n);
		int n4 = randomiza(n);
		int n5 = randomiza(n);
		int n6 = randomiza(n);
		int n7 = randomiza(n);
		int n8 = randomiza(n);
		int n9 = randomiza(n);
		int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

		d1 = 11 - (mod(d1, 11));

		if (d1 >= 10)
			d1 = 0;

		int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

		d2 = 11 - (mod(d2, 11));

		String retorno = null;

		if (d2 >= 10)
			d2 = 0;
		retorno = "";

		if (comPontos)
			retorno = "" + n1 + n2 + n3 + '.' + n4 + n5 + n6 + '.' + n7 + n8 + n9 + '-' + d1 + d2;
		else
			retorno = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + d1 + d2;

		return retorno;
	}

	public String gerarcnpj(boolean comPontos) {
		int n = 9;
		int n1 = randomiza(n);
		int n2 = randomiza(n);
		int n3 = randomiza(n);
		int n4 = randomiza(n);
		int n5 = randomiza(n);
		int n6 = randomiza(n);
		int n7 = randomiza(n);
		int n8 = randomiza(n);
		int n9 = 0; // randomiza(n);
		int n10 = 0; // randomiza(n);
		int n11 = 0; // randomiza(n);
		int n12 = 1; // randomiza(n);
		int d1 = n12 * 2 + n11 * 3 + n10 * 4 + n9 * 5 + n8 * 6 + n7 * 7 + n6 * 8 + n5 * 9 + n4 * 2 + n3 * 3 + n2 * 4
				+ n1 * 5;

		d1 = 11 - (mod(d1, 11));

		if (d1 >= 10)
			d1 = 0;

		int d2 = d1 * 2 + n12 * 3 + n11 * 4 + n10 * 5 + n9 * 6 + n8 * 7 + n7 * 8 + n6 * 9 + n5 * 2 + n4 * 3 + n3 * 4
				+ n2 * 5 + n1 * 6;

		d2 = 11 - (mod(d2, 11));

		if (d2 >= 10)
			d2 = 0;

		String retorno = null;

		if (comPontos)
			retorno = "" + n1 + n2 + "." + n3 + n4 + n5 + "." + n6 + n7 + n8 + "/" + n9 + n10 + n11 + n12 + "-" + d1
					+ d2;
		else
			retorno = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + d1 + d2;

		return retorno;
	}

	public String geraNomeAleatorio() {
		String[] nomes = { "Antonio", "Rafael", "Bruno", "Marcelo", "Alberto", "Pedro", "Anderson", "Airton", "Sidney",
				"Wilson", "Carlos", "Cï¿½ndido", "Hugo", "Joï¿½o", "Mauro", "Leonardo", "Natanael", "Reinaldo", "Orlando",
				"Tiago", "Gildo", "Alfredo", "Maurï¿½cio", "Jurandir", "Paulo", "Juvï¿½ncio", "Daniel", "Jair", "Juvenal",
				"Jorge" };
		String[] sobrenomes = { "Afonso", "Balera", "Seco", "Vieira", "Mendes", "Miyahira", "Garcia", "Cunha", "Santos",
				"Flï¿½vio" };
		String[] ultimoNome = { "Magalhï¿½es", "Alves", "Silva", "Pereira", "Mathias", "Camargo", "Moraes", "Rodrigues",
				"Fonseca", "Azevedo" };

		StringBuilder nomeAleatorio = new StringBuilder();

		nomeAleatorio.append(nomes[new Random().nextInt(29)]).append(" ").append(sobrenomes[new Random().nextInt(9)])
				.append(" de ").append(ultimoNome[new Random().nextInt(9)]).append(" ").append(this.hashCode());

		return nomeAleatorio.toString();
	}

	public String geraEmpresaAleatorio() {
		String[] nomes = { "atendimento", "contato", "orcamento", "despesa", "RH", "dp_", "recursos.humanos", "deposito",
				"gerente", "gestor", "diretoria", "almoxarifado", "balconista" };
		String[] sobrenomes = { "Auto", "Lar", "Seco", "Vieira", "Mendes", "Miyahira", "Garcia", "Cunha", "Santos",
				"FlÃ¡vio" };
		String[] ultimoNome = { "LTDA", "ME", "EIRELI", "S/A", "EPP" };

		StringBuilder empresaAleatorio = new StringBuilder();

		empresaAleatorio.append(nomes[new Random().nextInt(13)]).append(" ").append(sobrenomes[new Random().nextInt(9)])
				.append(" ").append(ultimoNome[new Random().nextInt(5)]).append(" ").append(this.hashCode());

		return empresaAleatorio.toString();
	}

	public String GeraEmailAleatorio() {
		String[] nomes = { "administracao", "adgomes", "afpres", "estagio", "ferramentaria", "alberflex", "figueiredo",
				"bastos", "atendimento", "medeiros", "cerac", "cityrh", "comercial", "financeiro", "contabilidade",
				"rh", "dp", "tecnologia", "consultoria", "contato", "curriculos", "cursos", "design", "cv",
				"diretoriabrasilmarcas", "disk", "eadiaurora", "easyte", "emprego", "exportacao" };
		String[] arroba = { "@" };
		String[] tag = { "targetqa" };
		String[] complemento = { ".com.br" };
		StringBuilder emailAleatorio = new StringBuilder();
		emailAleatorio.append(nomes[new Random().nextInt(29)]).append(arroba[new Random().nextInt(1)])
				.append(tag[new Random().nextInt(1)]).append(complemento[new Random().nextInt(1)]);
		return emailAleatorio.toString();
	}

	public String geraEstadoAleatorio() {
		String[] estados = { "Acre", "Alagoas", "AmapÃ¡", "Amazonas", "Bahia", "CearÃ¡", "Distrito Federal",
				"EspÃ­rito Santo", "GoiÃ¡s", "MaranhÃ£o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "ParanÃ¡",
				"ParaÃ­ba", "ParÃ¡", "Pernambuco", "PiauÃ­", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul",
				"RondÃ´nia", "Roraima", "Santa Catarina", "Sergipe", "SÃ£o Paulo", "Tocantins" };
		String[] tag = { "TARGET QA" };
		StringBuilder estadosAleatorio = new StringBuilder();
		estadosAleatorio.append(estados[new Random().nextInt(26)]).append(" ").append(tag[new Random().nextInt(1)])
				.append("");
		return estadosAleatorio.toString();
	}

	public String GeraMunicipioAleatorio() {
		String[] municipio = { "Abadia dos Dourados", "AbaetÃ©", "Abre-Campo", "Acaiaca", "AÃ§ucena", "Ã�gua Boa",
				"Ã�gua Comprida", "Aguanil", "Ã�guas Formosas", "Ã�guas Vermelhas", "AimorÃ©s", "Aiuruoca", "Alagoa",
				"Albertina", "AlÃ©m ParaÃ­ba", "Alfenas", "Alfredo Vasconcelos", "Almenara", "Alpercata" };
		String[] tag = { "TARGET QA" };
		StringBuilder estadosAleatorio = new StringBuilder();
		estadosAleatorio.append(municipio[new Random().nextInt(26)]).append(" ").append(tag[new Random().nextInt(1)])
				.append("");
		return estadosAleatorio.toString();
	}

	public String GeraRegiaoAleatorio() {
		String[] regiao = { "Norte", "Nordeste", "Centro-Oeste", "Sudeste", "Sul" };
		String[] tag = { "TARGET QA" };
		StringBuilder regiaoAleatorio = new StringBuilder();
		regiaoAleatorio.append(regiao[new Random().nextInt(5)]).append(" ").append(tag[new Random().nextInt(1)])
				.append("");
		return regiaoAleatorio.toString();
	}

	public String GeraDepartamentoAleatorio() {
		String[] departamento = { "Financeiro", "RH", "Comercial", "Tecnologia", "Administrativo", "ProduÃ§Ã£o",
				"Controladoria Auditoria", "Contas a Pagar", "Tesouraria", "Contas a Receber", "OrÃ§amentos",
				"Analise de CrÃ©dito", "CobranÃ§a", "RelaÃ§Ãµes com Mercadorias", "ManutenÃ§Ã£o", "Suprimentos", "PCP",
				"Engenharia Desenvolvimento de Novos Produtos", "Logistica estocagem prod. acabado",
				"Controle de Qualidade", "Planejamento / Controle", "Suporte a Clientes", "Marketing", "Contabilidade",
				"Faturamento Livros Fiscais", "Controle Patrimonial", "ImportaÃ§Ã£o", "RelaÃ§Ãµes Publicas", "Vendas",
				"ExportaÃ§Ã£o" };
		String[] tag = { "TARGET QA" };
		StringBuilder departamentoAleatorio = new StringBuilder();
		departamentoAleatorio.append(departamento[new Random().nextInt(30)]).append(" ")
				.append(tag[new Random().nextInt(1)]).append("");
		return departamentoAleatorio.toString();
	}

	public String GeraMesorregiaoAleatorio() {
		String[] mesorregiao = { "Agreste Alagoano", "Agreste Paraibano", "Agreste Pernambucano", "Agreste Potiguar",
				"Agreste Sergipano", "Araraquara/Central Paulista", "AraÃ§atuba", "Assis", "Baixadas LitorÃ¢neas",
				"Baixo Amazonas", "Bauru", "Borborema", "Campinas", "Campo das Vertentes", "Central EspÃ­rito-Santense",
				"Central Mineira", "Central Potiguar", "Centro Amazonense", "Centro de GoiÃ¡s", "Centro Fluminense",
				"Centro Maranhense", "Centro Ocidental Paranaense", "Centro Ocidental Rio-Grandense",
				"Centro Oriental Paranaense", "Centro Oriental Rio-Grandense", "Centro-Norte Baiano",
				"Centro-Norte de Mato Grosso do Sul", "Centro - Norte Piauiense", "Centro - Sul Baiano",
				"Centro - Sul Cearense", "Centro - Sul Mato - Grossense", "Centro - Sul Paranaense", "Distrito Federal",
				"Extremo Oeste Baiano", "Grande FlorianÃ³polis", "Itapetininga", "Jaguaribe", "Jequitinhonha",
				"Leste Alagoano", "Leste de GoiÃ¡s", "Leste de Mato Grosso do Sul", "Leste Maranhense", "Leste Potiguar",
				"Leste Rondoniense", "Leste Sergipano", "Litoral Norte EspÃ­rito - Santense", "Litoral Sul Paulista",
				"Macro Metropolitana Paulista", "Madeira - GuaporÃ©", "MarajÃ³", "MarÃ­lia", "Mata Paraibana",
				"Mata Pernambucana", "Metropolitana de Belo Horizonte", "Metropolitana de BelÃ©m",
				"Metropolitana de Curitiba", "Metropolitana de Fortaleza", "Metropolitana de Porto Alegre",
				"Metropolitana de Salvador", "Metropolitana de SÃ£o Paulo", "Metropolitana do Recife",
				"Metropolitana do Rio de Janeiro", "Nordeste Baiano", "Nordeste Mato-Grossense", "Nordeste Paraense",
				"Nordeste Rio-Grandense", "Noroeste Cearense", "Noroeste de GoiÃ¡s", "Noroeste de Minas",
				"Noroeste EspÃ­rito-Santense", "Noroeste Fluminense", "Noroeste Paranaense", "Noroeste Rio-Grandense",
				"Norte Amazonense", "Norte Catarinense", "Norte Cearense", "Norte Central Paranaense", "Norte de GoiÃ¡s",
				"Norte de Minas", "Norte de Roraima", "Norte do AmapÃ¡", "Norte Fluminense", "Norte Maranhense",
				"Norte Mato-Grossense", "Norte Piauiense", "Norte Pioneiro Paranaense", "Ocidental do Tocantins",
				"Oeste Catarinense", "Oeste de Minas", "Oeste Maranhense", "Oeste Paranaense", "Oeste Potiguar",
				"Oriental do Tocantins", "Pantanais Sul - Mato - Grossenses", "Piracicaba", "Presidente Prudente",
				"RibeirÃ£o Preto", "Serrana", "SertÃ£o Alagoano", "SertÃ£o Paraibano", "SertÃ£o Pernambucano",
				"SertÃ£o Sergipano", "SertÃµes Cearenses", "Sudeste Mato-Grossense", "Sudeste Paraense",
				"Sudeste Paranaense", "Sudeste Piauiense", "Sudeste Rio-Grandense", "Sudoeste Amazonense",
				"Sudoeste de Mato Grosso do Sul", "Sudoeste Mato - Grossense", "Sudoeste Paraense",
				"Sudoeste Paranaense", "Sudoeste Piauiense", "Sudoeste Rio-Grandense", "Sul Amazonense", "Sul Baiano",
				"Sul Catarinense", "Sul Cearense", "Sul de Roraima", "Sul do AmapÃ¡", "Sul e Sudoeste de Minas",
				"Sul EspÃ­rito - Santense", "Sul Fluminense", "Sul Goiano", "Sul Maranhense",
				"SÃ£o Francisco Pernambucano", "SÃ£o JosÃ© do Rio Preto", "TriÃ¢ngulo Mineiro e Alto ParanaÃ­ba",
				"Vale do Acre", "Vale do ItajaÃ­", "Vale do JuruÃ¡", "Vale do Mucuri", "Vale do ParaÃ­ba Paulista",
				"Vale do Rio Doce", "Vale SÃ£o - Franciscano da Bahia", "Zona da Mata" };
		String[] tag = { "TARGET QA" };
		StringBuilder mesorregiaoAleatorio = new StringBuilder();
		mesorregiaoAleatorio.append(mesorregiao[new Random().nextInt(137)]).append(" ")
				.append(tag[new Random().nextInt(1)]).append("");
		return mesorregiaoAleatorio.toString();
	}

	public void esperaCarregar(int tempo) throws InterruptedException {

		Thread.sleep(tempo);

	}

	public void escreveId(String id_campo, String texto) {
		escreveTexto(By.id(id_campo), texto);
	}

	public void escreveTexto(By by, String texto) {

		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}

	public void clicarBotaoBy(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}

	public void maximizaJanela() {

		DriverFactory.getDriver().manage().window().maximize();
	}

}