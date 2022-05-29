package com.github.common.api.param;

import java.io.Serializable;

public class OrderLimit implements Serializable{

	private static final long serialVersionUID = 8252849092537281777L;

	private Order order = null;
	private Limit limit = null;
	
	public OrderLimit(){}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Limit getLimit() {
		return limit;
	}

	public void setLimit(Limit limit) {
		this.limit = limit;
	}
	
	public OrderLimit limit(int length){
		setLimit(new Limit(length));
		return this;
	}
	
	public OrderLimit limit(int offset,int length){
		setLimit(new Limit(offset, length));
		return this;
	}
	
	public OrderLimit orderBy(String item,boolean desc){
		setOrder(new Order(item, desc));
		return this;
	}
	
	public OrderLimit orderBy(String item){
		setOrder(new Order(item,false));
		return this;
	}
	
	public static OrderLimit create(){
		return new OrderLimit();
	}
	
			
}
