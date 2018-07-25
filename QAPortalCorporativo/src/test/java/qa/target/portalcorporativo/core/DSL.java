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
		int n9 = 0; //randomiza(n);
		int n10 = 0; //randomiza(n);
		int n11 = 0; //randomiza(n);
		int n12 = 1; //randomiza(n);
		int d1 = n12 * 2 + n11 * 3 + n10 * 4 + n9 * 5 + n8 * 6 + n7 * 7 + n6 * 8 + n5 * 9 + n4 * 2 + n3 * 3 + n2 * 4 + n1 * 5;

		d1 = 11 - (mod(d1, 11));

		if (d1 >= 10)
			d1 = 0;

		int d2 = d1 * 2 + n12 * 3 + n11 * 4 + n10 * 5 + n9 * 6 + n8 * 7 + n7 * 8 + n6 * 9 + n5 * 2 + n4 * 3 + n3 * 4 + n2 * 5 + n1 * 6;

		d2 = 11 - (mod(d2, 11));

		if (d2 >= 10)
			d2 = 0;

		String retorno = null;

		if (comPontos)
			retorno = "" + n1 + n2 + "." + n3 + n4 + n5 + "." + n6 + n7 + n8 + "/" + n9 + n10 + n11 + n12 + "-" + d1 + d2;
		else
			retorno = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + d1 + d2;

		return retorno;
	}
	
	
	public String geraNomeAleatorio()
    {
        String[] nomes = { "Antonio", "Rafael", "Bruno", "Marcelo", "Alberto", "Pedro", "Anderson", "Airton", "Sidney", "Wilson", "Carlos", "C�ndido", "Hugo", "Jo�o", "Mauro", "Leonardo", "Natanael", "Reinaldo", "Orlando", "Tiago", "Gildo", "Alfredo", "Maur�cio", "Jurandir", "Paulo", "Juv�ncio", "Daniel", "Jair", "Juvenal", "Jorge" };
        String[] sobrenomes = { "Afonso", "Balera", "Seco", "Vieira", "Mendes", "Miyahira", "Garcia", "Cunha", "Santos", "Fl�vio" };
        String[] ultimoNome = { "Magalh�es", "Alves", "Silva", "Pereira", "Mathias", "Camargo", "Moraes", "Rodrigues", "Fonseca", "Azevedo" };

        StringBuilder nomeAleatorio = new StringBuilder();

        nomeAleatorio.append(nomes[new Random().nextInt(29)])
                     .append(" ")
                     .append(sobrenomes[new Random().nextInt(9)])
                     .append(" de ")
                     .append(ultimoNome[new Random().nextInt(9)])
                     .append(" ")
                     .append(this.hashCode());

        return nomeAleatorio.toString();
    }
	
	
	public String geraEmpresaAleatorio()
    {
        String[] nomes = { "atendimento","contato", "orcamento", "despesa", "RH", "dp", "recursos.humanos", "deposito", "gerente", "gestor", "diretoria", "almoxarifado", "balconista"};
        String[] sobrenomes = { "Auto", "Lar", "Seco", "Vieira", "Mendes", "Miyahira", "Garcia", "Cunha", "Santos", "Flávio" };
        String[] ultimoNome = { "LTDA", "ME", "EIRELI", "S/A", "EPP" };

        StringBuilder empresaAleatorio = new StringBuilder();

        empresaAleatorio.append(nomes[new Random().nextInt(13)])
                     .append(" ")
                     .append(sobrenomes[new Random().nextInt(9)])
                     .append(" ")
                     .append(ultimoNome[new Random().nextInt(5)])
                     .append(" ")
                     .append(this.hashCode());

        return empresaAleatorio.toString();
    }
	
	public String geraEmailAleatorio()
    {
        String[] nomes = { "A Rates", "Integrid", "Sun", "J & J", "Grill", "Grafic", "TOP GUN", "Balon Balon", "Destiny", "The Angels", "Quantum", "Place", "Unconventional", "Metro", "Samurai", "Simpson", "Natanael", "Wall", "Orlando", "Street", "Gildo", "Coca", "MicroL", "Jurask", "UMO", "ARDIDAS", "WeDoLogos", "CaraLivro", "Juvenal", "DEMINU" };
        String[] arroba = {"@"} ;
        String[] ultimoNome = { "Auto", "Lar", "Seco", "Vieira", "Mendes", "Miyahira", "Garcia", "Cunha", "Santos", "Flvio", "LTDA", "ME", "EIRELI", "S/A", "EPP" };
        String[] complemento = {".com.br"};

        StringBuilder emailAleatorio = new StringBuilder();

        emailAleatorio.append(nomes[new Random().nextInt(29)])
                      .append(arroba[new Random().nextInt(1)])
                      .append(ultimoNome[new Random().nextInt(5)])
                      .append(complemento[new Random().nextInt(1)]);
                      

        return emailAleatorio.toString();
    }	
	
	public void esperaCarregar(int tempo) throws Exception
    {
        Thread.sleep(tempo);

    } 
	
	public void escreveId(String id_campo, String texto)
    {
        escreveTexto(By.id(id_campo), texto);
    }
	
	public void escreveTexto(By by, String texto)
    {
        
        DriverFactory.getDriver().findElement(by).sendKeys(texto);
    }
	
	public void clicarBotaoBy(By by)
    {
        DriverFactory.getDriver().findElement(by).click();
    }

	public void maximizaJanela() {
		
		DriverFactory.getDriver().manage().window().maximize();
	}
	
}