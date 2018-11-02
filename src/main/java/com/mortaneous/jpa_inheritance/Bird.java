package com.mortaneous.jpa_inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public class Bird extends Animal {
	private static final String DEFAULT_REPRODUCTION = "Egg";

	@Column(name = "can_fly")
	private boolean canFly;

	public Bird() {
	}

	public Bird(String name, boolean canFly) {
		super(name, DEFAULT_REPRODUCTION);
		this.canFly = canFly;
	}

	public Bird(String name, String reproductionBy, boolean canFly) {
		super(name, reproductionBy);
		this.canFly = canFly;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

}
