package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final By personalAreaButton = By.xpath("//a[contains(@href,'/account')]");    // Кнопка "Личный кабинет"
    private final By enterAccountButton = By.xpath("//button[text()='Войти в аккаунт']");    //Кнопка "Войти в аккаунт"
    private final By bunsSwitch = By.xpath("//span[text()='Булки']");   //переключатель "Булки"
    private final By saucesSwitch = By.xpath("//span[text()='Соусы']");   //переключатель "Соусы"
    private final By fillingsSwitch = By.xpath("//span[text()='Начинки']");   //переключатель "Начинки"
    private final By bunsHeader = By.xpath("//h2[text()='Булки']");   //заголовок "Булки"
    private final By saucesHeader = By.xpath("//h2[text()='Соусы']");   //заголовок "Соусы"
    private final By fillingsHeader = By.xpath("//h2[text()='Начинки']");   //заголовок "Начинки"

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getLink() {
        return driver.getCurrentUrl();
    }
    public void clickPersonalAreaButton() {
        driver.findElement(personalAreaButton).click();
    }

    public void clickEnterAccountButton() {
        driver.findElement(enterAccountButton).click();
    }

    public void clickBunsSwitch() {
        driver.findElement(bunsSwitch).click();
    }

    public void clickSaucesSwitch() {
        driver.findElement(saucesSwitch).click();
    }

    public void clickFillingsSwitch() {
        driver.findElement(fillingsSwitch).click();
    }

    public boolean bunsHeaderIsDisplayed() {
        return driver.findElement(bunsHeader).isDisplayed();
    }
    public boolean saucesHeaderIsDisplayed() {
        return driver.findElement(saucesHeader).isDisplayed();
    }
    public boolean fillingsHeaderIsDisplayed() {
        return driver.findElement(fillingsHeader).isDisplayed();
    }
}
