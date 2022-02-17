package com.comviva.app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="dt")
	private String date;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id=id;
	}
	
	public String getDescription() {
		return description;
	}
}
