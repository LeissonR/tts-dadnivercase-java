package steps;

import entities.AniversarioPai;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.cucumber.spring.CucumberContextConfiguration;
import pages.HomePage;
import runner.RunCucumberTest;

@CucumberContextConfiguration
public class TtsStep extends RunCucumberTest{
	
	HomePage homePage = new HomePage(driver);
	
	AniversarioPai niver = new AniversarioPai();
	
	@Dado("que estou na página inicial do Natural Readers")
	public void que_estou_na_página_inicial_do_natural_readers() {
	homePage.acessarAplicacao();   
	homePage.scrollDown();
	homePage.selecionarVoz();
	}
	
	@Quando("eu insiro o texto no campo de entrada")
	public void eu_insiro_o_texto_no_campo_de_entrada() {
	homePage.preencheComTexto(niver.textoNiver());   
	}
	
	@Quando("eu clico no botão de reprodução")
	public void eu_clico_no_botão_de_reprodução() {
		homePage.clickReproducao();   
	
	try {
		Thread.sleep(80000);
	} 
	catch (InterruptedException e) {
	e.printStackTrace();
	}
	}
	
	@Então("o texto é reproduzido corretamente")
	public void o_texto_é_reproduzido_corretamente() {
	   
	}
	
	
}
