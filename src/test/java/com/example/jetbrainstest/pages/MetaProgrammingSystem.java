package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import com.example.jetbrainstest.pages.youtrackpages.YouTrackPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// page_url = https://www.jetbrains.com/mps/
public class MetaProgrammingSystem {
    private final Logger LOG = LoggerFactory.getLogger(IntellijIdeaPage.class);
    WebDriver driver;

    @FindBy(css = "a[data-test='button' ][href ='/mps/download/']")

    private WebElement downloadButton;
    @Step("Проверка доступности кнопки загрузки")
    public Boolean checkIfDownloadButtonIsClickable() {
        LOG.info("Кнопка загрузки доступна");
        return downloadButton.isEnabled();
    }

    public MetaProgrammingSystem(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
