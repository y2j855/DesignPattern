package com.tony.dp.observer.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store implements ProductObservable{

	private List<ProductObserver> observers = new ArrayList<>();
	private Map<String, Product> products = new HashMap<>();

	@Override
	public void addObserver(ProductObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(ProductObserver observer) {
		this.observers.remove(observer);
	}

	public void addNewProduct(String name, double price) {
		Product p = new Product(name, price);
		Event event = new ProductEvent(System.currentTimeMillis(),"add product",this);
		products.put(p.getName(), p);
		observers.forEach(o -> o.onPublished(p));
		observers.forEach(o -> o.onEvent(event));
	}

	public void setProductPrice(String name, double price) {
		Product p = products.get(name);
		p.setPrice(price);
		observers.forEach(o -> o.onPriceChanged(p));
	}

	public Map<String, Product> getProducts() {
		return products;
	}
}
