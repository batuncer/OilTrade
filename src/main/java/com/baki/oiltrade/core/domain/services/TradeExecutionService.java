package com.baki.oiltrade.core.domain.services;

import com.baki.oiltrade.core.domain.entities.TradeStrategy;

public class TradeExecutionService {
	

	    public void executeStrategy(TradeStrategy strategy) {
	        strategy.execute();
	    }

}
