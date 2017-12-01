package pimpMyRide.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Car_ID")
	private Long id;

	@Column
	private String brand;
	@Column
	private String model;
	@Column
	private String buildyear;
	@Column
	private String motortype;
	@Column
	private String fuel;
	@Column
	private String opower;
	@Column
	private String otorque;
	@Column
	private String s1power;
	@Column
	private String s1torque;
	@Column
	private String ds1power;
	@Column
	private String ds1torque;
	@Column
	private String s1price;
	@Column
	private String s2power;
	@Column
	private String s2torque;
	@Column
	private String ds2power;
	@Column
	private String ds2torque;
	@Column
	private String s2price;
	@Column
	private String s3power;
	@Column
	private String s3torque;
	@Column
	private String ds3power;
	@Column
	private String ds3torque;
	@Column
	private String s3price;
	@Column
	private String s4power;
	@Column
	private String s4torque;
	@Column
	private String ds4power;
	@Column
	private String ds4torque;
	@Column
	private String s4price;
	@Column
	private String olcontrol;
	@Column
	private String orpmlimit;
	@Column
	private String ostime;
	@Column
	private String ds1lcontrol;
	@Column
	private String ds1rmplimit;
	@Column
	private String ds1stime;
	@Column
	private String ds1price;
	@Column
	private String ds2lcontrol;
	@Column
	private String ds2rmplimit;
	@Column
	private String ds2stime;
	@Column
	private String ds2price;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getBuildyear() {
		return buildyear;
	}


	public void setBuildyear(String buildyear) {
		this.buildyear = buildyear;
	}


	public String getMotortype() {
		return motortype;
	}


	public void setMotortype(String motortype) {
		this.motortype = motortype;
	}


	public String getFuel() {
		return fuel;
	}


	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	public String getOpower() {
		return opower;
	}


	public void setOpower(String opower) {
		this.opower = opower;
	}


	public String getOtorque() {
		return otorque;
	}


	public void setOtorque(String otorque) {
		this.otorque = otorque;
	}


	public String getS1power() {
		return s1power;
	}


	public void setS1power(String s1power) {
		this.s1power = s1power;
	}


	public String getS1torque() {
		return s1torque;
	}


	public void setS1torque(String s1torque) {
		this.s1torque = s1torque;
	}


	public String getDs1power() {
		return ds1power;
	}


	public void setDs1power(String ds1power) {
		this.ds1power = ds1power;
	}


	public String getDs1torque() {
		return ds1torque;
	}


	public void setDs1torque(String ds1torque) {
		this.ds1torque = ds1torque;
	}


	public String getS1price() {
		return s1price;
	}


	public void setS1price(String s1price) {
		this.s1price = s1price;
	}


	public String getS2power() {
		return s2power;
	}


	public void setS2power(String s2power) {
		this.s2power = s2power;
	}


	public String getS2torque() {
		return s2torque;
	}


	public void setS2torque(String s2torque) {
		this.s2torque = s2torque;
	}


	public String getDs2power() {
		return ds2power;
	}


	public void setDs2power(String ds2power) {
		this.ds2power = ds2power;
	}


	public String getDs2torque() {
		return ds2torque;
	}


	public void setDs2torque(String ds2torque) {
		this.ds2torque = ds2torque;
	}


	public String getS2price() {
		return s2price;
	}


	public void setS2price(String s2price) {
		this.s2price = s2price;
	}


	public String getS3power() {
		return s3power;
	}


	public void setS3power(String s3power) {
		this.s3power = s3power;
	}


	public String getS3torque() {
		return s3torque;
	}


	public void setS3torque(String s3torque) {
		this.s3torque = s3torque;
	}


	public String getDs3power() {
		return ds3power;
	}


	public void setDs3power(String ds3power) {
		this.ds3power = ds3power;
	}


	public String getDs3torque() {
		return ds3torque;
	}


	public void setDs3torque(String ds3torque) {
		this.ds3torque = ds3torque;
	}


	public String getS3price() {
		return s3price;
	}


	public void setS3price(String s3price) {
		this.s3price = s3price;
	}


	public String getS4power() {
		return s4power;
	}


	public void setS4power(String s4power) {
		this.s4power = s4power;
	}


	public String getS4torque() {
		return s4torque;
	}


	public void setS4torque(String s4torque) {
		this.s4torque = s4torque;
	}


	public String getDs4power() {
		return ds4power;
	}


	public void setDs4power(String ds4power) {
		this.ds4power = ds4power;
	}


	public String getDs4torque() {
		return ds4torque;
	}


	public void setDs4torque(String ds4torque) {
		this.ds4torque = ds4torque;
	}


	public String getS4price() {
		return s4price;
	}


	public void setS4price(String s4price) {
		this.s4price = s4price;
	}


	public String getOlcontrol() {
		return olcontrol;
	}


	public void setOlcontrol(String olcontrol) {
		this.olcontrol = olcontrol;
	}


	public String getOrpmlimit() {
		return orpmlimit;
	}


	public void setOrpmlimit(String orpmlimit) {
		this.orpmlimit = orpmlimit;
	}


	public String getOstime() {
		return ostime;
	}


	public void setOstime(String ostime) {
		this.ostime = ostime;
	}


	public String getDs1lcontrol() {
		return ds1lcontrol;
	}


	public void setDs1lcontrol(String ds1lcontrol) {
		this.ds1lcontrol = ds1lcontrol;
	}


	public String getDs1rmplimit() {
		return ds1rmplimit;
	}


	public void setDs1rmplimit(String ds1rmplimit) {
		this.ds1rmplimit = ds1rmplimit;
	}


	public String getDs1stime() {
		return ds1stime;
	}


	public void setDs1stime(String ds1stime) {
		this.ds1stime = ds1stime;
	}


	public String getDs1price() {
		return ds1price;
	}


	public void setDs1price(String ds1price) {
		this.ds1price = ds1price;
	}


	public String getDs2lcontrol() {
		return ds2lcontrol;
	}


	public void setDs2lcontrol(String ds2lcontrol) {
		this.ds2lcontrol = ds2lcontrol;
	}


	public String getDs2rmplimit() {
		return ds2rmplimit;
	}


	public void setDs2rmplimit(String ds2rmplimit) {
		this.ds2rmplimit = ds2rmplimit;
	}


	public String getDs2stime() {
		return ds2stime;
	}


	public void setDs2stime(String ds2stime) {
		this.ds2stime = ds2stime;
	}


	public String getDs2price() {
		return ds2price;
	}


	public void setDs2price(String ds2price) {
		this.ds2price = ds2price;
	}
	
	

}
