package com.baki.oiltrade.interfaces.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.baki.oiltrade.application.dto.TradeStrategyDTO;
import com.baki.oiltrade.application.exceptions.TradeStrategyNotFoundException;
import com.baki.oiltrade.application.mappers.TradeStrategyMapper;
import com.baki.oiltrade.core.domain.entities.TradeStrategy;
import com.baki.oiltrade.core.domain.services.TradeExecutionService;

@RestController
public class TradeController {
    private final TradeExecutionService tradeExecutionService;
    private final TradeStrategyMapper tradeStrategyMapper;

    public TradeController(TradeExecutionService tradeExecutionService, TradeStrategyMapper tradeStrategyMapper) {
        this.tradeExecutionService = tradeExecutionService;
        this.tradeStrategyMapper = tradeStrategyMapper;
    }

    @GetMapping("/trade/execute/{strategy}")
    public TradeStrategyDTO executeTrade(@PathVariable String strategy) {
        TradeStrategy tradeStrategy = null;  // Strateji bulma mantığı eklenmeli
        if (tradeStrategy == null) {
            throw new TradeStrategyNotFoundException("Strategy not found: " + strategy);
        }
        tradeExecutionService.executeStrategy(tradeStrategy);
        return tradeStrategyMapper.toDTO(tradeStrategy);
    }
}