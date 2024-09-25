package com.baki.oiltrade.core.domain.valueobjects;

public class TradeAmount {
	
	private final double amount;

    public TradeAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Trade amount cannot be negative.");
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "TradeAmount{" +
               "amount=" + amount +
               '}';
    }

}
