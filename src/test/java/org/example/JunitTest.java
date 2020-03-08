package org.example;


import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("1")
public class JunitTest {
    private static final Logger LOG = LoggerFactory.getLogger(JunitTest.class);

    @BeforeAll
    static void beforeAll() {
        LOG.info("Перед всеми");
    }

    @BeforeEach
    void beforeEach() {
        LOG.trace("Перед каждым");
    }

    @AfterAll
    static void afterAll() {
        LOG.error("После всех");
    }

    @AfterEach
    void afterEach() {
        LOG.warn("После каждого");
    }

    @Disabled
    @DisplayName("Первый тест")
    @Test
    void FirstTest() {
        LOG.info("All good");
        Assertions.fail("fail");
    }

    @DisplayName("Второй тест")
    @Test
    void SecondTest() {
        LOG.info("All dead");
    }
    @Tag("big")
    @DisplayName("Третий тест")
    @Test
    void ThirdTest() {
        LOG.info("All bad");
    }

    @DisplayName("Четвертый тест")
    @Test
    void FourthTest() {
        LOG.info("All dead again");
    }


}
