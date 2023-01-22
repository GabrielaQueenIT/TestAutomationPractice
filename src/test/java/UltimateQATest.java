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


}
