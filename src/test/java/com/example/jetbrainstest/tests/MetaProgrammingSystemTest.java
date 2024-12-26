package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.AllureLogger;
import com.example.jetbrainstest.MyExtension;
import com.example.jetbrainstest.pages.MetaProgrammingSystemPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtension.class)
public class MetaProgrammingSystemTest extends BaseTest {

    private MetaProgrammingSystemPage MetaProgrammingSystem;
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(MetaProgrammingSystemTest.class));


    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/mps/");
        MetaProgrammingSystem = new MetaProgrammingSystemPage(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка Download активна")
    @Tag("MpsPageButton")
    public void downloadButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfDownloadButtonIsClickable(), "Кнопка Download не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка EAP Program активна")
    @Tag("MpsPageButton")
    public void EapProgramButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfEapProgramButtonIsClickable(), "Кнопка EAP Program не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка Whats New активна")
    @Tag("MpsPageButton")
    public void WhatsNewButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfWhatsNewButtonIsClickable(), "Кнопка Whats New не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка How Its Works активна")
    @Tag("MpsPageButton")
    public void HowItsWorksButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfHowItsWorksButtonIsClickable(), "Кнопка How Its Works не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка Learn Mps активна")
    @Tag("MpsPageButton")
    public void LearnMpsButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfLearnMpsButtonIsClickable(), "Кнопка Learn Mps не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка Services активна")
    @Tag("MpsPageButton")
    public void ServicesButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfServicesButtonIsClickable(), "Кнопка Services не активна");
    }
}
