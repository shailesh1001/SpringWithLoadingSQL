package com.soding.taskstore.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

	private Long id;
	private String name;
	private String description;
	private Date dateCreated;
	private Date dateUpated;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	@Column(name = "date_created")
	public Date getDateCreated() {
		return dateCreated;
	}

	@Column(name = "date_updated")
	public Date getDateUpated() {
		return dateUpated;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setDateUpated(Date dateUpated) {
		this.dateUpated = dateUpated;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
