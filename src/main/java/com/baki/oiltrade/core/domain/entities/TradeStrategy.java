package com.baki.oiltrade.core.domain.entities;

public abstract class TradeStrategy {
	
	protected String strategyName;
	
	public TradeStrategy(String strategyName) {
		this.strategyName = strategyName;
	}
	
	public String getStrategyName() {
		return strategyName;
	}
	
	public abstract void execute();

}
