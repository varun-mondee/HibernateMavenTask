package com.mondee;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="cq")
public class Cheque extends Payment{

	
	@Column(name="chequetype")
	private String chequeType;

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	
}
