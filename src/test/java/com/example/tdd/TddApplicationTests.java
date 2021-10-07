package com.example.tdd;

import com.example.tdd.Money.Bank;
import com.example.tdd.Money.Expression;
import com.example.tdd.Money.Franc;
import com.example.tdd.Money.Money;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TddApplicationTests {



    @Test
    public void testMultiplication() {
        Money five =  Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
    }
    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5,"CHF");
        assertEquals(new Franc(10,"CHF"),five.times(2));
        assertEquals(new Franc(15,"CHF"),five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));

    }

    @Test
    public void testCurrency(){
        assertEquals("USD",Money.dollar(1).currency());
        assertEquals("CHF",Money.franc(1).currency());
    }
//
//    @Test
//    public void testDifferentClassEquality(){
//        assertTrue(new Money(10,"CHF").equals(new Franc(10,"CHF")));
//    }

    @Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum,"USD");
        assertEquals(Money.dollar(10),reduced);
    }


}
