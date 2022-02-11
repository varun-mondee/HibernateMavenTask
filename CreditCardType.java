package com.mondee;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="cc")
public class CreditCardType extends Payment {
	

	@Column(name = "creditcardtype")
	private String creditCardType;

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}
	

}
