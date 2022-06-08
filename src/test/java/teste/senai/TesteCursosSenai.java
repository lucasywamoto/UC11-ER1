package teste.senai;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;


public class TesteCursosSenai {

	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.gecko.driver","/Library/webdriver/geckodriver");
		FirefoxOptions options = new FirefoxOptions();
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize(); 
	}
	
	@Test
	public void TesteNavegabilidade() {
		driver.get("https://informatica.sp.senai.br");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
		
	}
	
}
