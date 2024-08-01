package SeleniumClass.SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPage 
{	@Test(dependsOnMethods= {"testcase2","testcase3"})  
public void testcase1()  
{  
    System.out.println("This is test case1");  
}  
@Test  
public void testcase2()  
{  
    System.out.println("This is test case2");  
}  
@Test  
public void testcase3()  
{  
    System.out.println("This is test case3");  
}  
  
 
	
    public static void main( String[] args ) {
//    	TestPage ref = new TestPage();
//    	ref.login();
//    	ref.close();
    	
   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop");
 
    
}
}
