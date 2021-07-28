package com.nehajha.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private long turnover;
	
	private String ceo;
	
	private String about;
	
	private boolean listedinstockexchange;
	
	@ManyToOne
	private Sector sector;

	public Company(int id, String name, long turnover, String ceo, String about, boolean listedinstockexchange,
			Sector sector) {
		super();
		this.id = id;
		this.name = name;
		this.turnover = turnover;
		this.ceo = ceo;
		this.about = about;
		this.listedinstockexchange = listedinstockexchange;
		this.sector = sector;
	}

	

	public Company() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTurnover() {
		return turnover;
	}

	public void setTurnover(long turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public boolean isListedinstockexchange() {
		return listedinstockexchange;
	}

	public void setListedinstockexchange(boolean listedinstockexchange) {
		this.listedinstockexchange = listedinstockexchange;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	
}
