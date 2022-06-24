package teste;

//import static org.junit.Assert.;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptTest {


	@Test
	public void test() {
		System.setProperty("webdriver.chrome.dirver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver nav = (WebDriver) new ChromeDriver();
		
		nav.get("https://training-wheels-protocol.herokuapp.com/login");
		
		
		nav.findElement(By.name("username")).sendKeys("stark");
		nav.findElement(By.name("password")).sendKeys("jarvis!");

		nav.findElement(By.xpath("//button[@class ='radius btn-login']")).click();
		
		
		
		WebElement strvalue = nav.findElement(By.xpath("//h4[@class ='subheader']"));
		String expected  = "Bem-vindo à área logada. Quando terminar, clique em logout.";
		String actual = strvalue.getText();
		System.out.println("mensagem é: "+ actual);

    if(expected.equals(actual)){
        System.out.println("Pass");
    }
        else {
            System.out.println("Fail");
        }
	}

}
