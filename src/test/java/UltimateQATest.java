import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;


public class UltimateQATest extends BaseTestSetup{


    @Test
    public void testOne(){
        WebElement buttonUsingId = driver.findElement(By.id("idExample"));
        Assertions.assertTrue(buttonUsingId.isDisplayed());
        buttonUsingId.click();

        WebElement textButtonSuccess = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals("Button success", textButtonSuccess.getText());
    }
    //input[@id="et_pb_contact_name_0"]
    // *[@placeholder='Name']
    //input[@id='et_pb_contact_name_0']   1 out of 1
    //input[@class='input et_contact_error']   1 out of 2
    //input[@class='input et_contact_error' and @id='et_pb_contact_name_0']
    //*[@class='et_pb_contact']/form[@class='et_pb_contact_form clearfix']/p/input
    //*[@class='et_pb_contact']/form[@class='et_pb_contact_form clearfix']//input
    //*[@class='et_pb_contact']/form[@class='et_pb_contact_form clearfix']//input[@id='et_pb_contact_name_0']
    //input[@placeholder='Name']
    //*[@placeholder='Name']
    //*[text()="Email Me!"]
    //*[contains(text(), 'Email Me')]
    //*[@id='et_pb_contact_form_0']/div/p
    //*[@id='et_pb_contact_form_0']//p



    //*[] - ogolna postac XPath
    @Test
    public void testTwo() throws InterruptedException {
        WebElement inputName = driver.findElement(By.xpath("//input[@id='et_pb_contact_name_0']"));
        inputName.sendKeys("Testerka");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='et_pb_contact_email_0']"));
        inputEmail.sendKeys("testerka@gmail.com");
        Thread.sleep(2000);

        WebElement buttonEmailMe = driver.findElement(By.xpath("//button[@class='et_pb_contact_submit et_pb_button']"));
        //.isSelected()
        Assertions.assertTrue(buttonEmailMe.isDisplayed());

        buttonEmailMe.click();

        Thread.sleep(2000);
        WebElement textThanks = driver.findElement(By.xpath("//*[@id='et_pb_contact_form_0']/div/p"));
        Assertions.assertEquals("Thanks for contacting us", textThanks.getText());


    }



}
