package com.example.tdd.Money;

public  class Money {
    protected int amount;
    protected String currency;

    public Money times(int multiplier){
        return new Money(amount*multiplier,currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){
        return currency;
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    public static Money dollar(int amount){
        return new Dollar(amount,"USD");
    }

    public static Franc franc(int amount){
        return new Franc(amount,"CHF");
    }




}
