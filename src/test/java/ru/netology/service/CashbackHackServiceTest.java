package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void AmountIsLessThan1000Test() {
        CashbackHackService service = new CashbackHackService();

        int expected = 766;
        int actual = service.remain(234);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void AmountIsMoreThan1000Test() {
        CashbackHackService service = new CashbackHackService();

        int expected = 655;
        int actual = service.remain(2345);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void AmountIs999Test() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void AmountIs1001Test() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void AmountIs1000Test() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }
}
