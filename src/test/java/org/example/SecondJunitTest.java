package org.example;


import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Disabled("Skip all")
@Tag("2")
public class SecondJunitTest {
    private static final Logger LOG = LoggerFactory.getLogger(SecondJunitTest.class);

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

    @Disabled
    @DisplayName("Первый тест второго класса")
    @Test
    void FirstTest2() {
        LOG.info("All good2");
        Assertions.fail("fail");
    }

    @DisplayName("Второй тест второго класса")
    @Test
    void SecondTest2() {
        LOG.info("All dead2");
    }

    @DisplayName("Третий тест второго класса")
    @Test
    void ThirdTest2() {
        LOG.info("All bad2");
    }

    @DisplayName("Четвертый тест второго класса")
    @Test
    void FourthTest2() {
        LOG.info("All dead again2");
    }


}
