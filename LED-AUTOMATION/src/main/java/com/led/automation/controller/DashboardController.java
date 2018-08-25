package com.led.automation.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;

import com.led.automation.model.Stock;
import com.led.automation.model.StockModel;

public class DashboardController extends SelectorComposer<Component>{
	
	private static final long serialVersionUID = 1L;
    
    final StockModel stockData = new StockModel();
     
    public ListModel<Stock> getStocks() {
        return new ListModelList<Stock>(stockData.getStocks());
    }

}
