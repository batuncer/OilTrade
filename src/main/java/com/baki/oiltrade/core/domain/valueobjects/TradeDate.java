package com.baki.oiltrade.core.domain.valueobjects;

import java.time.LocalDate;

public class TradeDate {
	
	private final LocalDate date;

    public TradeDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "TradeDate{" +
               "date=" + date +
               '}';
    }

}
