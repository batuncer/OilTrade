package com.baki.oiltrade.core.domain.usecases;

import org.springframework.stereotype.Component;

import com.baki.oiltrade.core.domain.entities.TradeStrategy;
import com.baki.oiltrade.core.domain.services.TradeExecutionService;

@Component
public class CreateStrategyUseCase {
	
	   private TradeExecutionService tradeExecutionService;

	    public CreateStrategyUseCase(TradeExecutionService tradeExecutionService) {
	        this.tradeExecutionService = tradeExecutionService;
	    }

	    public void execute(TradeStrategy strategy) {
	        // business logic
	        tradeExecutionService.executeStrategy(strategy);
	    }

}
