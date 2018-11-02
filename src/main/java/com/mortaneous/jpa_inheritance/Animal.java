package com.mortaneous.jpa_inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	protected String name;

	@Column(name = "reproduction_by")
	protected String reproductionBy;

	public Animal() {
	}

	public Animal(String name, String reproductionBy) {
		super();
		this.name = name;
		this.reproductionBy = reproductionBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReproductionBy() {
		return reproductionBy;
	}

	public void setReproductionBy(String reproductionBy) {
		this.reproductionBy = reproductionBy;
	}

}
