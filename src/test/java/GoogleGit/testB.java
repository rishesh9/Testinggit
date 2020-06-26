package GoogleGit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testB extends testA{

    @BeforeSuite
    public void beforeSuiteB(){
        System.out.println("Before Suite B");
    }
    
    @BeforeTest
    public void beforeTestB(){
        System.out.println("Before Test B");
    }
    
    @BeforeClass
    public void beforeClassB(){
        System.out.println("Before Class B");
    }
    
    @BeforeMethod
    public void beforeMethodB(){
        System.out.println("Before Method B");
    }
    
    @AfterSuite
    public void afterSuiteB(){
        System.out.println("After Suite B");
    }
    
    @AfterTest
    public void afterTestB(){
        System.out.println("After Test B");
    }
    
    @Test
    public void letTestB(){
        System.out.println("Test B");
    }
    
    @AfterClass
    public void afterClassB(){
        System.out.println("After Class B");
    }
    
    @AfterMethod
    public void afterMethodB(){
        System.out.println("After Method B");
    }
}
