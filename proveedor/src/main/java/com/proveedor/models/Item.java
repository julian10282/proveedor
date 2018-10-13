package com.proveedor.models;


public class Item {

	private int id;
	
	private int requestId;
	
	private int offerId;

	private int quantity;

	private long price;

	private boolean enabled;

	private int productId;


	public Item(int id, int requestId, int offerId, int quantity, long price, boolean enabled, int productId) {
		super();
		this.id = id;
		this.requestId = requestId;
		this.offerId = offerId;
		this.quantity = quantity;
		this.price = price;
		this.enabled = enabled;
		this.productId = productId;
	}

	public Item() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", requestId=" + requestId + ", offerId=" + offerId + ", quantity=" + quantity
				+ ", price=" + price + ", enabled=" + enabled + ", productId=" + productId + "]";
	}
}
