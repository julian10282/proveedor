package com.proveedor.models;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Cotizacion {
	
	@Override
	public String toString() {
		return "Cotizacion [id=" + id + ", clientDocument=" + clientDocument + ", startDate=" + startDate
				+ ", finalDate=" + finalDate + ", enabled=" + enabled + ", name=" + name + ", description="
				+ description + ", items=" + items + "]";
	}

	private int id;

	private String clientDocument;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="America/Bogota")
	private Date startDate;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="America/Bogota")
	private Date finalDate;
	
	private boolean enabled;
	
	private String name;

	private String description;
	
	private List<Item> items;

	public Cotizacion(int id, String clientDocument, Date startDate, Date finalDate, boolean enabled, String name,
			String description, List<Item> items) {
		super();
		this.id = id;
		this.clientDocument = clientDocument;
		this.startDate = startDate;
		this.finalDate = finalDate;
		this.enabled = enabled;
		this.name = name;
		this.description = description;
		this.items = items;
	}

	public Cotizacion() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientDocument() {
		return clientDocument;
	}

	public void setClientDocument(String clientDocument) {
		this.clientDocument = clientDocument;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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

	
	
}
