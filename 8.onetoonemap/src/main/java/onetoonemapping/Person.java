package onetoonemapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private String name;
	private long mobilenumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@OneToOne
	private PanCard pan;

	public PanCard getPan() {
		return pan;
	}

	public void setPan(PanCard pan) {
		this.pan = pan;
	}
}
