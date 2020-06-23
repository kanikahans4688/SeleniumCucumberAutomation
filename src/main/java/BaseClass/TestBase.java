package BaseClass;



import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	

	
	
		
	public static WebDriver driver;
	public static Properties prop;
		
		
		public TestBase()  {
			
			
			try {
				prop = new Properties();
				
				FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/wordpress/config/config.properties");
					prop.load(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} 
			
			
			
		
		
		
		public static void intialization() {
			
			String browserName=prop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChromeDriver\\chromedriver.exe");
			      
				driver =new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().deleteAllCookies();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get(prop.getProperty("url"));
				
				
			}
		}
}
			
			
			
			
			
			
			
			
		

	







