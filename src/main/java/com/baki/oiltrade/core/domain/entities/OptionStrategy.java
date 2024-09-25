package com.baki.oiltrade.core.domain.entities;

public class OptionStrategy extends TradeStrategy {
    public OptionStrategy() {
        super("Option Strategy");
    }

    @Override
    public void execute() {
        System.out.println("Executing Option strategy...");
    }
}
