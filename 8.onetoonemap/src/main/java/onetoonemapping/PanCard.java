package onetoonemapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PanCard {
	@Id
	private String pannumber;
	private String name;

	public String getPannumber() {
		return pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	private String dob;
}
