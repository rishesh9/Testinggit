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

public class testA {

    @BeforeSuite
    public void beforeSuiteA(){
        System.out.println("Before Suite A");
    }
    
    @BeforeTest
    public void beforeTestA(){
        System.out.println("Before Test A");
    }
    
    @BeforeClass
    public void beforeClassA(){
        System.out.println("Before Class A");
    }
    
    @BeforeMethod
    public void beforeMethodA(){
        System.out.println("Before Method A");
    }
    
    @AfterSuite
    public void afterSuiteA(){
        System.out.println("After Suite A");
    }
    
    @AfterTest
    public void afterTestA(){
        System.out.println("After Test A");
    }
    
    @Test
    public void letTestA(){
        System.out.println("Test A");
    }
    
    @AfterClass
    public void afterClassA(){
        System.out.println("After Class A");
    }
    
    @AfterMethod
    public void afterMethodA(){
        System.out.println("After Method A");
    }
}
