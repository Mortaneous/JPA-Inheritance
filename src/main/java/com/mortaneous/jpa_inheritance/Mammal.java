package com.mortaneous.jpa_inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public class Mammal extends Animal {
	private static final String DEFAULT_REPRODUCTION = "Birth";
	
	@Column(name = "leg_count")
	private int legCount;

	public Mammal() {
	}

	public Mammal(String name, int legCount) {
		super(name, DEFAULT_REPRODUCTION);
		this.legCount = legCount;
	}

	public Mammal(String name, String reproductionBy, int legCount) {
		super(name, reproductionBy);
		this.legCount = legCount;
	}

	public int getLegCount() {
		return legCount;
	}

	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}

}
