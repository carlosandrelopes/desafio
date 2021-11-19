package metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosTestes {

	WebDriver driver;

	
		public void abrirNavegador(String site) {
			try {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			} catch (Exception e) {
				System.err.println("-------- erro ao abrir navegedor -------- " + e.getMessage());
				System.err.println("-------- causa do erro -------- " + e.getCause());
			}
		}

		
		public void escrever(By elemento, String texto) {
			try {
				driver.findElement(elemento).sendKeys(texto);
			} catch (Exception e) {
				System.err.println("-------- erro ao escrever -------- " + e.getMessage());
				System.err.println("-------- causa do erro -------- " + e.getCause());
			}
		}

		
		public void clicar(By elemento) {
			try {
				driver.findElement(elemento).click();
			} catch (Exception e) {
				System.err.println("-------- erro ao clicar -------- " + e.getMessage());
				System.err.println("-------- causa do erro -------- " + e.getCause());
			}
		}

	
	}

