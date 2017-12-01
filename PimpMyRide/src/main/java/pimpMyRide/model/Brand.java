package pimpMyRide.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Brand {
	
	@Id
	@Column
	private String name;
	@Column
	private Blob logo;
	
	
	public Brand() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Blob getLogo() {
		return logo;
	}


	public void setLogo(Blob logo) {
		this.logo = logo;
	}
	
	
	
	
}
