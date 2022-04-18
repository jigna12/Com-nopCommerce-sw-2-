/*4. Write down the following test into ‘TopMenuTest’ class
1. userShouldNavigateToComputerPageSuccessfully
* click on the ‘Computers’ Tab
* Verify the text ‘Computers’
2. userShouldNavigateToElectronicsPageSuccessfully
* click on the ‘Electronics’ Tab
* Verify the text ‘Electronics’
3. userShouldNavigateToApparelPageSuccessfully
* click on the ‘Apparel’ Tab
* Verify the text ‘Apparel’
4.
userShouldNavigateToDigitalDownloadsPageSuccessfully
* click on the ‘Digital downloads’ Tab
* Verify the text ‘Digital downloads’
5. userShouldNavigateToBooksPageSuccessfully
* click on the ‘Books’ Tab
* Verify the text ‘Books’
6. userShouldNavigateToJewelryPageSuccessfully
* click on the ‘Jewelry’ Tab
* Verify the text ‘Jewelry’
7. userShouldNavigateToGiftCardsPageSuccessfully
* click on the ‘Gift Cards’ Tab
* Verify the text ‘Gift Cards’*/

package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest
{
    String BaseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }
    @Test//1
    public void userShouldNavigateToComputerPageSuccessfully()
    {
        //Find the Computer link and click
        WebElement Comlink = driver.findElement(By.linkText("Computers"));
        Comlink.click();

        //This requirement is from document
        String ExpectedTab = "Computers";
        //Find the text element for computer Tab and get the text
        WebElement actualTab =driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        String actTab = actualTab.getText();
        System.out.println("Actual Tab Name Is:" +actTab);
        //Validate actual and expected message
        Assert.assertEquals("Tab Name Is Not As Per Project Requirement:",ExpectedTab,actTab);
    }
    @Test//2
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        //Find the Electronics link and click
        WebElement Electlink = driver.findElement(By.linkText("Electronics"));
        Electlink.click();

        //This requirement is from document
        String ExpectedTab = "Electronics";
        //Find the text element for Electronics Tab and get the text
        WebElement actualTab =driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        String actTab = actualTab.getText();
        System.out.println("Actual Tab Name Is:" +actTab);
        //Validate actual and expected message
        Assert.assertEquals("Tab Name Is Not As Per Project Requirement:",ExpectedTab,actTab);
    }
    @Test//3
    public void userShouldNavigateToApparelPageSuccessfully()
    {
        //Find the Apparel link and click
        WebElement Apparellink = driver.findElement(By.linkText("Apparel"));
        Apparellink.click();

        //This requirement is from document
        String ExpectedTab = "Apparel";
        //Find the text element for Apparel Tab and get the text
        WebElement actualTab =driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        String actTab = actualTab.getText();
        System.out.println("Actual Tab Name Is:" +actTab);
        //Validate actual and expected message
        Assert.assertEquals("Tab Name Is Not As Per Project Requirement:",ExpectedTab,actTab);
    }
    @Test//4
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
    {
        //Find the Digital downloads link and click
        WebElement Digilink = driver.findElement(By.linkText("Digital downloads"));
        Digilink.click();

        //This requirement is from document
        String ExpectedTab = "Digital downloads";
        //Find the text element for Digital downloads Tab and get the text
        WebElement actualTab =driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        String actTab = actualTab.getText();
        System.out.println("Actual Tab Name Is:" +actTab);
        //Validate actual and expected message
        Assert.assertEquals("Tab Name Is Not As Per Project Requirement:",ExpectedTab,actTab);
    }
    @Test//5
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        //Find the Books link and click
        WebElement Bookslink = driver.findElement(By.linkText("Books"));
        Bookslink.click();

        //This requirement is from document
        String ExpectedTab = "Books";
        //Find the text element for Books Tab and get the text
        WebElement actualTab =driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        String actTab = actualTab.getText();
        System.out.println("Actual Tab Name Is:" +actTab);
        //Validate actual and expected message
        Assert.assertEquals("Tab Name Is Not As Per Project Requirement:",ExpectedTab,actTab);
    }
    @Test//6
    public void userShouldNavigateToJewelryPageSuccessfull()
    {
        //Find the Jewelry link and click
        WebElement Jewelrylink = driver.findElement(By.linkText("Jewelry"));
        Jewelrylink.click();

        //This requirement is from document
        String ExpectedTab = "Jewelry";
        //Find the text element for Jewelry Tab and get the text
        WebElement actualTab =driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        String actTab = actualTab.getText();
        System.out.println("Actual Tab Name Is:" +actTab);
        //Validate actual and expected message
        Assert.assertEquals("Tab Name Is Not As Per Project Requirement:",ExpectedTab,actTab);
    }
    @Test//7
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        //Find the Gift Cards link and click
        WebElement Giftlink = driver.findElement(By.linkText("Gift Cards"));
        Giftlink.click();

        //This requirement is from document
        String ExpectedTab = "Gift Cards";
        //Find the text element for Gift Cards Tab and get the text
        WebElement actualTab =driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        String actTab = actualTab.getText();
        System.out.println("Actual Tab Name Is:" +actTab);
        //Validate actual and expected message
        Assert.assertEquals("Tab Name Is Not As Per Project Requirement:",ExpectedTab,actTab);
    }
    @After
    public void closedown(){
       closeBrowser();
    }
}