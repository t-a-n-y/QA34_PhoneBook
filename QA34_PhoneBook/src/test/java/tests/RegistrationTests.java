package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

 @Test
    public void registrationSuccess(){
     app.getHelperUser().openLoginRegistrationForm();
     app.getHelperUser().fillLoginRegistrationForm("zara@gmail.com","Zzara123$");
     app.getHelperUser().submitRegistration();
 }



}
