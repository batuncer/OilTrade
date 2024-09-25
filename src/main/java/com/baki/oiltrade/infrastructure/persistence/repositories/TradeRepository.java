package com.baki.oiltrade.infrastructure.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baki.oiltrade.infrastructure.persistence.entities.TradeStrategyEntity;

public interface TradeRepository extends JpaRepository<TradeStrategyEntity, Long> {

}
