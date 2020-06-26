package GoogleGit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.TestBaseclass;



public class googleclass extends TestBaseclass{




			public googleclass() {
				super();
			}
			
			@BeforeMethod
			public void setUp()
			{
				initialization();

	}
			
			@Test(priority=1)
			public void googleclasstest() {
			String s=	driver.getTitle();
				System.out.println("Your url title :"+s);
			}
			
			@AfterMethod
			public void tearDown() {
				driver.quit();
			}
			
			

}
