package ru.netology;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRemain() {
        int shouldReturn100IfAmountIs900;
        {
            int amount = 900;
            ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();

            int actual = service.remain(amount);
            int expected = 100;

            assertEquals(actual, expected);
        }

    }

    public void assertEquals(int actual, int expected){
    }
}
