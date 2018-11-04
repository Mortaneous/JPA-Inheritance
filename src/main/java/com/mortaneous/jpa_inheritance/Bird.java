package com.mortaneous.jpa_inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public class Bird extends Animal {
	private static final String DEFAULT_REPRODUCTION = "Egg";
	public static final String CAN_FLY = "Yes";
	public static final String CANNOT_FLY = "No";

	@Column(name = "can_fly")
	private String canFly;

	public Bird() {
	}

	public Bird(String name, String canFly) {
		super(name, DEFAULT_REPRODUCTION);
		this.canFly = canFly;
	}

	public Bird(String name, String reproductionBy, String canFly) {
		super(name, reproductionBy);
		this.canFly = canFly;
	}

	public String isCanFly() {
		return canFly;
	}

	public void setCanFly(String canFly) {
		this.canFly = canFly;
	}

}
