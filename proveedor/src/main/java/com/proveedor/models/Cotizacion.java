package com.proveedor.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Cotizacion {
	
	@Override
	public String toString() {
		return "Cotizacion [id=" + id + ", clientDocument=" + clientDocument + ", startDate=" + startDate
				+ ", finalDate=" + finalDate + ", enabled=" + enabled + ", name=" + name + ", description="
				+ description + "]";
	}

	private int id;

	private int clientDocument;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="America/Bogota")
	private Date startDate;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="America/Bogota")
	private Date finalDate;
	
	private boolean enabled;
	
	private String name;

	private String description;

	public Cotizacion(int id, int clientDocument, Date startDate, Date finalDate, boolean enabled, String name,
			String description) {
		super();
		this.id = id;
		this.clientDocument = clientDocument;
		this.startDate = startDate;
		this.finalDate = finalDate;
		this.enabled = enabled;
		this.name = name;
		this.description = description;
	}

	public Cotizacion() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientDocument() {
		return clientDocument;
	}

	public void setClientDocument(int clientDocument) {
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

//	private List<ItemEntity> itemEntities;
	
	
}
