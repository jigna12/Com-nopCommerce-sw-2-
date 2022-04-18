/*5. Write down the following test into ‘RegisterTest’ class
1. userShouldNavigateToRegisterPageSuccessfully
* click on the ‘Register’ link
* Verify the text ‘Register’
2. userSholdRegisterAccountSuccessfully
* click on the ‘Register’ link
* Select gender radio button
* Enter First name
* Enter Last name
* Select Day Month and Year
* Enter Email address
* Enter Password
* Enter Confirm password
* Click on REGISTER button
* Verify the text 'Your registration completed’*/

package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest
{
    String BaseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }
    @Test//1
    public void userShouldNavigateToRegisterPageSuccessfully()
    {
        //Find the Register link and click on Register link
        WebElement Registerlink = driver.findElement(By.linkText("Register"));
        Registerlink.click();

        //This requirement is from document
        String ExpectedTab = "Register";
        //Find the text element for Register Tab and get the text
        WebElement actualTab =driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        String actTab = actualTab.getText();
        System.out.println("Actual Tab Name Is:" +actTab);
        //Validate actual and expected message
        Assert.assertEquals("Tab Name Is Not As Per Project Requirement:",ExpectedTab,actTab);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //Find the Register link and click on Register link
        WebElement Registerlink = driver.findElement(By.linkText("Register"));
        Registerlink.click();
        //Find the gender radio button element
        WebElement Genderbut1 = driver.findElement(By.id("gender-male"));
        Genderbut1.click();      //Checking gender radio button
        WebElement Genderbut2 = driver.findElement(By.id("gender-female"));
        Genderbut2.click();     //Checking gender radio button

        //Find the first name element and enter name
        WebElement FirstName = driver.findElement(By.id("FirstName"));
        FirstName.sendKeys("Krishna");
        //Find the last name element and enter name
        WebElement LastName = driver.findElement(By.id("LastName"));
        LastName.sendKeys("Gothadiya");

        //Find the Day element and Enter Day
        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        Day.sendKeys("15");
        //Find the Month element and Enter Month
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        Month.sendKeys("July");
        //Find the Year element and Enter Year
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));
        Year.sendKeys("2010");

        //Find the Emailid element and enter emailid
        WebElement Emailid = driver.findElement(By.id("Email"));
        Emailid.sendKeys("kag6@gmail.com");//Please Enter kag7,kag8....email for each register

        //Find the password element and Enter password
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("kag123");

        //Find the Confirm password element and Enter Confirm password
        WebElement Cpassword = driver.findElement(By.name("ConfirmPassword"));
        Cpassword.sendKeys("kag123");

        //Find the Register Button element and click
        WebElement RegBut = driver.findElement(By.name("register-button"));
        RegBut.click();

        //This requirement is from document
        String ExpectedTab = "Your registration completed";
        //Find the text element for Register Tab and get the text
        WebElement actualTab =driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actTab = actualTab.getText();
        System.out.println("Actual Registration Successfull message :" +actTab);
        //Validate actual and expected message
        Assert.assertEquals("Registration completion is not as per Project Requirement:",ExpectedTab,actTab);

    }
    @After
    public void closedown(){
       // closeBrowser();
    }
}
