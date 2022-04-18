/*3. Write down the following test into ‘LoginTest’ class
1. userShouldNavigateToLoginPageSuccessfully
* click on the ‘Login’ link
* Verify the text ‘Welcome, Please Sign
 In!’
2. userShouldLoginSuccessfullyWithValidCredentials
* click on the ‘Login’ link
* Enter valid username
* Enter valid password
* Click on ‘LOGIN’ button
* Verify the ‘Log out’ text is display
3. verifyTheErrorMessage
* click on the ‘Login’ link
* Enter invalid username
* Enter invalid password
* Click on Login button
* Verify the error message ‘Login was unsuccessful.
 Please correct the errors and try again. No customer account found'*/

package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully()
    {
        //Find log in Link and Click on Login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";//variable insilition
        //Find the welcome text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println("Actual Message :" + actualMessage);

        //Validate actual and expected message
        Assert.assertEquals("Message is not as expected", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        //Find log in Link and Click on Login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        WebElement Username = driver.findElement(By.name("Email"));//Find the Username field
        Username.sendKeys("kag@gmail.com");
        WebElement password = driver.findElement(By.name("Password"));//Find the password field
        password.sendKeys("kag123");
        WebElement loginbtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));//Find the login button field and click
        loginbtn.click();

        String ExpectedLoDisplay = "Log out";//This is project requirement
        WebElement logoutDisplay = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));//find the logout element and compare with expected
        String ActualLoDisplay = logoutDisplay.getText();
        System.out.println("Log Out Acaual Dispaly Is:"+ActualLoDisplay);

        Assert.assertEquals("Log Out Display Is Not As Per Project Requirement:",ExpectedLoDisplay,ActualLoDisplay);//validate actual and expect message
    }
    @Test
    public void verifyTheErrorMessage()
    {
        //Find log in Link and Click on Login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        WebElement Username = driver.findElement(By.name("Email"));//Find the Username field
        Username.sendKeys("kag1@gmail.com");
        WebElement password = driver.findElement(By.name("Password"));//Find the password field
        password.sendKeys("kag1234");
        WebElement loginbtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));//Find the login button field and click
        loginbtn.click();

        //This requirement is from document
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again. No customer account found";
        //Find the text element for unsuccessfully login and get the text
        WebElement actualMessage = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        String actualMsg = actualMessage.getText();
        System.out.println("Unsuccessfull Login Actual Message:  \n"+actualMsg);

        Assert.assertEquals("Message Is Not As Per Project Requirement:",expectedMessage,actualMsg);//validate actual and expect message
    }
    @After
    public void closedown(){
        closeBrowser();
    }
}