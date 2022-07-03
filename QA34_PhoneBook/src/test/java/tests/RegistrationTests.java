package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{



 @Test
 public void registrationSuccess(){
  int i = (int)System.currentTimeMillis()/1000;
  app.getHelperUser().openLoginRegistrationForm();
  app.getHelperUser().fillLoginRegistrationForm("noa"+i+"@gmail.com","Nnoa12345$");
  app.getHelperUser().submitRegistration();

 }


}
