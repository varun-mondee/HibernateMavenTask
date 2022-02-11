package com.mondee;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value="payment")
public class Payment implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int PymentId;
	
	@Column(name="ammount")
	private double ammount;
	
	public int getPymentId() {
		return PymentId;
	}
	public void setPymentId(int pymentId) {
		PymentId = pymentId;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	

}
