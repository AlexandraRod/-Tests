import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int shouldReturn100IfAmountIs900;
        {
            ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
            int amount = 900;

            int actual = service.remain(amount);
            int expected = 100;

            assertEquals(actual, expected);
        }

    }

    private void assertEquals(int expected, int actual) {
    }
}