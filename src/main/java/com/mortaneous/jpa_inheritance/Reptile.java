package com.mortaneous.jpa_inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public class Reptile extends Animal {
	private static final String DEFAULT_REPRODUCTION = "Egg";

	public static final String MOTION_SLITHER = "slither";
	public static final String MOTION_CRAWL = "crawl";

	private String motion;

	public Reptile() {
	}

	public Reptile(String name, String motion) {
		super(name, DEFAULT_REPRODUCTION);
		this.motion = motion;
	}

	public Reptile(String name, String reproductionBy, String motion) {
		super(name, reproductionBy);
		this.motion = motion;
	}

	public String getMotion() {
		return motion;
	}

	public void setMotion(String motion) {
		this.motion = motion;
	}

}
