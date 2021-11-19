package steps;

import org.openqa.selenium.WebDriver;

import elementoweb.ElementoWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosTestes;

public class WebMotorsTest {
	MetodosTestes metodo = new MetodosTestes();
	ElementoWeb el = new ElementoWeb();
	

     WebDriver driver;
	
	@Given("que acesso o site da {string}")
	public void que_acesso_o_site_da(String site) {
	    metodo.abrirNavegador (site);
	    
	}

	@When("pesquiso veiculo {string}")
	public void pesquiso_veiculo(String texto) {
	    metodo.escrever(el.pesquisar, texto);
	    metodo.clicar(el.hondacity);
	}

	@Then("acesso listagem de estoque")
	public void acesso_listagem_de_estoque() {
	
	driver.quit();
	   
	}

	
	
}
