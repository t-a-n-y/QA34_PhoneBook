package tests;


import models.Contact;
import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewContact extends TestBase {


    @BeforeMethod
    public void preCondition() {
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginForm("tanya@gmail.ru", "Ttanya123$");
        app.getHelperUser().submitLogin();

    }

    @Test
    public void addNewContactSuccess() {

        Contact contact = Contact.builder()
                .name("Zoar")
                .lastName("Hot")
                .phone("0503425566")
                .email("zoar@gmail.com")
                .address("Haifa")
                .description("friend")
                .build();

        app.contact().openComtactForm();
        app.contact().fillContactForm(contact);
        app.contact().submit();
    }


}
