package tests;

import models.User;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{



 @Test
 public void registrationSuccess(){

  int i = (int)System.currentTimeMillis()/1000;

  User user = new User().setEmail("tata"+i+"gmail.com").setPassword("Ttata1234$");
  app.getHelperUser().openLoginRegistrationForm();
  app.getHelperUser().fillLoginRegistrationForm(user);
  app.getHelperUser().submitRegistration();

 }


}
