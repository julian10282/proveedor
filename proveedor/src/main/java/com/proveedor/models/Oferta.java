package com.proveedor.models;

import java.util.List;

public class Oferta {

	private int id;

	private int requestId;

	private float total;
	
	private boolean enabled;
	
	private int supplierDocument;
	
	private String name;

	private String description;
	
	private List<Item> items;

	public Oferta(int id, int requestId, float total, boolean enabled, int supplierDocument, String name,
			String description, List<Item> items) {
		super();
		this.id = id;
		this.requestId = requestId;
		this.total = total;
		this.enabled = enabled;
		this.supplierDocument = supplierDocument;
		this.name = name;
		this.description = description;
		this.items = items;
	}

	public Oferta() {
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

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getSupplierDocument() {
		return supplierDocument;
	}

	public void setSupplierDocument(int supplierDocument) {
		this.supplierDocument = supplierDocument;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Oferta [id=" + id + ", requestId=" + requestId + ", total=" + total + ", enabled=" + enabled
				+ ", supplierDocument=" + supplierDocument + ", name=" + name + ", description=" + description
				+ ", items=" + items + "]";
	}
	
}
