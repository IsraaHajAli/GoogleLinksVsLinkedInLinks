package LinkedInLogIn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LinkedInLocators {
    
    // email field
    @FindBy(id = "username")
    public WebElement userNameField;
    
    // password field
    @FindBy(id = "password")
    public WebElement passwordField;

    // sign in button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    // forgot button
    @FindBy(linkText="Forgot password?")
    public WebElement forgotButton;
    
    // toggle button
    @FindBy(id="password-visibility-toggle")
    public WebElement toggleButton;
    
    // google button
    @FindBy(className="nsm7Bb-HzV7m-LgbsSe-BPrWId")
    public WebElement googleButton;
    
    // apple button
    @FindBy(className="sign-in-with-apple-button__text")
    public WebElement appleButton;
    
    // profileIcon
    @FindBy(id="ember27")
    public WebElement profileIcon;
    
    // error message
    @FindBy(id="error-for-password")
    public WebElement errorMessage;
    
    // search box for LinkedIn
    @FindBy(xpath="//input[contains(@class, 'search-global-typeahead__input')]")
    public WebElement searchBox;

    // LinkedIn search results
    @FindBy(xpath = "//li[contains(@class, 'reusable-search__result-container')]")
    public List<WebElement> linkedInSearchResults;

    // LinkedIn results names
    @FindBy(xpath = "//span[contains(@class, 'entity-result__title-text')]/a")
    //@FindBy(xpath = ".//span[contains(@class, 'entity-result__title-text')]//span[contains(@dir, 'ltr')]")
    public List<WebElement> names;



    // LinkedIn results profiles links
    @FindBy(className = "app-aware-link")
    public List<WebElement> profilesLinks;

    // LinkedIn results positions
    @FindBy(className = "entity-result__primary-subtitle")
    public List<WebElement> resultPosition;

    // LinkedIn results locations
   // @FindBy(xpath = ".//div[contains(@class, 'entity-result__secondary-subtitle')]")
    @FindBy(className = "entity-result__secondary-subtitle")

    public List<WebElement> locations;
    
    // google search box
    @FindBy(name="q")
    public WebElement googleSearchBox;

    // google search results
    @FindBy(css="h3")
    public List<WebElement> googleSearchResults;

    // linkeIn filters
    @FindBy(xpath = "//li[contains(@class, 'search-reusables__primary-filter')]")
    public List<WebElement> linkedInFilters;


    @FindBy(className = "reusable-search__result-container")
    public List<WebElement> LinkedInResults;

}
