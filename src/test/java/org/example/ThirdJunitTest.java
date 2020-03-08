package org.example;


import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("3")
public class ThirdJunitTest {
    private static final Logger LOG = LoggerFactory.getLogger(ThirdJunitTest.class);

    @BeforeAll
    static void beforeAll() {
        LOG.info("Перед всеми тестами");
    }

    @BeforeEach
    void beforeEach() {
        LOG.info("Перед каждым тестом");
    }

    @AfterAll
    static void afterAll() {
        LOG.info("После всех тестов");
    }

    @AfterEach
    void afterEach() {
        LOG.info("После каждого теста");
    }

    @DisplayName("Первый тест третьего класса")
    @Test
    void FirstTest3() {
        LOG.info("All good3");
    }

    @DisplayName("Второй тест третьего класса")
    @Test
    void SecondTest3() {
        LOG.info("All dead3");
    }

    @DisplayName("Третий тест третьего класса")
    @Test
    void ThirdTest3() {
        LOG.info("All bad3");
    }

    @DisplayName("Четвертый тест третьего класса")
    @Test
    void FourthTest3() {
        LOG.info("All dead again3");
    }


}
