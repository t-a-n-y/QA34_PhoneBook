package manager;

import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelperContact extends HelperBase {
    public HelperContact(WebDriver wd) {
        super(wd);
    }

    public void openComtactForm() {
        click(By.cssSelector("a[href='/add']"));
    }


    public void fillContactForm(Contact contact) {
        type(By.cssSelector("input[placeholder='Name']"), contact.getName());
        type(By.cssSelector("input[placeholder='Last Name']"), contact.getLastName());
        type(By.cssSelector("input[placeholder='Phone']"), contact.getPhone());
        type(By.cssSelector("input[placeholder='email']"), contact.getEmail());
        type(By.cssSelector("input[placeholder='Address']"), contact.getAddress());
        type(By.cssSelector("input[placeholder='description']"), contact.getDescription());
    }


    public void saveContact() {
        click(By.cssSelector("b"));
    }

    public boolean isContactAddedByName(String name) {
        wd.findElements(By.cssSelector("h2"));
        List<WebElement> names = wd.findElements(By.cssSelector("h2"));
        for (WebElement el : names) {
            if (el.getText().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // public void saveContact2() {
    //    wd.findElement(By.cssSelector("[placeholder='description']")).sendKeys(Keys.TAB);
    //    wd.findElement(By.cssSelector(".add_form__2rsm2 button")).sendKeys(Keys.ENTER);

   // }
}
