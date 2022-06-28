package tests;

import manager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {

    static ApplicationManager app = new ApplicationManager();


    @BeforeSuite
    public void setUp(){
       app.init();
    }

    @AfterSuite
    public void tearDown(){
       app.stop();
    }

}
