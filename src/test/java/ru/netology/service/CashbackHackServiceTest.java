package ru.netology.service;

import org.junit.Test;

import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainIfAmountIsLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldRemainIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldRemainIfAmountIsMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1600;

        int actual = service.remain(amount);
        int expected = 400;

        Assert.assertEquals(expected,actual);
    }
}