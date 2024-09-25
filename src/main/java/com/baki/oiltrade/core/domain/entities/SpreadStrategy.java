package com.baki.oiltrade.core.domain.entities;

public class SpreadStrategy extends TradeStrategy{
	

 

	public SpreadStrategy(String strategyName) {
		super(strategyName);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void execute() {
        System.out.println("Executing spread strategy...");
    }

}
