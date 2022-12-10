package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.ak.billing.HomePage;
import org.ak.billing.ShoppingApplication;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    public static WebDriver driver = new ChromeDriver();

    static HomePage objHome;

    @Given("^the user is at the website \"([^\"]*)\"$")
    public void theUserIsAtTheWebsite(String arg0){
        objHome = new HomePage(driver);
        objHome.getPage(driver, arg0);
        boolean headerFound = false;
        if (objHome.getHeaderList() > 0) {
            System.out.println("=== Page header found!");
            headerFound = true;
        }
        Assert.assertTrue(headerFound);
    }
    
    @Given("I have added a item to my shopping list on the website {string}")
    public void iHaveAddedAItemToMyShoppingListOnTheWebsite(String arg0) {
    }

    @Given("I have added items to my shopping bag on the website {string}")
    public void iHaveAddedItemsToMyShoppingBagOnTheWebsite(String arg1) {
    }

    @Given("I have added non grocery items to my shopping bag on the website {string}")
    public void iHaveAddedNonGroceryItemsToMyShoppingBagOnTheWebsite(String arg0) {
        
    }

    @Given("I have purchased items n my shopping list on the website {string}")
    public void iHavePurchasedItemsNMyShoppingListOnTheWebsite(String arg0) {
    }
}
