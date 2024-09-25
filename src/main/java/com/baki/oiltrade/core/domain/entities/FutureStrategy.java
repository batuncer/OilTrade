package com.baki.oiltrade.core.domain.entities;

public class FutureStrategy extends TradeStrategy{
    public FutureStrategy() {
        super("Future Strategy");
    }

    @Override
    public void execute() {
        System.out.println("Executing future strategy...");
    }
}
