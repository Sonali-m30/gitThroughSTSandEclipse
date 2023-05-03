package com.web.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AddressInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int aid;
	private String address;
	private String district;
	private String state;
	private String pinCode;
	
}
