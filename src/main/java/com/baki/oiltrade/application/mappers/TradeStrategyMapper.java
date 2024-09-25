package com.baki.oiltrade.application.mappers;

import com.baki.oiltrade.application.dto.TradeStrategyDTO;
import com.baki.oiltrade.core.domain.entities.TradeStrategy;

public class TradeStrategyMapper {
	
	   public TradeStrategyDTO toDTO(TradeStrategy strategy) {
	        TradeStrategyDTO dto = new TradeStrategyDTO();
	        dto.setStrategyName(strategy.getStrategyName());
	        dto.setDetails("Strategy details");
	        return dto;
	    }

}
