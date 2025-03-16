package ru.netology.service;

        import org.junit.Test;

        import static org.junit.Assert.*;

public class CashbackHackServiceTest {


    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAmountAbove1000() {
        int expected = 0;

        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}
