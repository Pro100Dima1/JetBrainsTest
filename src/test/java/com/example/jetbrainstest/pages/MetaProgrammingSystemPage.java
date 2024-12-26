package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

// page_url = https://www.jetbrains.com/mps/
public class MetaProgrammingSystemPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(MetaProgrammingSystemPage.class));
    WebDriver driver;

    @FindBy(css = "a[data-test='button' ][href ='/mps/downloadd/']")
    private WebElement downloadButton;

    @FindBy(css = "a[href ='/mps/nextversion/']")
    private WebElement eapProgramButton;

    @FindBy(css = "a[href ='/mps/whatsnew/']")
    private WebElement whatsNewButton;

    @FindBy(css = "a[href ='/mps/concepts/']")
    private WebElement howItsWorksButton;

    @FindBy(css = "a[href ='/mps/learn/']")
    private WebElement learnMpsButton;

    @FindBy(css = "a[href ='/mps/support/']")
    private WebElement servicesButton;

    // @FindBy(css = "button[data-test='dropdown-trigger'][1]>")//button)[3]")
    //private WebElement searchButton;





    public Boolean checkIfDownloadButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Download");
        return downloadButton.isEnabled();
    }
    public Boolean checkIfEapProgramButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки EAP Program");
        return eapProgramButton.isEnabled();
    }
    public Boolean checkIfWhatsNewButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Whats New");
        return whatsNewButton.isEnabled();
    }
    public Boolean checkIfHowItsWorksButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки How Its Works");
        return howItsWorksButton.isEnabled();
    }
    public Boolean checkIfLearnMpsButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Learn Mps");
        return learnMpsButton.isEnabled();
    }
    public Boolean checkIfServicesButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Services");
        return servicesButton.isEnabled();
    }

    public MetaProgrammingSystemPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
