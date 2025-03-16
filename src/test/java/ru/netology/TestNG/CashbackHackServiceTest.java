package ru.netology.TestNG;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    public CashbackHackService service;

    public CashbackHackServiceTest() {
        service = new CashbackHackService();
    }


    @Test
    public void shouldAmountEqual1000() {
        int amount = 550;

        int expected = 450 ;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountAbove1000() {
        int amount = 1200;

        int expected = 800;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountBelow1000() {
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual , expected);
    }

}
