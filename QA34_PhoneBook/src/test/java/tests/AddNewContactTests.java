package tests;


import models.Contact;
import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class AddNewContactTests extends TestBase {


    @BeforeMethod
    public void preCondition() {
      if(!app.getHelperUser().isLogged()){
          app.getHelperUser().login(new User().setEmail("tanya@gmail.ru").setPassword("Ttanya123$"));
      }

    }

    @Test
    public void addNewContactSuccess() {

        Random random = new Random();
        int i = random.nextInt(1000)+1000;

        Contact contact = Contact.builder()
                .name("Zoar"+i)
                .lastName("Hot")
                .phone("0503425566"+i)
                .email("zoar@gmail.com")
                .address("Haifa")
                .description("friend")
                .build();

        app.contact().openComtactForm();
        app.contact().fillContactForm(contact);
        app.contact().saveContact();

        Assert.assertTrue(app.contact().isContactAddedByName(contact.getName()));
    }


}
