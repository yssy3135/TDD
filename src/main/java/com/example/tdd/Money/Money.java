package com.example.tdd.Money;

public abstract class Money {
    protected int amount;
    public abstract Money times(int muiltiplier);
    protected String currency;


    public Money(int amount,String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){
        return currency;
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(object.getClass());
    }

    public static Money dollar(int amount){
        return new Dollar(amount,"USD");
    }

    public static Franc franc(int amount){
        return new Franc(amount,"CHF");
    }



}
