package com.example.tdd.Money;

public interface Expression {
    Money reduce(Bank bank,String to);

    Expression plus(Expression addend);
}
