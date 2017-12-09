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
	@Column
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
	private String s2dpower;
	@Column
	private String s2dtorque;
	@Column
	private String s2price;
	@Column
	private String s3power;
	@Column
	private String s3torque;
	@Column
	private String s3dpower;
	@Column
	private String s3dtorque;
	@Column
	private String s3price;
	@Column
	private String s4power;
	@Column
	private String s4torque;
	@Column
	private String s4dpower;
	@Column
	private String s4dtorque;
	@Column
	private String s4price;
	@Column
	private String dolcontrol;
	@Column
	private String dorpmlimit;
	@Column
	private String dostime;
	@Column
	private String ds1lcontrol;
	@Column
	private String ds1rpmlimit;
	@Column
	private String ds1stime;
	@Column
	private String ds1price;
	@Column
	private String ds2lcontrol;
	@Column
	private String ds2rpmlimit;
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

	public String getS2dpower() {
		return s2dpower;
	}

	public void setS2dpower(String s2dpower) {
		this.s2dpower = s2dpower;
	}

	public String getS2dtorque() {
		return s2dtorque;
	}

	public void setS2dtorque(String s2dtorque) {
		this.s2dtorque = s2dtorque;
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

	public String getS3dpower() {
		return s3dpower;
	}

	public void setS3dpower(String s3dpower) {
		this.s3dpower = s3dpower;
	}

	public String getS3dtorque() {
		return s3dtorque;
	}

	public void setS3dtorque(String s3dtorque) {
		this.s3dtorque = s3dtorque;
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

	public String getS4dpower() {
		return s4dpower;
	}

	public void setS4dpower(String s4dpower) {
		this.s4dpower = s4dpower;
	}

	public String getS4dtorque() {
		return s4dtorque;
	}

	public void setS4dtorque(String s4dtorque) {
		this.s4dtorque = s4dtorque;
	}

	public String getS4price() {
		return s4price;
	}

	public void setS4price(String s4price) {
		this.s4price = s4price;
	}

	public String getDolcontrol() {
		return dolcontrol;
	}

	public void setDolcontrol(String dolcontrol) {
		this.dolcontrol = dolcontrol;
	}

	public String getDorpmlimit() {
		return dorpmlimit;
	}

	public void setDorpmlimit(String dorpmlimit) {
		this.dorpmlimit = dorpmlimit;
	}

	public String getDostime() {
		return dostime;
	}

	public void setDostime(String dostime) {
		this.dostime = dostime;
	}

	public String getDs1lcontrol() {
		return ds1lcontrol;
	}

	public void setDs1lcontrol(String ds1lcontrol) {
		this.ds1lcontrol = ds1lcontrol;
	}

	public String getDs1rpmlimit() {
		return ds1rpmlimit;
	}

	public void setDs1rpmlimit(String ds1rpmlimit) {
		this.ds1rpmlimit = ds1rpmlimit;
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

	public String getDs2rpmlimit() {
		return ds2rpmlimit;
	}

	public void setDs2rpmlimit(String ds2rpmlimit) {
		this.ds2rpmlimit = ds2rpmlimit;
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
