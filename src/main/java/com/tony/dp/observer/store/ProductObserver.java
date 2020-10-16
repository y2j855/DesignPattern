package com.tony.dp.observer.store;

public interface ProductObserver {

	void onPublished(Product product);

	void onPriceChanged(Product product);

	void onEvent(Event event);
}
