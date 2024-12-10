package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.AllureLogger;
import com.example.jetbrainstest.pages.MetaProgrammingSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MetaProgrammingSystemTest extends BaseTest {

    private MetaProgrammingSystem MetaProgrammingSystem;
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(MetaProgrammingSystemTest.class));


    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/mps/");
        MetaProgrammingSystem = new MetaProgrammingSystem(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка скачивания активна")
    @Tag("MpsPageButton")
    public void buttonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfDownloadButtonIsClickable(), "Кнопка скачивания не активна");
        LOG.info("Кнопка скачивания активна");

    }
}

//P.S. Буду еще тесты потом накидывать